package de.kagegan.latorrebackend.model.dto;

import java.util.List;

public record ArticleDto(Long id, List<TranslationDto> names, String manufacturer,List<TranslationDto> description,
                         List<PoolingDto> pooling, List<ArticleImageDto> images){
}
