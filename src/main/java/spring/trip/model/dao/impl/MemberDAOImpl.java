package spring.trip.model.dao.impl;

import org.apache.ibatis.session.SqlSession;

import spring.trip.domain.Member;
import spring.trip.model.dao.MemberDAO;

public class MemberDAOImpl implements MemberDAO{
	SqlSession sqlSession;
	
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	@Override
	public boolean isEmailExist(String email) {
		int row = sqlSession.selectOne("memberMapper.isEmailExist", email);
		
		if(!email.equals(row))
			System.out.println("사용가능합니다.");
		else
			System.out.println(row+"select ok");
		
		return false;
	}

	@Override
	public boolean isNicknameExist(String nickname) {
		int row = sqlSession.selectOne("memberMapper.isNicknameExist", nickname);
		
		if(!nickname.equals(row))
			System.out.println("사용가능합니다.");
		else
			System.out.println(row+"select ok");
		
		return false;
	}

	@Override
	public int registerMember(Member vo) {
		int row = sqlSession.insert("memberMapper.registerMember", vo);
		System.out.println(row+"registerMember ok!");
		return row;
	}

	@Override
	public boolean checkPassword(String password) {
		int row = sqlSession.selectOne("memberMapper.checkPassword", password);
		
		if(!password.equals(row))
			System.out.println("비밀번호를 다시 입력하세요");
		else
			System.out.println(row+"select ok");
		
		return false;
	}

	@Override
	public int removeMember(String email) {
		int row = sqlSession.delete("memberMapper.removeMember", email);
		System.out.println(row+"removeMember ok!");
		return row;
	}

	@Override
	public Member login(Member member) {
		Member mem = sqlSession.selectOne("memberMapper.login", member);
		System.out.println(mem);
		return mem;
		//
	}

	@Override
	public Member showMemberInfo(String email) {
		Member member = sqlSession.selectOne("memberMapper.showMemberInfo", email);
		System.out.println(member);
		return member;
	}

	@Override
	public int updateMember(Member vo) {
		int row = sqlSession.update("memberMapper.updateMember", vo);
		System.out.println(row+"updateMember ok!");
		return row;
	}

}
