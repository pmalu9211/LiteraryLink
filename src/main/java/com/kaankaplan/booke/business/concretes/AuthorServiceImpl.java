package com.kaankaplan.LiteraryLink.business.concretes;

import com.kaankaplan.LiteraryLink.business.abstracts.AuthorService;
import com.kaankaplan.LiteraryLink.business.messages.Constant;
import com.kaankaplan.LiteraryLink.core.util.results.DataResult;
import com.kaankaplan.LiteraryLink.core.util.results.ErrorDataResult;
import com.kaankaplan.LiteraryLink.core.util.results.SuccessDataResult;
import com.kaankaplan.LiteraryLink.dto.AuthorDto;
import com.kaankaplan.LiteraryLink.modals.Author;
import com.kaankaplan.LiteraryLink.repositories.abstracts.AuthorRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class AuthorServiceImpl implements AuthorService {

    private final AuthorRepository authorRepository;

    @Override
    public DataResult<Author> addAuthor(AuthorDto authorDto) {
        log.info("Add author-->" + authorDto);
        Author author = new Author(authorDto.fullName());
        return new SuccessDataResult<>(authorRepository.save(author), Constant.ADD_NEW_AUTHOR);
    }

    @Override
    public DataResult<Author> getAuthorById(String authorId) {
        Author author = authorRepository.getAuthorById(authorId);
        return author != null ? new SuccessDataResult<>(author) : new ErrorDataResult<>(Constant.AUTHOR_NOT_FOUND);
    }
}
