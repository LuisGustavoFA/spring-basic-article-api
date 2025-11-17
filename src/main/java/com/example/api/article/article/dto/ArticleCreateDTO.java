package com.example.api.article.article.dto;

import lombok.Data;
import java.util.List;

@Data
public class ArticleCreateDTO {

    private String title;
    private String description;
    private String body;
    private List<String> tags;
}
