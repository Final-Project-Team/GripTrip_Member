package spring.trip.model.dao;

import spring.trip.domain.Member;

public interface MemberDAO {
	boolean isEmailExist(String email);
	boolean isNicknameExist(String nickname);
	int registerMember(Member vo);
	boolean checkPassword(String password);
	int removeMember(String email);
	Member login(String email, String password);
}
