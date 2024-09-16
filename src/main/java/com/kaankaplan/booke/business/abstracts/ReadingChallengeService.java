package com.kaankaplan.LiteraryLink.business.abstracts;

import com.kaankaplan.LiteraryLink.core.util.results.DataResult;
import com.kaankaplan.LiteraryLink.modals.ReadingChallenge;

public interface ReadingChallengeService {

    DataResult<ReadingChallenge> createReadingChallenge(int target);

    DataResult<ReadingChallenge> updateReadingChallenge(String challengeId, String bookId);
}
