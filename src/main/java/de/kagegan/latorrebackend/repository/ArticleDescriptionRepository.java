package de.kagegan.latorrebackend.repository;

import de.kagegan.latorrebackend.model.db.ArticleDescription;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleDescriptionRepository extends JpaRepository<ArticleDescription, Long> {

}
