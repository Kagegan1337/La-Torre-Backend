package de.kagegan.latorrebackend.service;

import de.kagegan.latorrebackend.model.db.ArticleDescription;
import de.kagegan.latorrebackend.model.db.ArticleName;
import de.kagegan.latorrebackend.model.db.ArticleView;
import de.kagegan.latorrebackend.model.dto.ArticleDto;
import de.kagegan.latorrebackend.model.dto.ArticleImageDto;
import de.kagegan.latorrebackend.model.dto.PoolingDto;
import de.kagegan.latorrebackend.repository.ArticleDescriptionRepository;
import de.kagegan.latorrebackend.repository.ArticleImageRepository;
import de.kagegan.latorrebackend.repository.ArticleNameRepository;
import de.kagegan.latorrebackend.repository.ArticlePoolingRepository;
import de.kagegan.latorrebackend.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class ArticleService {

    private final ArticleRepository articleRepository;
    private final ArticleNameRepository articleNameRepository;

    private final ArticleDescriptionRepository articleDescriptionRepository;
    private final ArticlePoolingRepository articlePoolingRepository;
    private final ArticleImageRepository articleImageRepository;

    public ArticleService(ArticleRepository articleRepository, ArticleNameRepository articleNameRepository,
                          ArticleDescriptionRepository articleDescriptionRepository,
                          ArticlePoolingRepository articlePoolingRepository,
                          ArticleImageRepository articleImageRepository) {
        this.articleRepository = articleRepository;
        this.articleNameRepository = articleNameRepository;
        this.articleDescriptionRepository = articleDescriptionRepository;
        this.articlePoolingRepository = articlePoolingRepository;
        this.articleImageRepository = articleImageRepository;
    }

    public List<ArticleDto> getAllArticles() {
        List<ArticleView> articles = articleRepository.findAll();
        List<ArticleDto> resultList = new ArrayList<>();
        for (ArticleView article : articles) {
            List<String> name = articleNameRepository.findByArticleId(article.getArticle_id()).stream()
                    .filter(Objects::nonNull)
                    .map(ArticleName::getTranslation)
                    .toList();
            List<String> descriptions = articleDescriptionRepository.findByArticleId(article.getArticle_id()).stream()
                    .filter(Objects::nonNull)
                    .map(ArticleDescription::getTranslation)
                    .toList();
            List<PoolingDto> poolingDtos = articlePoolingRepository.findByArticleId(article.getArticle_id()).stream()
                    .filter(Objects::nonNull)
                    .map(r -> new PoolingDto(r.getTranslation(), r.getPrice()))
                    .toList();
            List<ArticleImageDto> articleImageList = articleImageRepository.findByArticleId(article.getArticle_id()).stream()
                    .filter(Objects::nonNull)
                    .map(r -> new ArticleImageDto(r.getImageName(), r.getImagePath()))
                    .toList();
            resultList.add(new ArticleDto(article.getArticle_id(), name, article.getManufacturer(),descriptions, poolingDtos, articleImageList));
        }
        return resultList;
    }

    public ArticleDto findArticleById(Long id) {
        return null;
    }
}
