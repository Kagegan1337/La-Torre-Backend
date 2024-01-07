package de.kagegan.latorrebackend.repository;

import de.kagegan.latorrebackend.model.db.ArticlePooling;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticlePoolingRepository extends JpaRepository<ArticlePooling, Long> {
}
