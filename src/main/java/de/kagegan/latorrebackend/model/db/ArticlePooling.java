package de.kagegan.latorrebackend.model.db;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import org.hibernate.annotations.Immutable;

import java.io.Serializable;

@Entity(name = "v_article_pooling")
@Immutable
@IdClass(ArticlePooling.ArticlePoolingId.class)
public class ArticlePooling {

    @Id
    @Column(name = "pooling_id")
    private Long poolingId;

    @Id
    @Column(name = "article_id")
    private Long articleId;

    private String translation;

    @Column(name= "iso_code")
    private String isoCode;

    private Long price;

    public Long getArticleId() {
        return articleId;
    }

    public void setArticleId(Long article_Id) {
        this.articleId = article_Id;
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

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public static class ArticlePoolingId implements Serializable {

        private Long articleId;
        private Long poolingId;
    }
}
