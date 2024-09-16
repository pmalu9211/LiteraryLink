package com.kaankaplan.LiteraryLink.repositories.abstracts;


import com.kaankaplan.LiteraryLink.modals.Genre;

import java.util.List;

public interface GenreRepository {

    Genre saveOrUpdate(Genre genre);

    List<Genre> getFirstThreeGenres();

    Genre getGenreById(String genreId);
}
