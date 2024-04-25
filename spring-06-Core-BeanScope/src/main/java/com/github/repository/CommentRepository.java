package com.github.repository;

import com.github.model.Comment;

public interface CommentRepository {
    void storeComment(Comment comment);
}
