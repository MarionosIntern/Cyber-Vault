package com.Comment;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Transformer.Transformer;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByTransformer(Transformer transformer);
}