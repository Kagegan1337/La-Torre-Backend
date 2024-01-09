package de.kagegan.latorrebackend.repository;

import de.kagegan.latorrebackend.model.db.ArticleDescription;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ArticleDescriptionRepository extends JpaRepository<ArticleDescription, ArticleDescription.ArticleDescriptionId> {

    List<ArticleDescription> findByArticleId(Long articleId);
}
