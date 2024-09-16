package com.kaankaplan.LiteraryLink.dto;

public record LoginResponseDto(
        String userId,
        String email,
        String token,
        String refreshToken
) {
}
