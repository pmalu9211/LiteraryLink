package com.kaankaplan.LiteraryLink.controllers;

import com.kaankaplan.LiteraryLink.business.abstracts.PostService;
import com.kaankaplan.LiteraryLink.core.util.results.DataResult;
import com.kaankaplan.LiteraryLink.core.util.results.Result;
import com.kaankaplan.LiteraryLink.dto.PostDto;
import com.kaankaplan.LiteraryLink.modals.Comment;
import com.kaankaplan.LiteraryLink.modals.Post;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.parameters.P;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/post/")
@RequiredArgsConstructor
public class PostController {
    private final PostService postService;

    @GetMapping("getUserFollowsPost/{userId}/{pageNo}/{pageSize}")
    public DataResult<List<Post>> getUserFollowsPost(@PathVariable String userId, @PathVariable int pageNo, @PathVariable int pageSize) {
        return postService.getUserFollowsPost(userId, pageNo, pageSize);
    }

    @PostMapping("createPost")
    public DataResult<Post> createPost(@RequestBody PostDto postDto) {
        return postService.saveOrUpdate(postDto);
    }

    @PostMapping("likePost/{userId}/{postId}")
    public Result likePost(@PathVariable String userId, @PathVariable String postId) {
        return postService.likePost(userId, postId);
    }

    @PostMapping("unlikePost/{userId}/{postId}")
    public Result unlikePost(@PathVariable String userId, @PathVariable String postId) {
        return postService.unlikePost(userId, postId);
    }

    @PostMapping("addCommentToPost/{postId}")
    public DataResult<Comment> addCommentToPost(@PathVariable String postId, @RequestBody Comment comment) {
        return postService.addCommentToPost(postId, comment);
    }
}
