package spring.trip.model.service;

import java.util.List;

import spring.trip.domain.Comment;

public interface CommentService {
	void writeComment(String comment_content);
	void updateComment(Comment vo);
	void removeComment(String commentNo);
	List<Comment> getAllCommentsOfStroy(String storyNo);
}
