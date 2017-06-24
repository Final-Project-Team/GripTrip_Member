package test;

import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import spring.trip.domain.Comment;

public class CommentTest {
	public void jTest() throws Exception{
		Reader r = Resources.getResourceAsReader("config/SqlMapConfig.xml")	;
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(r);
		SqlSession session = factory.openSession();
		
		// public Comment(int commentNo, String email, int storyNo, String commentContent, String commentCreateDate)
		
		
		// INSERT : writeComment
		
		// SELECT : getAllComments
		
		// UPDATE : updateComment
		
		// DELETE : deleteComment
	}
}
