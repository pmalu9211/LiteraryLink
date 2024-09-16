package com.kaankaplan.LiteraryLink.controllers;

import com.kaankaplan.LiteraryLink.business.abstracts.AuthorService;
import com.kaankaplan.LiteraryLink.core.util.results.DataResult;
import com.kaankaplan.LiteraryLink.dto.AuthorDto;
import com.kaankaplan.LiteraryLink.modals.Author;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/author/")
@RequiredArgsConstructor
public class AuthorController {

    private final AuthorService authorService;

    @PostMapping("addAuthor")
    public DataResult<Author> addNewAuthor(@RequestBody AuthorDto authorDto) {
        return authorService.addAuthor(authorDto);
    }

    @GetMapping("getAuthorById/{authorId}")
    public DataResult<Author> getAuthorById(@PathVariable String authorId) {
        return authorService.getAuthorById(authorId);
    }
}
