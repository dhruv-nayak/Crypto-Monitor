package com.example.gweiland;

import android.app.Activity;
import android.content.Context;
import android.speech.tts.TextToSpeech;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class RecyclerviewAdapter extends RecyclerView.Adapter<RecyclerviewAdapter.ViewHolder> {
    Context context;
    Activity activity;
    double priceint,percentint,market_cap;
    String pricestring,percentstring,marketcapString;
    private List<Double> bitcoinPricesUSD = new ArrayList<>();
    private List<CryptocurrencyResponse.CryptoItem> cryptoItems;

    private List<ApiResponse.CryptoItem> cryptoItemList;
    private List<String> logoUrls;
    public RecyclerviewAdapter(Activity activity,List<Double> bitcoinPricesUSD , List<CryptocurrencyResponse.CryptoItem> cryptoItems,
                               List<String> logoUrls)

    {
            this.activity = activity;
        this.bitcoinPricesUSD = bitcoinPricesUSD;
        this.cryptoItems = cryptoItems;
        this.logoUrls = logoUrls;
    }
    @NonNull
    @Override
    public RecyclerviewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater LI
                = activity.getLayoutInflater();
        View vw = LI.inflate(
                R.layout.recyclerview_content, null);

        return new ViewHolder(vw);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerviewAdapter.ViewHolder holder, int position) {

        CryptocurrencyResponse.CryptoItem cryptoItem = cryptoItems.get(position);
        Collections.sort(cryptoItems, new Comparator<CryptocurrencyResponse.CryptoItem>() {
            @Override
            public int compare(CryptocurrencyResponse.CryptoItem cryptoItem1, CryptocurrencyResponse.CryptoItem cryptoItem2) {
                double marketCap1 = cryptoItem1.getQuote().getUSD().getMarket_cap();
                double marketCap2 = cryptoItem2.getQuote().getUSD().getMarket_cap();

                // For descending order, use marketCap2 - marketCap1
                return Double.compare(marketCap2, marketCap1);
            }
        });
        priceint = cryptoItem.getQuote().getUSD().getPrice();
        percentint = cryptoItem.getQuote().getUSD().getPercent_change_24h();
        market_cap = cryptoItem.getQuote().getUSD().getMarket_cap();
        marketcapString = String.valueOf(market_cap);
        pricestring = String.valueOf(priceint);
        String priceformattedValue = String.format(Locale.US, "%.2f", priceint);
        percentstring = String.valueOf(percentint);
        String PercentformattedValue = String.format(Locale.US, "%.2f", percentint);


        holder.textView.setText(priceformattedValue);
        holder.acronym.setText(cryptoItem.getSymbol());
        holder.fullname.setText(cryptoItem.getName());
        holder.plusminus.setText(PercentformattedValue);


    }

    @Override
    public int getItemCount() {
        return 20;
    }

    class ViewHolder
            extends RecyclerView.ViewHolder  {
        public ImageView imageView;
        public TextView textView,acronym,fullname,plusminus;
        public TextToSpeech t1;
        public Button b1;
        public ImageView logo;
        public RelativeLayout relativeLayout;

        public ViewHolder(View itemView)
        {
            super(itemView);
            context = itemView.getContext();
            textView = itemView.findViewById(R.id.prize);
            acronym = itemView.findViewById(R.id.acronym);

            fullname = itemView.findViewById(R.id.fullname);

            plusminus = itemView.findViewById(R.id.plusminus);
            logo = itemView.findViewById(R.id.logo);




        }



       /* @Override
        public void onClick(View view) {
            Intent intent = new Intent(activity, Chapter.class);
            view.getContext().startActivity(intent);
        }*/
    }
}
