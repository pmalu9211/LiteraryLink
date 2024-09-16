package com.kaankaplan.LiteraryLink.business.abstracts;

import com.kaankaplan.LiteraryLink.core.util.results.DataResult;
import com.kaankaplan.LiteraryLink.dto.AuthorDto;
import com.kaankaplan.LiteraryLink.modals.Author;

public interface AuthorService {

    DataResult<Author> addAuthor(AuthorDto authorDto);

    DataResult<Author> getAuthorById(String authorId);
}
