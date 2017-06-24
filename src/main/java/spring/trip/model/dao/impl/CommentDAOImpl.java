package spring.trip.model.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import spring.trip.domain.Comment;
import spring.trip.model.dao.CommentDAO;

public class CommentDAOImpl implements CommentDAO{
	// field
	private SqlSession sqlSession;
	
	// setter
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	@Override
	public int writeComment(String comment_content) {
		return sqlSession.insert("commentMapper.writeComment", comment_content);
	}

	@Override
	public int updateComment(Comment vo) {
		return sqlSession.update("commentMapper.updateComment", vo);
	}

	@Override
	public int deleteComment(String commentNo) {
		return sqlSession.delete("commentMapper.removeComment", commentNo);
	}

	@Override
	public List<Comment> getAllComments() {
		return sqlSession.selectList("commentMapper.getAllComments");
	}
	
}
