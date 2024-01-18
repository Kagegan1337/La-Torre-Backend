package de.kagegan.latorrebackend.model.dto;

import java.util.List;

public record ArticleDto(Long id, String name, String description, String category, String subCategory, String thumbnail){
}
