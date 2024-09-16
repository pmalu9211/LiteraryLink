package com.kaankaplan.LiteraryLink.business.abstracts;

import com.kaankaplan.LiteraryLink.core.util.results.DataResult;
import com.kaankaplan.LiteraryLink.modals.Book;
import com.kaankaplan.LiteraryLink.modals.Genre;

import java.util.List;

public interface GenreService {

    DataResult<Genre> saveOrUpdate(String genreName);

    DataResult<List<Genre>> getFirstThreeGenres();

    DataResult<Genre> addBooksToGenre(String genreId, List<Book> books);
}
