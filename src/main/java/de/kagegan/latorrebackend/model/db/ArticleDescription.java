package de.kagegan.latorrebackend.model.db;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.hibernate.annotations.Immutable;

@Entity(name = "v_article_description")
@Immutable
public class ArticleDescription {

    @Id
    private Long article_id;

    private String translation;

    @Column(name = "iso_code")
    private String isoCode;

    public Long getArticle_id() {
        return article_id;
    }

    public void setArticle_id(Long article_id) {
        this.article_id = article_id;
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
                "article_id=" + article_id +
                ", translation='" + translation + '\'' +
                ", isoCode='" + isoCode + '\'' +
                '}';
    }
}
