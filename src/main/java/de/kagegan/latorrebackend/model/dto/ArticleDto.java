package de.kagegan.latorrebackend.model.dto;

public record ArticleDto(Long articleId, Long pricePerUnit, String manufacturer, Long name, Long description, Long pooling, Long preis) {


    @Override
    public String toString() {
        return "ArticleDto{" +
                "articleId=" + articleId +
                ", pricePerUnit=" + pricePerUnit +
                ", manufacturer='" + manufacturer + '\'' +
                ", name=" + name +
                ", description=" + description +
                ", pooling=" + pooling +
                ", preis=" + preis +
                '}';
    }
}
