package com.kaankaplan.LiteraryLink.business.abstracts;

import com.kaankaplan.LiteraryLink.core.util.results.DataResult;
import com.kaankaplan.LiteraryLink.modals.Rating;

public interface RatingService {

    DataResult<Rating> updateRatingByStar(Rating rating, int star);
}
