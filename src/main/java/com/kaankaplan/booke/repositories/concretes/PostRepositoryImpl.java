package com.kaankaplan.LiteraryLink.repositories.concretes;

import com.kaankaplan.LiteraryLink.modals.Post;
import com.kaankaplan.LiteraryLink.repositories.abstracts.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class PostRepositoryImpl implements PostRepository {

    private final ElasticsearchOperations elasticsearchOperations;

    @Override
    public Post saveOrUpdate(Post post) {
        return elasticsearchOperations.save(post);
    }

    @Override
    public Post getPostById(String postId) {
        return elasticsearchOperations.get(postId, Post.class);
    }
}
