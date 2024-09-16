package com.kaankaplan.LiteraryLink.dto;

import com.kaankaplan.LiteraryLink.modals.Book;
import com.kaankaplan.LiteraryLink.modals.Reader;

public record BookStatusDto(
        String status,
        Reader reader,
        Book book
) {
}
