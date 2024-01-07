package de.kagegan.latorrebackend.service;

import de.kagegan.latorrebackend.model.dto.ArticleDto;
import de.kagegan.latorrebackend.repository.ArticleRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ArticleService {

    private final ArticleRepository articleRepository;

    public ArticleService(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }


    public List<ArticleDto> getAllArticles() {
        return new ArrayList<>();
    }

    public ArticleDto findArticleById(Long id) {
        return null;
    }
}
