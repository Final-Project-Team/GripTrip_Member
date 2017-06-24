package spring.trip.model.service.impl;

import java.util.List;

import spring.trip.domain.Comment;
import spring.trip.model.dao.CommentDAO;
import spring.trip.model.service.CommentService;

public class CommentServiceImpl implements CommentService{
	// field
	private CommentDAO commentDAO;
	
	// setter
	public void setCommentDAO(CommentDAO commentDAO) {
		this.commentDAO = commentDAO;
	}

	@Override
	public void writeComment(String comment_content) {
		commentDAO.writeComment(comment_content);
	}

	@Override
	public void updateComment(Comment vo) {
		commentDAO.updateComment(vo);
	}

	@Override
	public void removeComment(String commentNo) {
		commentDAO.removeComment(commentNo);
	}

	@Override
	public List<Comment> getAllCommentsOfStroy(String storyNo) {
		return commentDAO.getAllCommentsOfStroy(storyNo);
	}
}
