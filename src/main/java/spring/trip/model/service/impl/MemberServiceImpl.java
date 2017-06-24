package spring.trip.model.service.impl;

import org.apache.ibatis.session.SqlSession;

import spring.trip.domain.Member;
import spring.trip.model.dao.MemberDAO;
import spring.trip.model.service.MemberService;

public class MemberServiceImpl implements MemberService{
	
	private SqlSession sqlSession;
	private MemberDAO memberDAO;
	
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	public void setMemberDAO(MemberDAO memberDAO) {
		this.memberDAO = memberDAO;
	}

	@Override
	public boolean isEmailExist(String email) {
	
	}

	@Override
	public boolean isNicknameExist(String nickname) {
		
	}

	@Override
	public int registerMember(Member vo) {
		
	}

	@Override
	public boolean checkPassword(String password) {
		
	}

	@Override
	public int removeMember(String email) {
		int row= memberDAO.removeMember(email);
		return row;
	}

	@Override
	public Member login(Member vo) {
		memberDAO.login(vo);
		return vo;
	}

	@Override
	public Member showMemberInfo(String email) {
		Member vo = memberDAO.showMemberInfo(email);
		return vo;
	}

	@Override
	public int updateMember(Member vo) {
		int row= memberDAO.updateMember(vo);
		return row;
	}
	
}
