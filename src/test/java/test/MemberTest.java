package test;
//단위 테스트
import java.io.Reader;

<<<<<<< HEAD
=======
import java.io.Reader;

>>>>>>> d175535da5f2af4a6b7bcf7eb28cbcd2f510585d
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
<<<<<<< HEAD

import spring.trip.domain.Member;

public class MemberTest {
	
	@Test
	public void jTest()throws Exception{
		Reader r = Resources.getResourceAsReader("config/SqlMapConfig.xml");
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(r);
		
		SqlSession session = factory.openSession();
		
		/*
		//INSERT : registerMember
		
		//Member vo = new Member("aa@gamil.com", "2강의실", "홍길동", "1111", "성남시");
		//Member vo = new Member("bb@gamil.com", "3강의실", "안정환", "2222", "의왕시");
		Member vo = new Member("cc@gamil.com", "4강의실", "이을용", "3333", "안양시");
		
		System.out.println(session.insert("memberMapper.registerMember", vo)+"row ok!");
		session.commit();
		*/
		
		//---------------------------------------------------------------------------------
		
		/*
		//UPDATE : updateMember
		Member vo = new Member("cc@gamil.com", "5강의실", "이을용", "3333", "부천시");
		
		System.out.println(session.update("memberMapper.updateMember", vo)+"update ok!");
		session.commit();
		*/
		
		//---------------------------------------------------------------------------------
		
		/*
		//DELETE : removeMember
		
		System.out.println(session.delete("memberMapper.removeMember", "cc@gamil.com")+"delete ok!");
		session.commit();
		*/
		
		
		//---------------------------------------------------------------------------------
		
		//SELECT : isEmailExist
		//System.out.println(session.selectOne("memberMapper.isEmailExist", "aa@gamil.com")+"email select ok!");
		
		//---------------------------------------------------------------------------------
		
		//SELECT : isNicknameExist
		//System.out.println(session.selectOne("memberMapper.isNicknameExist", "2강의실")+ "nickname select ok!");
		
		//---------------------------------------------------------------------------------
		
		//SELECT : checkPassword
		//System.out.println(session.selectOne("memberMapper.checkPassword", "1111")+ "password select ok!");
		
		//---------------------------------------------------------------------------------
		
		//SELECT : login
		
		/*
		Member vo = new Member("aa@gamil.com", null, null,"1111", null);
		Member rvo = session.selectOne("memberMapper.login",  vo);
		System.out.println(rvo+"login select ok!");
		*/
		
		//---------------------------------------------------------------------------------
		
		//SELECT : showMemberInfo
		
		Member rvo = session.selectOne("memberMapper.showMemberInfo", "aa@gamil.com");
		System.out.println(rvo + "showMemberInfo ok!");
		
=======

import spring.trip.domain.Member;

public class MemberTest {
	
	@Test
	public void jTest() throws Exception{
		Reader r = Resources.getResourceAsReader("config/SqlMapConfig.xml")	;
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(r);
		SqlSession session = factory.openSession();
		
		/*
		registerMember
		isEmailExist
		isNicknameExist
		checkPassword
		removeMember
		login
		showMemberInfo
		updateMember
		*/
		
		//registerMember 단위테스트
		/*Member vo = new Member("google@gmail.com","nickName123","myName123","pw123","이매동");
		System.out.println(session.insert("memberMapper.registerMember", vo)+" 입력됨");
		session.commit();
		Member vo2 = new Member("2google2@gmail.com","2nick2Name123","2my2Name123","2pw2123","서현동");
		System.out.println(session.insert("memberMapper.registerMember", vo2)+" 입력됨");
		
		Member vo3 = new Member("3google3@gmail.com","3nick3Name123","3my3Name123","3pw3123","백현동");
		System.out.println(session.insert("memberMapper.registerMember", vo3)+" 입력됨");
		session.commit();
		*/
		
		//updateMember 단위테스트
		/*Member vo = new Member("google@gmail.com","1nick1Name123","1my1Name123","1pw1123","이매1동");
		System.out.println(session.update("memberMapper.updateMember", vo)+ "수정됨");
		session.commit();
		*/
		
		//removeMember 단위테스트
		/*String id = "google@gmail.com";
		System.out.println(session.delete("memberMapper.removeMember", id)+ "삭제됨");
		session.commit();
		*/
		
		//isEmailExist 단위테스트
		/*String email = "google@gmail.com";
		System.out.println(session.selectOne("memberMapper.isEmailExist", email)+ "불러옴");
		*/
		
		//isNicknameExist 단위테스트
		/*String nickName = "2nick2Name123";
		System.out.println(session.selectOne("memberMapper.isNicknameExist", nickName)+ "불러옴");
		*/
		
		//checkPassword 단위테스트
		/*String password = "2pw2123";
		System.out.println(session.selectOne("memberMapper.checkPassword", password)+ "불러옴");
		*/
		 
		//login 단위테스트
		/*Member rvo = new Member("3google3@gmail.com",null, null, "3pw3123", null);
		System.out.println(session.selectOne("memberMapper.login", rvo)+" 불러옴");
		*/
		
		//showMemberInfo 단위테스트
		/*String email = "3google3@gmail.com";
		System.out.println(session.selectOne("memberMapper.showMemberInfo", email)+" 불러옴");
	
		*/
	
>>>>>>> d175535da5f2af4a6b7bcf7eb28cbcd2f510585d
	}
}


/*

<!-- INSERT : registerMember -->
<!-- SELECT : isEmailExist -->
<!-- SELECT : isNicknameExist -->
<!-- SELECT : checkPassword -->
<!-- DELETE : removeMember -->
<!-- SELECT : login -->
<!-- SELECT : showMemberInfo -->
<!-- UPDATE : updateMember -->

*/
