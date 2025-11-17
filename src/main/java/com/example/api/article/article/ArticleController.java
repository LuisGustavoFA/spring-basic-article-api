package com.example.api.article.article;

import org.springframework.web.bind.annotation.*;

import com.example.api.article.article.dto.ArticleCreateDTO;

@RestController
@RequestMapping("/articles")
public class ArticleController {

    private final ArticleService articleService;

    public ArticleController(ArticleService articleService) {
        this.articleService = articleService;
    }

    @PostMapping
    public Article create(@RequestBody ArticleCreateDTO dto) {
        return articleService.create(dto);
    }
}
