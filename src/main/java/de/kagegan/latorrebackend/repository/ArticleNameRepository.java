package de.kagegan.latorrebackend.repository;

import de.kagegan.latorrebackend.model.db.ArticleName;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleNameRepository extends JpaRepository<ArticleName, Long> {
}
