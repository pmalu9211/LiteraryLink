package com.kaankaplan.LiteraryLink.repositories.abstracts;


import com.kaankaplan.LiteraryLink.modals.ReadingChallenge;


public interface ReadingChallengeRepository {

    ReadingChallenge getReadingChallengeById(String challengeId);

    ReadingChallenge startChallenge(ReadingChallenge readingChallenge);

    ReadingChallenge updateChallenge(ReadingChallenge readingChallenge);
}
