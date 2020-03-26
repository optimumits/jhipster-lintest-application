package com.optimumits.lintest.service.mapper;


import com.optimumits.lintest.domain.*;
import com.optimumits.lintest.service.dto.AuthorDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity {@link Author} and its DTO {@link AuthorDTO}.
 */
@Mapper(componentModel = "spring", uses = {})
public interface AuthorMapper extends EntityMapper<AuthorDTO, Author> {



    default Author fromId(String id) {
        if (id == null) {
            return null;
        }
        Author author = new Author();
        author.setId(id);
        return author;
    }
}
