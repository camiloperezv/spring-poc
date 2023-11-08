package com.example.cap.getnews;

import java.util.Date;

interface News {
    public void setSummary(String Summary);

    public void setRating();

    public String getTicker();

    public String getSummary();
    public double getRating();

    public String getUrl();
    public void setUrl(String url);
    public String getTitle();
    public void setTitle(String title);
}
