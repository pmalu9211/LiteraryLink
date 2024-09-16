package com.kaankaplan.LiteraryLink.repositories.abstracts;

import com.kaankaplan.LiteraryLink.modals.Review;

public interface ReviewRepository {

    Review save(Review review);

    Review getReviewById(String reviewId);
}
