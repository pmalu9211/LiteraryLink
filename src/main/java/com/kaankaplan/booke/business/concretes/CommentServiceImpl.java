package com.kaankaplan.LiteraryLink.business.concretes;

import com.kaankaplan.LiteraryLink.business.abstracts.CommentService;
import com.kaankaplan.LiteraryLink.core.util.results.DataResult;
import com.kaankaplan.LiteraryLink.core.util.results.SuccessDataResult;
import com.kaankaplan.LiteraryLink.modals.Comment;
import com.kaankaplan.LiteraryLink.repositories.abstracts.ElasticCommentRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class CommentServiceImpl implements CommentService {

    private final ElasticCommentRepository commentRepository;

    @Override
    public DataResult<Comment> saveComment(Comment comment) {
        return new SuccessDataResult<>(commentRepository.save(comment));
    }
}
