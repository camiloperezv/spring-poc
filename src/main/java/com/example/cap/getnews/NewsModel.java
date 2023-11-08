package com.example.cap.getnews;

public class NewsModel implements News{
    private String ticker;
    private String url;
    private String title;
    private String summary;
    private double rating;

    public NewsModel(String ticker) {

        this.ticker = ticker;
        this.summary = "default stuff";
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public void setRating() {
        this.rating = 10.2;
    }

    public String getTicker() {
        return this.ticker;
    }
    public String getSummary() {
        return this.summary;
    }
    public double getRating() {
        return this.rating;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
