package com.optimumits.lintest.service.mapper;


import com.optimumits.lintest.domain.*;
import com.optimumits.lintest.service.dto.ArticleDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity {@link Article} and its DTO {@link ArticleDTO}.
 */
@Mapper(componentModel = "spring", uses = {})
public interface ArticleMapper extends EntityMapper<ArticleDTO, Article> {

    Article toEntity(ArticleDTO articleDTO);

    default Article fromId(String id) {
        if (id == null) {
            return null;
        }
        Article article = new Article();
        article.setId(id);
        return article;
    }
}
