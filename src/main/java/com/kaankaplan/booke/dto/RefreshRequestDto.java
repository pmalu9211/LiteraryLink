package com.kaankaplan.LiteraryLink.dto;

public record RefreshRequestDto(
        String email,
        String refreshToken
) {
}
