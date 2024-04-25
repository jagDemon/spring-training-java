package com.github.proxy;

import com.github.model.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
