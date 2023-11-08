package com.example.cap.getnews;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;

@JsonIgnoreProperties(ignoreUnknown = true)
public record NewsDTO (ArrayList<Article> results, String article_url){ }

@JsonIgnoreProperties(ignoreUnknown = true)
record Article (String title, String article_url){ }
