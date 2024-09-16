package com.kaankaplan.LiteraryLink.repositories.abstracts;

import com.kaankaplan.LiteraryLink.modals.Book;

import java.util.List;

public interface BookRepository {

    Book save(Book book);

    Book getBookById(String bookId);

    List<Book> searchBooksAutocomplete(String title);
}
