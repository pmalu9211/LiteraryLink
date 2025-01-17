package com.kaankaplan.LiteraryLink.repositories.concretes;

import com.kaankaplan.LiteraryLink.modals.Author;
import com.kaankaplan.LiteraryLink.repositories.abstracts.AuthorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class AuthorRepositoryImpl implements AuthorRepository {

    private final ElasticsearchOperations elasticsearchOperations;

    @Override
    public Author getAuthorById(String authorId) {
        return elasticsearchOperations.get(authorId, Author.class);
    }

    @Override
    public Author save(Author author) {
        return elasticsearchOperations.save(author);
    }
}
