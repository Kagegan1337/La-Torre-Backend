package de.kagegan.latorrebackend.model.db;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import org.hibernate.annotations.Immutable;

import java.io.Serializable;

@Entity(name = "v_article_name")
@Immutable
@IdClass(ArticleName.ArticleNameId.class)
public class ArticleName {

    @Id
    @Column(name = "article_id")
    private Long articleId;

    @Id
    @Column(name = "translation_Id")
    private Long translationId;
    private String translation;

    @Column(name = "iso_code")
    private String isoCode;

    public Long getArticleId() {
        return articleId;
    }

    public void setArticleId(Long articleId) {
        this.articleId = articleId;
    }

    public String getTranslation() {
        return translation;
    }

    public void setTranslation(String translation) {
        this.translation = translation;
    }

    public String getIsoCode() {
        return isoCode;
    }

    public void setIsoCode(String isoCode) {
        this.isoCode = isoCode;
    }

    public static class ArticleNameId implements Serializable {
        private Long articleId;
        private Long translationId;

        public ArticleNameId(){}

        public ArticleNameId(Long articleId, Long translationId) {
            this.articleId = articleId;
            this.translationId = translationId;
        }
    }
}
