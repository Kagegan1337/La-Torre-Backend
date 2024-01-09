package de.kagegan.latorrebackend.repository;

import de.kagegan.latorrebackend.model.db.ArticleImage;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ArticleImageRepository extends JpaRepository<ArticleImage, ArticleImage.ArticleImageId> {

    List<ArticleImage> findByArticleId(Long articleId);
}
