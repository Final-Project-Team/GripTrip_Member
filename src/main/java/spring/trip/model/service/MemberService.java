package spring.trip.model.service;

import spring.trip.domain.Member;

public interface MemberService {
	boolean isEmailExist(String email);				// 이메일 중복 확인
	boolean isNicknameExist(String nickname);		// 닉네임 중복 확인
	int registerMember(Member vo);					// 회원가입
	boolean checkPassword(String password);			// 비밀번호 맞는지 확인
	int removeMember(String email);					// 회원탈퇴
	Member login(String email, String password);	// 로그인
	Member showMemberInfo(String email);			// 멤버 정보 조회
	int updateMember(Member vo);					// 멤버 정보 수정
}
