package de.kagegan.latorrebackend.model.db;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import org.hibernate.annotations.Immutable;

import java.io.Serializable;

@Entity(name = "v_article_description")
@Immutable
@IdClass(ArticleDescription.ArticleDescriptionId.class)
public class ArticleDescription {

    @Id
    @Column(name = "article_id")
    private Long articleId;
    @Id
    @Column(name = "translation_id")
    private Long translationId;

    private String translation;

    @Column(name = "iso_code")
    private String isoCode;

    public Long getArticleId() {
        return articleId;
    }

    public void setArticleId(Long article_id) {
        this.articleId = article_id;
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

    @Override
    public String toString() {
        return "ArticleDescription{" +
                "article_id=" + articleId +
                ", translation='" + translation + '\'' +
                ", isoCode='" + isoCode + '\'' +
                '}';
    }

    public static class ArticleDescriptionId implements Serializable {

        private Long articleId;
        private Long translationId;

        public ArticleDescriptionId(){}

        public ArticleDescriptionId(Long articleId, Long translationId) {
            this.articleId = articleId;
            this.translationId = translationId;
        }
    }
}
