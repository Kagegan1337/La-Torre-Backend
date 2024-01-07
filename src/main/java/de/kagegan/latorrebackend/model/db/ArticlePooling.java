package de.kagegan.latorrebackend.model.db;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.hibernate.annotations.Immutable;

@Entity(name = "v_article_pooling")
@Immutable
public class ArticlePooling {

    @Id
    private Long article_Id;

    private String translation;

    @Column("iso_code")
    private String isoCode;

    private Long price;
}
