package com.kaankaplan.LiteraryLink.business.abstracts;

import com.kaankaplan.LiteraryLink.core.util.results.DataResult;
import com.kaankaplan.LiteraryLink.core.util.results.Result;
import com.kaankaplan.LiteraryLink.dto.PostDto;
import com.kaankaplan.LiteraryLink.modals.Comment;
import com.kaankaplan.LiteraryLink.modals.Post;

import java.util.List;

public interface PostService {

    DataResult<Post> saveOrUpdate(PostDto postDto);

    DataResult<List<Post>> getUserFollowsPost(String userId, int pageNo, int pageSize);

    Result likePost(String userId, String postId);

    Result unlikePost(String userId, String postId);

    DataResult<Comment> addCommentToPost(String postId, Comment comment);
}
