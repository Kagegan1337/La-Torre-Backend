package de.kagegan.latorrebackend.model.db;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.hibernate.annotations.Immutable;

@Entity(name = "V_Article")
@Immutable
public class ArticleView {

    @Id
    private Long article_id;

    private Long price_per_unit;

    private String manufacturer;


    public Long getArticle_id() {
        return article_id;
    }

    public void setArticle_id(Long article_id) {
        this.article_id = article_id;
    }

    public Long getPrice_per_unit() {
        return price_per_unit;
    }

    public void setPrice_per_unit(Long price_per_unit) {
        this.price_per_unit = price_per_unit;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

}
