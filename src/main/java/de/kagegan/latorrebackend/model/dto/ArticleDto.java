package de.kagegan.latorrebackend.model.dto;

import java.util.List;

public record ArticleDto(Long id, String name, String description, List<PoolingDto> pooling, ){
}
