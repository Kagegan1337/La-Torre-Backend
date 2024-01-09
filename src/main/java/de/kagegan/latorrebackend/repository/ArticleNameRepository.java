package de.kagegan.latorrebackend.repository;

import de.kagegan.latorrebackend.model.db.ArticleName;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ArticleNameRepository extends JpaRepository<ArticleName, ArticleName.ArticleNameId> {

    public List<ArticleName> findByArticleId(Long articleId);
}
