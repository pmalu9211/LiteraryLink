package com.kaankaplan.LiteraryLink.repositories.concretes;

import com.kaankaplan.LiteraryLink.modals.ReadingChallenge;
import com.kaankaplan.LiteraryLink.repositories.abstracts.ReadingChallengeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.stereotype.Repository;


@Repository
@RequiredArgsConstructor
public class ReadingChallengeRepositoryImpl implements ReadingChallengeRepository {

    private final ElasticsearchOperations elasticsearchOperations;

    @Override
    public ReadingChallenge getReadingChallengeById(String challengeId) {
        return elasticsearchOperations.get(challengeId, ReadingChallenge.class);
    }

    @Override
    public ReadingChallenge startChallenge(ReadingChallenge readingChallenge) {
        return elasticsearchOperations.save(readingChallenge);
    }

    @Override
    public ReadingChallenge updateChallenge(ReadingChallenge readingChallenge) {
        return elasticsearchOperations.save(readingChallenge);
    }
}
