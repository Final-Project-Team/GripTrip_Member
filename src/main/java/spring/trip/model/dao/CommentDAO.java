package spring.trip.model.dao;

import java.util.List;

import spring.trip.domain.Comment;

public interface CommentDAO {
	int writeComment(String comment_content);
	int updateComment(Comment vo);
	int removeComment(String commentNo);
	List<Comment> getAllCommentsOfStroy(String storyNo);
}
