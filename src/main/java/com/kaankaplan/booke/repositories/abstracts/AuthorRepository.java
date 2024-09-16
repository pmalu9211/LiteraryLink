package com.kaankaplan.LiteraryLink.repositories.abstracts;

import com.kaankaplan.LiteraryLink.modals.Author;

public interface AuthorRepository {

    Author getAuthorById(String authorId);

    Author save(Author author);
}
