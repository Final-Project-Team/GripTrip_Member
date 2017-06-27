package spring.trip.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import spring.trip.domain.Member;
import spring.trip.model.service.MemberService;


public class MemberContoller extends MultiActionController {
	// field
	private MemberService memberService;
	
	public void setMemberService(MemberService memberService) {
		this.memberService = memberService;
	}

	// isEmailExist
	public ModelAndView isEmailExist(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		String email = request.getParameter("email");
 		
 		boolean foundEmail = memberService.isEmailExist(email);
 		
		return new ModelAndView("JsonView", "found", foundEmail);
	}

	// isNicknameExist
	public ModelAndView isNicknameExist(HttpServletRequest request, HttpServletResponse response) throws Exception {

		String nickname = request.getParameter("nickname");
		
		boolean foundNickname = memberService.isNicknameExist(nickname);
		
		return new ModelAndView("JsonView", "found", foundNickname);
	}

	// registerMember
	public ModelAndView registerMember(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		
		return new ModelAndView();
	}

	// checkPassword
	public ModelAndView checkPassword(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String email = request.getParameter("email");
		String password = request.getParameter("password");
			
		Member pvo = new Member();
 		pvo.setPassword(email);
 		pvo.setPassword(password);
		
		System.out.println(pvo);
		
		boolean rvo = memberService.checkPassword(pvo);
		
		if(rvo){
			return new ModelAndView("member/updateMember", "mvo", pvo);
		}else{
			return new ModelAndView("JsonView", "mvo", pvo);
		}
	}

	// removeMember
	public ModelAndView removeMember(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String email = request.getParameter("email");
		String password = request.getParameter("password");
			
 		
		
		int row = memberService.removeMember("email");
		System.out.println(row+"명 삭제");
		
		return new ModelAndView("../../index");
 	}

	// login 
	public ModelAndView login(HttpServletRequest request, HttpServletResponse response, HttpSession session, Member pvo) throws Exception {
		/*String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		
		
		//정보 가져올 vo 생성
		Member pvo = new Member();
		pvo.setEmail(email);
		pvo.setPassword(password);
		
		System.out.println(pvo);*/
		
		//가져올 vo 생성
		Member rvo = memberService.login(pvo);
		System.out.println(rvo);
		
		if(rvo!=null){
			/*HttpSession session = request.getSession();
			session.setAttribute("mvo", rvo);*/
			
			//request.getSession().setAttribute("mvo", rvo);
			
			session.setAttribute("mvo", rvo);
		}
		return new ModelAndView("../../index");
	}

	public ModelAndView logout(HttpServletRequest request, HttpServletResponse response, HttpSession session) throws Exception {
		
		//HttpSession session = request.getSession();
		session.invalidate();
		
		return new ModelAndView("../../index");
	}
	// showMemberInfo
	public ModelAndView showMemberInfo(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String email = request.getParameter("email");
	
		Member rvo = memberService.showMemberInfo(email);
		
		return new ModelAndView("member/showMemberInfo", "mvo", rvo);  
	}

	// updateMember
	public ModelAndView updateMember(HttpServletRequest request, HttpServletResponse response, Member pvo) throws Exception {
		
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String username = request.getParameter("username");
		String nickname = request.getParameter("nickname");
		String address = request.getParameter("address");

		int row = memberService.updateMember(pvo);
		System.out.println(row+"명 추가");
		
		return new ModelAndView("member/updateMember", "mvo", pvo);
	}
}
