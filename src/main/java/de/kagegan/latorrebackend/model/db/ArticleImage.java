package de.kagegan.latorrebackend.model.db;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import org.hibernate.annotations.Immutable;

import java.io.Serializable;

@Entity(name = "v_article_image")
@Immutable
@IdClass(ArticleImage.ArticleImageId.class)
public class ArticleImage {

    @Id
    @Column(name = "article_id")
    private Long articleId;

    @Id
    @Column(name = "image_id")
    private Long imageId;

    @Column(name = "image_path")
    private String imagePath;

    @Column(name = "image_name")
    private String imageName;

    public Long getArticleId() {
        return articleId;
    }

    public void setArticleId(Long article_id) {
        this.articleId = article_id;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public static class ArticleImageId implements Serializable {

        private Long articleId;
        private Long imageId;

        public ArticleImageId() {
        }

        public ArticleImageId(Long articleId, Long imageId) {
            this.articleId = articleId;
            this.imageId = imageId;
        }
    }
}
