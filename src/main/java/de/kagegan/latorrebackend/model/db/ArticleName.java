package de.kagegan.latorrebackend.model.db;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "v_article_name")
public class ArticleName {

    @Id
    private Long article_id;

    private String translation;

    @Column(name = "iso_code")
    private String isoCode;

}
