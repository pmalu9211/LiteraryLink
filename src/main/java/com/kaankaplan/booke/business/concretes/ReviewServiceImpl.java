package com.kaankaplan.LiteraryLink.business.concretes;

import com.kaankaplan.LiteraryLink.business.abstracts.ReviewService;
import com.kaankaplan.LiteraryLink.core.util.results.DataResult;
import com.kaankaplan.LiteraryLink.core.util.results.ErrorDataResult;
import com.kaankaplan.LiteraryLink.core.util.results.SuccessDataResult;
import com.kaankaplan.LiteraryLink.modals.Review;
import com.kaankaplan.LiteraryLink.repositories.abstracts.ReviewRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class ReviewServiceImpl implements ReviewService {

    private final ReviewRepository reviewRepository;

    @Override
    public DataResult<Review> addReview(Review review) {
        return new SuccessDataResult<>(reviewRepository.save(review));
    }

    @Override
    public DataResult<Review> getReviewById(String reviewId) {
        Review review = reviewRepository.getReviewById(reviewId);
        return review != null ? new SuccessDataResult<>(review) : new ErrorDataResult<>();
    }
}
