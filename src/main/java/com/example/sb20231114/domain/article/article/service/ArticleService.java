package com.example.sb20231114.domain.article.article.service;

import com.example.sb20231114.domain.article.article.entity.Article;
import com.example.sb20231114.domain.article.article.repository.ArticleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service //저는 단 한번만 생성되고그 이후에는 재사용되는 객체입니다.
@RequiredArgsConstructor
public class ArticleService {

    private  final ArticleRepository articleRepository;

    public Article write(String title, String body) {

        Article article = new Article( title , body);

        articleRepository.save(article);

        return article;
    }

    public Article findLastArticle() {

        return articleRepository.findLastArticle();
    }

    public List<Article> finAll() {

        return articleRepository.findAll();
    }
}
