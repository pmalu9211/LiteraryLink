package com.kaankaplan.LiteraryLink.dto;

public record UserRegisterDto(
        String fullName,
        String email,
        String password
) {
}
