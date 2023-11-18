package com.example.gweiland;

import java.util.List;

public class CryptocurrencyResponse {
    public void setData(List<CryptoItem> data) {
        this.data = data;
    }

    private List<CryptoItem> data;
    private Status status;

    public List<CryptoItem> getData() {
        return data;
    }

    public Status getStatus() {
        return status;
    }

    public void setSymbol(String symbol) {
    }

    public void setName(String name) {
    }

    public void setPriceUSD(double priceUSD) {
    }

    public void setPercentChange(double percentChange) {
    }

    public static class CryptoItem {
        private int id;

        private String logo;

        public String getLogo() {
            return logo;
        }
        public void setName(String name) {
            this.name = name;
        }

        private String name;

        public void setSymbol(String symbol) {
            this.symbol = symbol;
        }

        private String symbol;
        private String slug;
        private int cmc_rank;
        private int num_market_pairs;
        private double circulating_supply;
        private double total_supply;
        private long max_supply;
        private boolean infinite_supply;
        private String last_updated;
        private String date_added;
        private List<String> tags;
        private Object platform;
        private Object self_reported_circulating_supply;
        private Object self_reported_market_cap;
        private Quote quote;

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getSymbol() {
            return symbol;
        }

        public String getSlug() {
            return slug;
        }

        public int getCmc_rank() {
            return cmc_rank;
        }

        public int getNum_market_pairs() {
            return num_market_pairs;
        }

        public double getCirculating_supply() {
            return circulating_supply;
        }

        public double getTotal_supply() {
            return total_supply;
        }

        public long getMax_supply() {
            return max_supply;
        }

        public boolean isInfinite_supply() {
            return infinite_supply;
        }

        public String getLast_updated() {
            return last_updated;
        }

        public String getDate_added() {
            return date_added;
        }

        public List<String> getTags() {
            return tags;
        }

        public Object getPlatform() {
            return platform;
        }

        public Object getSelf_reported_circulating_supply() {
            return self_reported_circulating_supply;
        }

        public Object getSelf_reported_market_cap() {
            return self_reported_market_cap;
        }

        public Quote getQuote() {
            return quote;
        }

        // Other setters...
    }

    public static class Status {
        private String timestamp;
        private int error_code;
        private String error_message;
        private int elapsed;
        private int credit_count;

        public String getTimestamp() {
            return timestamp;
        }

        public int getError_code() {
            return error_code;
        }

        public String getError_message() {
            return error_message;
        }

        public int getElapsed() {
            return elapsed;
        }

        public int getCredit_count() {
            return credit_count;
        }

        // Other setters...
    }

    public static class Quote {
        private USD USD;
        private BTC BTC;

        public USD getUSD() {
            return USD;
        }

        public BTC getBTC() {
            return BTC;
        }

        // Other setters...
    }

    public static class USD {
        private double price;
        private double volume_24h;
        private double volume_change_24h;
        private double percent_change_1h;
        private double percent_change_24h;
        private double percent_change_7d;
        private double market_cap;
        private double market_cap_dominance;
        private double fully_diluted_market_cap;
        private String last_updated;

        public double getPrice() {
            return price;
        }

        public double getVolume_24h() {
            return volume_24h;
        }

        public double getVolume_change_24h() {
            return volume_change_24h;
        }

        public double getPercent_change_1h() {
            return percent_change_1h;
        }

        public double getPercent_change_24h() {
            return percent_change_24h;
        }

        public double getPercent_change_7d() {
            return percent_change_7d;
        }

        public double getMarket_cap() {
            return market_cap;
        }

        public double getMarket_cap_dominance() {
            return market_cap_dominance;
        }

        public double getFully_diluted_market_cap() {
            return fully_diluted_market_cap;
        }

        public String getLast_updated() {
            return last_updated;
        }


    }

    public static class BTC {
        private double price;
        private double volume_24h;
        private double volume_change_24h;
        private double percent_change_1h;
        private double percent_change_24h;
        private double percent_change_7d;
        private double market_cap;
        private double market_cap_dominance;
        private double fully_diluted_market_cap;
        private String last_updated;

        public double getPrice() {
            return price;
        }

        public double getVolume_24h() {
            return volume_24h;
        }

        public double getVolume_change_24h() {
            return volume_change_24h;
        }

        public double getPercent_change_1h() {
            return percent_change_1h;
        }

        public double getPercent_change_24h() {
            return percent_change_24h;
        }

        public double getPercent_change_7d() {
            return percent_change_7d;
        }

        public double getMarket_cap() {
            return market_cap;
        }

        public double getMarket_cap_dominance() {
            return market_cap_dominance;
        }

        public double getFully_diluted_market_cap() {
            return fully_diluted_market_cap;
        }

        public String getLast_updated() {
            return last_updated;
        }

        // Other setters...
    }
}
