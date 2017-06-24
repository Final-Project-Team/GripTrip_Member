package spring.trip.model.service.impl;

import spring.trip.domain.Member;
import spring.trip.model.dao.MemberDAO;
import spring.trip.model.service.MemberService;

public class MemberServiceImpl implements MemberService{
	private MemberDAO memberDAO;
	
	public void setMemberDAO(MemberDAO memberDAO) {
		this.memberDAO = memberDAO;
	}

	@Override
	public boolean isEmailExist(String email) {
		memberDAO.isEmailExist(email);
		return false;
	}

	@Override
	public boolean isNicknameExist(String nickname) {
		memberDAO.isNicknameExist(nickname);
		return false;
	}

	@Override
	public int registerMember(Member vo) {
		int reg = memberDAO.registerMember(vo);
		return reg;
	}

	@Override
	public boolean checkPassword(String password) {
		memberDAO.checkPassword(password);
		return false;
	}

	@Override
	public int removeMember(String email) {
		int rem = memberDAO.removeMember(email);
		return rem;
	}

	@Override
	public Member login(Member member) {
		Member mb = memberDAO.login(member);
		return mb;
	}

	@Override
	public Member showMemberInfo(String email) {
		Member mb = memberDAO.showMemberInfo(email);
		return mb;
	}

	@Override
	public int updateMember(Member vo) {
		int up = memberDAO.updateMember(vo);
		return up;
	}
	
}
