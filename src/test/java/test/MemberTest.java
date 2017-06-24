package test;

import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import spring.trip.domain.Member;

public class MemberTest {
	@Test
	public void jTest() throws Exception{
		Reader r = Resources.getResourceAsReader("config/SqlMapConfig.xml");
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(r);
		SqlSession session = factory.openSession();
		
		//String email, String nickname, String username, String password, String address
		Member vo = new Member("woojong610@gmail.com", "friendship", "woojeong", "1234", "LA");
		Member vo1 = new Member("hihihi@naver.com", "HI", "kWJ", "1234", "Washington");
		Member vo2 = new Member("nicetomeetyou@daum.net", "HELLO", "WOOJEONG KIM", "1234", "Pasadena");
		
		// INSERT : registerMember
		/*System.out.println(session.insert("memberMapper.registerMember", vo) + " row inserted!");
		session.commit();*/
		/*System.out.println(session.insert("memberMapper.registerMember", vo2) + " row inserted!");
		session.commit();*/
		/*System.out.println(session.insert("memberMapper.registerMember", vo2) + " row inserted!");
		commit();*/
		
		
		// UPDATE : updateMember
		/*Member vo_update = new Member("woojong610@gmail.com", "friend", "wjwjwjwj", "1234", "California");
		System.out.println(session.update("memberMapper.updateMember", vo_update));
		session.commit();*/
		
		// DELETE : removeMember
		/*session.delete("memberMapper.removeMember", "nicetomeetyou@daum.net");
		session.commit();*/
		
		// SELECT : isEmailExist
		System.out.println(session.selectOne("memberMapper.isEmailExist", "nicetomeetyou@daum.net"));
		
		// SELECT : isNicknameExist
		System.out.println(session.selectOne("memberMapper.isNicknameExist", "friend"));
		
		// SELECT : checkPassword
		System.out.println(session.selectOne("memberMapper.checkPassword", "1234"));
		
		// SELECT : login
		System.out.println(session.selectOne("memberMapper.login", vo1));
		
		// SELECT : showMemberInfo
		System.out.println(session.selectOne("memberMapper.showMemberInfo", "woojong610@gmail.com"));
	}
}
