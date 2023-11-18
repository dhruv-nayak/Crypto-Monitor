package com.example.gweiland;

import java.util.List;
import java.util.Map;

public class ApiResponse {
    private Map<String, CryptoItem> data;
    private Status status;

    public Map<String, CryptoItem> getData() {
        return data;
    }

    public void setData(Map<String, CryptoItem> data) {
        this.data = data;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public static class CryptoItem {
        private Map<String, List<String>> urls;
        private String logo;
        private int id;
        private String name;
        private String symbol;
        private String slug;
        private String description;
        private String date_added;
        private String date_launched;
        private List<String> tags;
        private Object platform;
        private String category;
        private String notice;
        private Object self_reported_circulating_supply;
        private Object self_reported_market_cap;
        private Object self_reported_tags;
        private boolean infinite_supply;

        public Map<String, List<String>> getUrls() {
            return urls;
        }

        public void setUrls(Map<String, List<String>> urls) {
            this.urls = urls;
        }

        public String getLogo() {
            return logo;
        }

        public void setLogo(String logo) {
            this.logo = logo;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSymbol() {
            return symbol;
        }

        public void setSymbol(String symbol) {
            this.symbol = symbol;
        }

        public String getSlug() {
            return slug;
        }

        public void setSlug(String slug) {
            this.slug = slug;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getDate_added() {
            return date_added;
        }

        public void setDate_added(String date_added) {
            this.date_added = date_added;
        }

        public String getDate_launched() {
            return date_launched;
        }

        public void setDate_launched(String date_launched) {
            this.date_launched = date_launched;
        }

        public List<String> getTags() {
            return tags;
        }

        public void setTags(List<String> tags) {
            this.tags = tags;
        }

        public Object getPlatform() {
            return platform;
        }

        public void setPlatform(Object platform) {
            this.platform = platform;
        }

        public String getCategory() {
            return category;
        }

        public void setCategory(String category) {
            this.category = category;
        }

        public String getNotice() {
            return notice;
        }

        public void setNotice(String notice) {
            this.notice = notice;
        }

        public Object getSelf_reported_circulating_supply() {
            return self_reported_circulating_supply;
        }

        public void setSelf_reported_circulating_supply(Object self_reported_circulating_supply) {
            this.self_reported_circulating_supply = self_reported_circulating_supply;
        }

        public Object getSelf_reported_market_cap() {
            return self_reported_market_cap;
        }

        public void setSelf_reported_market_cap(Object self_reported_market_cap) {
            this.self_reported_market_cap = self_reported_market_cap;
        }

        public Object getSelf_reported_tags() {
            return self_reported_tags;
        }

        public void setSelf_reported_tags(Object self_reported_tags) {
            this.self_reported_tags = self_reported_tags;
        }

        public boolean isInfinite_supply() {
            return infinite_supply;
        }

        public void setInfinite_supply(boolean infinite_supply) {
            this.infinite_supply = infinite_supply;
        }
    }

    public static class Status {
        private String timestamp;
        private int error_code;
        private String error_message;
        private int elapsed;
        private int credit_count;
        private String notice;

        public String getTimestamp() {
            return timestamp;
        }

        public void setTimestamp(String timestamp) {
            this.timestamp = timestamp;
        }

        public int getError_code() {
            return error_code;
        }

        public void setError_code(int error_code) {
            this.error_code = error_code;
        }

        public String getError_message() {
            return error_message;
        }

        public void setError_message(String error_message) {
            this.error_message = error_message;
        }

        public int getElapsed() {
            return elapsed;
        }

        public void setElapsed(int elapsed) {
            this.elapsed = elapsed;
        }

        public int getCredit_count() {
            return credit_count;
        }

        public void setCredit_count(int credit_count) {
            this.credit_count = credit_count;
        }

        public String getNotice() {
            return notice;
        }

        public void setNotice(String notice) {
            this.notice = notice;
        }
    }

}
