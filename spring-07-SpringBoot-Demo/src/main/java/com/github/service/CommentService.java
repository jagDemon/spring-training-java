package com.github.service;

import com.github.config.AppConfigData;
import com.github.config.DBConfigData;
import com.github.model.Comment;
import com.github.proxy.CommentNotificationProxy;
import com.github.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CommentService {
    private final CommentNotificationProxy commentNotificationProxy;
    private final CommentRepository commentRepository;
    private final AppConfigData appConfigData;
    private final DBConfigData dbConfigData;

    public CommentService(@Qualifier("EMAIL") CommentNotificationProxy commentNotificationProxy, CommentRepository commentRepository, AppConfigData appConfigData, DBConfigData dbConfigData) {
        this.commentNotificationProxy = commentNotificationProxy;
        this.commentRepository = commentRepository;
        this.appConfigData = appConfigData;
        this.dbConfigData = dbConfigData;
    }

    public void publishComment(Comment comment){
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }

    public void printConfigData(){
        //print username
        //print password
        //print url
        System.out.println(appConfigData.getUsername());
        System.out.println(appConfigData.getPassword());
        System.out.println(appConfigData.getUrl());
    }

    public void printDBConfigData(){
        System.out.println(dbConfigData.getUsername());
        System.out.println(dbConfigData.getPassword());
        System.out.println(dbConfigData.getType());
    }

}
