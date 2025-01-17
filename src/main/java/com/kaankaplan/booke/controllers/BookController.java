package com.kaankaplan.LiteraryLink.controllers;

import com.kaankaplan.LiteraryLink.business.abstracts.BookService;
import com.kaankaplan.LiteraryLink.core.util.results.DataResult;
import com.kaankaplan.LiteraryLink.core.util.results.Result;
import com.kaankaplan.LiteraryLink.dto.BookDto;
import com.kaankaplan.LiteraryLink.modals.Book;
import com.kaankaplan.LiteraryLink.modals.Review;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequestMapping("/book/")
@RequiredArgsConstructor
public class BookController {

    private final BookService bookService;

    @PostMapping("addBook")
    public DataResult<Book> addBook(@RequestBody BookDto bookDto) {
        return bookService.addBook(bookDto);
    }

    @PostMapping("addReviewToBook/{bookId}")
    public DataResult<Book> addReviewToBook(@PathVariable String bookId, @RequestBody Review review) {
        return bookService.addReviewToBook(bookId, review);
    }

    @PostMapping("addImageForBook/{bookId}")
    public Result addImageForBook(@PathVariable String bookId, @RequestPart("image") MultipartFile multipartFile) {
        return bookService.addImageForBook(bookId, multipartFile);
    }

    @GetMapping("getBookById/{bookId}")
    public DataResult<Book> getBookById(@PathVariable String bookId) {
        return bookService.getBookById(bookId);
    }

    @GetMapping("search/{title}")
    public DataResult<List<Book>> searchBooks(@PathVariable String title) {
        return bookService.searchBooksAutocomplete(title);
    }
}
