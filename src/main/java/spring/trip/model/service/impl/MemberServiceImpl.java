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
		
		return false;
	}

	@Override
	public boolean isNicknameExist(String nickname) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int registerMember(Member vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean checkPassword(String password) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int removeMember(String email) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Member login(String email, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Member showMemberInfo(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateMember(Member vo) {
		// TODO Auto-generated method stub
		return 0;
	}

}
