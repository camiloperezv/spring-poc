package com.example.cap.getnews;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;

@Service
public class NewsGetRepository {
    @Value("${external.polygon.apiKey}")
    private String polygon;

    private final RestTemplate restTemplate;
    NewsGetRepository(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
    public ArrayList<News> getNewsByTicker(String ticker) {
        String url = "https://api.polygon.io/v2/reference/news?ticker=%1$s&apiKey=%2$s";
        String newsUrl = String.format(url, ticker, this.polygon);
        NewsDTO response = restTemplate.getForObject(newsUrl, NewsDTO.class);
        ArrayList<News> news = new ArrayList<>();
        assert response != null: "No news about " + ticker;
        for (Article article : response.results()) {
            News newNews = new NewsModel(ticker);
            newNews.setTitle(article.title());
            newNews.setUrl(article.article_url());
            news.add(newNews);
        }
        return news;
    }
}
