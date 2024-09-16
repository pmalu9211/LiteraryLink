package com.kaankaplan.LiteraryLink.dto;

public record PostDto(
        String userId, String fullName, String profilePictureUrl, String activity,
        String bookName, String authorName, String bookImageUrl, double rating
) {
}
