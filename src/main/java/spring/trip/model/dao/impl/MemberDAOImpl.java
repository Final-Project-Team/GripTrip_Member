package spring.trip.model.dao.impl;

import org.apache.ibatis.session.SqlSession;

import spring.trip.domain.Member;
import spring.trip.model.dao.MemberDAO;

public class MemberDAOImpl implements MemberDAO {

	private SqlSession sqlSession;

	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	@Override
	public boolean isEmailExist(String email) {
		boolean foundEmail = false;
		int row = sqlSession.selectOne("memberMapper.isEmailExist", email);

		if (row == 1) { // db에 email이 존재한다면
			foundEmail = true;
			System.out.println(email + "은 존재함");
		} else { // db에 email이 존재하지 않음
			System.out.println(email + "이 존재하지 않음");
		}
		return foundEmail;

	}

	@Override
	public boolean isNicknameExist(String nickname) {
		boolean foundNickname = false;
		int row = sqlSession.selectOne("memberMapper.isNicknameExist", nickname);

		if (row == 1) { // db에 nickname이 존재한다면
			foundNickname = true;
			System.out.println(foundNickname + "은 존재함");
		} else { // db에 nickname이 존재하지 않음
			System.out.println(foundNickname + "이 존재하지 않음");
		}
		return foundNickname;

	}

	@Override
	public int registerMember(Member vo) {
		int row = sqlSession.insert("memberMapper.registerMember", vo);
		System.out.println(row + "명이 신규등록 되었습니다.");
		return row;
	}

	@Override
	public boolean checkPassword(Member vo) {
		boolean foundPassword = false;
		int row = sqlSession.selectOne("memberMapper.checkPassword", vo);

		if (row == 1) { // db에 password가 존재한다면
			foundPassword = true;
			System.out.println(foundPassword + " 존재함");
		} else { // db에 password가 존재하지 않음
			System.out.println(foundPassword + " 존재하지 않음");
		}
		return foundPassword;

	}

	@Override
	public int removeMember(String email) {
		int row = sqlSession.delete("memberMapper.removeMember", email);
		System.out.println(row + "명이 삭제되었습니다.");
		return row;
	}

	@Override
	public Member login(Member vo) {
		Member rvo = (Member) sqlSession.selectOne("memberMapper.login", vo);
		return rvo;

	}

	@Override
	public Member showMemberInfo(String email) {
		Member rvo = sqlSession.selectOne("memberMapper.showMemberInfo", email);
		return rvo;

	}

	@Override
	public int updateMember(Member vo) {
		int row = sqlSession.update("memberMapper.updateMember", vo);
		System.out.println(row + "명이 수정되었습니다.");
		return row;
	}

}
