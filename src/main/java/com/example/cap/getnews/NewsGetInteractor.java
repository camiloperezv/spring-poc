package com.example.cap.getnews;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class NewsGetInteractor {
    private final NewsGetRepository getNewsRepo;

    public NewsGetInteractor(NewsGetRepository getNewsRepo) {
        this.getNewsRepo = getNewsRepo;
    }

    public ArrayList<News> GetNewsByTicker(String ticker) {
        ArrayList<News> news = this.getNewsRepo.getNewsByTicker(ticker);
        return news;
    }
}
