package com.example.cap.getnews;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class NewsController {
    final NewsGetInteractor interactorGetNews;

    public NewsController(NewsGetInteractor interactorGetNews) {
        this.interactorGetNews = interactorGetNews;
    }

    @GetMapping("/news")
    public ArrayList<News> getNews(@RequestParam(value = "ticker", defaultValue = "AAPL2") String ticker) {
        return this.interactorGetNews.GetNewsByTicker(ticker);
    }
}
