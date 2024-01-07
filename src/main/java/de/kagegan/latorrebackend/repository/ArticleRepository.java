package de.kagegan.latorrebackend.repository;

import de.kagegan.latorrebackend.model.db.ArticleView;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<ArticleView, Long> {
}
