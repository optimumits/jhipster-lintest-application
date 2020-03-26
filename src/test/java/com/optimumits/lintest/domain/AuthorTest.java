package com.optimumits.lintest.domain;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import com.optimumits.lintest.web.rest.TestUtil;

public class AuthorTest {

    @Test
    public void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(Author.class);
        Author author1 = new Author();
        author1.setId("id1");
        Author author2 = new Author();
        author2.setId(author1.getId());
        assertThat(author1).isEqualTo(author2);
        author2.setId("id2");
        assertThat(author1).isNotEqualTo(author2);
        author1.setId(null);
        assertThat(author1).isNotEqualTo(author2);
    }
}
