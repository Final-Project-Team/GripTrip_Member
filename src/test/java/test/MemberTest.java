package test;
//단위 테스트
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

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
