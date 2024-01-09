package de.kagegan.latorrebackend.model.db;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import org.hibernate.annotations.Immutable;

import java.io.Serializable;
import java.util.Objects;

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

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ArticlePoolingId that = (ArticlePoolingId) o;

            if (!articleId.equals(that.articleId)) return false;
            return Objects.equals(poolingId, that.poolingId);
        }

        @Override
        public int hashCode() {
            int result = articleId.hashCode();
            result = 31 * result + (poolingId != null ? poolingId.hashCode() : 0);
            return result;
        }
    }


}
