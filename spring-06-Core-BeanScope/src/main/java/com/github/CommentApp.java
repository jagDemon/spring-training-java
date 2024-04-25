package com.github;

import com.github.config.CommentConfig;
import com.github.model.Comment;
import com.github.service.CommentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CommentApp {
    public static void main(String[] args) {

        Comment comment = new Comment();
        comment.setAuthor("John");
        comment.setText("Spring Core Framework");

        ApplicationContext context = new AnnotationConfigApplicationContext(CommentConfig.class);


        CommentService cs1 = context.getBean(CommentService.class);
        CommentService cs2 = context.getBean(CommentService.class);

        System.out.println(cs1);
        System.out.println(cs2);
        System.out.println(cs1==cs2);


    }
}
