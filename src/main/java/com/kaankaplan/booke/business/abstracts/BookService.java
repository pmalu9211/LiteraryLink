package com.kaankaplan.LiteraryLink.business.abstracts;

import com.kaankaplan.LiteraryLink.core.util.results.DataResult;
import com.kaankaplan.LiteraryLink.core.util.results.Result;
import com.kaankaplan.LiteraryLink.dto.BookDto;
import com.kaankaplan.LiteraryLink.modals.Book;
import com.kaankaplan.LiteraryLink.modals.Review;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface BookService {

    DataResult<Book> addBook(BookDto bookDto);

    DataResult<Book> addReviewToBook(String bookId, Review review);

    DataResult<Book> getBookById(String bookId);

    DataResult<List<Book>> searchBooksAutocomplete(String title);

    Result addImageForBook(String bookId, MultipartFile multipartFile);
}
