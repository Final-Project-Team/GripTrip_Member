package spring.trip.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import spring.trip.domain.Comment;
import spring.trip.model.service.CommentService;

public class CommentController extends MultiActionController {
	// field
	private CommentService commentService;

	// setter
	public void setCommentService(CommentService commentService) {
		this.commentService = commentService;
	}

	// writeComment()
	public ModelAndView writeComment(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// form 값 받기
		String commentContent = request.getParameter("commentContent");
		
		// Business Logic
		commentService.writeComment(commentContent);
		return new ModelAndView();
	}

	// updateComment()
	public ModelAndView updateComment(HttpServletRequest request, HttpServletResponse response, Comment pvo) throws Exception {
		// form 값 받기
		/*String commentNo = request.getParameter("commentNo");
		String commentContent = request.getParameter("commentContent");*/
		
		// 받은 form 값으로 Comment 객체 생성
		// Comment pvo = new Comment(Integer.parseInt(commentNo), email, commentContent);
		
		// Business Logic
		commentService.updateComment(pvo);
		
		return new ModelAndView();
	}

	// removeComment()
	public ModelAndView removeComment(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// form 값 받기
		String commentNo = request.getParameter("commentNo");
		
		// Business Logic
		commentService.removeComment(commentNo);
		
		return new ModelAndView();
	}

	// getAllComments()
	public ModelAndView getAllCommentsOfStroy(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// form 값 받기
		String storyNo = request.getParameter("storyNo");
		
		// Business Logic
		List<Comment> cList = commentService.getAllCommentsOfStroy(storyNo);
		System.out.println("Comments from story(" + storyNo + ") : " + cList);
		
		return new ModelAndView();
	}
}
