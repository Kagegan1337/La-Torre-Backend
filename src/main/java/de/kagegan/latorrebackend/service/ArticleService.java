package de.kagegan.latorrebackend.service;

import de.kagegan.latorrebackend.model.db.ArticleView;
import de.kagegan.latorrebackend.model.dto.ArticleDetailsDto;
import de.kagegan.latorrebackend.model.dto.ArticleDto;
import de.kagegan.latorrebackend.repository.ArticleRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ArticleService {

    private final ArticleRepository articleRepository;


    public ArticleService(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;

    }

    public List<ArticleDto> getAllArticles() {
        List<ArticleView> articles = articleRepository.findAll();
        List<ArticleDto> resultList = new ArrayList<>();
        for (ArticleView article : articles) {
            resultList.add(new ArticleDto(article.getId(), article.getName(), article.getBeschreibung(), article.getKategorie(), article.getSubCategory(), article.getThumbnail()));
        }
        return resultList;
    }

    public ArticleDetailsDto findArticleById(Long id) {

        return null;
    }
}
