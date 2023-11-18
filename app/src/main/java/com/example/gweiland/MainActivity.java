package com.example.gweiland;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {

    RecyclerView rl1;
    Button filter;
    TextView price,bname,plusminus,symbol;
    String symbols;
    Double MARKETCAP,pricedouble,volume;
    int id;
    private List<Double> bitcoinPricesUSD = new ArrayList<>();
    private List<Double> quote = new ArrayList<>();
    private RecyclerviewAdapter cryptoAdapter;
    private List<CryptocurrencyResponse.CryptoItem> cryptoItems;

    private List<String> logoUrls = new ArrayList<>();
    Map<String, ApiResponse.CryptoItem> logodata;

    private List<ApiResponse.CryptoItem> cryptoItemList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getdata();
        rl1 = findViewById(R.id.rl1);
        price = findViewById(R.id.prize);
        bname = findViewById(R.id.name);
        plusminus = findViewById(R.id.plusminus);
        symbol = findViewById(R.id.symbol);
        rl1.setLayoutManager(new LinearLayoutManager(this));
        filter = findViewById(R.id.filter);
        cryptoItems = new ArrayList<>();

    }


    private void getdata() {



        Retrofit retrofit = ClientInterface.getRetrofitInstance();
        ApiInterface api = retrofit.create(ApiInterface.class);
        Call<CryptocurrencyResponse> call = api.getCryptoData();
        call.enqueue(new Callback<CryptocurrencyResponse>() {
            @Override
            public void onResponse(@NonNull Call<CryptocurrencyResponse> call, @NonNull Response<CryptocurrencyResponse> response) {
                if (response.isSuccessful()) {
                    CryptocurrencyResponse cryptoResponse = response.body();
                    cryptoItems = new ArrayList<>();
                    if (cryptoResponse != null && cryptoResponse.getData() != null) {
                        cryptoItems = cryptoResponse.getData();


                    }
                        bitcoinPricesUSD = new ArrayList<>();

                    quote = new ArrayList<>();


                    if (cryptoResponse != null && cryptoResponse.getData() != null) {
                        for (CryptocurrencyResponse.CryptoItem cryptoItem : cryptoResponse.getData()) {
                            id = cryptoItem.getId();
                            pricedouble = cryptoItem.getQuote().getUSD().getPrice();
                            volume = cryptoItem.getQuote().getUSD().getVolume_change_24h();
                            Log.d("pricedouble","pricedouble"+pricedouble);
                            Log.d("volume","volume"+volume);

                            if ("Bitcoin".equals(cryptoItem.getName())) {
                                double bitcoinPriceUSD = cryptoItem.getQuote().getUSD().getPrice();
                                String name = cryptoItem.getName();
                                String usd = String.valueOf(bitcoinPriceUSD);
                                symbols = cryptoItem.getSymbol();

                                double percent = cryptoItem.getQuote().getUSD().getPercent_change_24h();
                                Log.d("percent","percent"+percent);
                                String percentString = String.valueOf(percent);
                                bitcoinPricesUSD.add(bitcoinPriceUSD);
                                price.setText(usd);
                                bname.setText(name);
                                plusminus.setText(percentString);

                                symbol.setText(symbols);
                                cryptoAdapter = new RecyclerviewAdapter(MainActivity.this,bitcoinPricesUSD,cryptoItems,logoUrls);
                                rl1.setAdapter(cryptoAdapter);
                                Log.d("bitcoinPriceUSD","bitcoinPriceUSD"+bitcoinPriceUSD);
                                Log.d("bitcoinPriceUSDArray","bitcoinPriceUSDArray"+bitcoinPricesUSD);
                                // Do something with Bitcoin prices
                            } else if ("Ethereum".equals(cryptoItem.getName())) {

                                // Do something with Ethereum prices
                            }
                        }
                    }

                }
            }
            @Override
            public void onFailure(@NonNull Call<CryptocurrencyResponse> call, @NonNull Throwable t) {
                t.printStackTrace();
                Log.d("error", t.getMessage());
            }
        });


    }





}