package de.kagegan.latorrebackend.model.dto;

import java.util.List;

public record ArticleDto(Long id, List<String> names, String manufacturer,List<String> description,
                         List<PoolingDto> pooling, List<ArticleImageDto> images){
}
