package de.kagegan.latorrebackend.repository;

import de.kagegan.latorrebackend.model.db.ArticlePooling;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ArticlePoolingRepository extends JpaRepository<ArticlePooling, ArticlePooling.ArticlePoolingId> {

    List<ArticlePooling> findByArticleId(Long articleId);
}
