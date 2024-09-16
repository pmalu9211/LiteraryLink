package com.kaankaplan.LiteraryLink.business.abstracts;

import com.kaankaplan.LiteraryLink.core.util.results.DataResult;
import com.kaankaplan.LiteraryLink.modals.Review;

public interface ReviewService {

    DataResult<Review> addReview(Review review);

    DataResult<Review> getReviewById(String reviewId);
}
