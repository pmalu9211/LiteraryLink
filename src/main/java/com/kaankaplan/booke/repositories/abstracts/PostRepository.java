package com.kaankaplan.LiteraryLink.repositories.abstracts;

import com.kaankaplan.LiteraryLink.modals.Post;

public interface PostRepository {

    Post saveOrUpdate(Post post);

    Post getPostById(String postId);
}
