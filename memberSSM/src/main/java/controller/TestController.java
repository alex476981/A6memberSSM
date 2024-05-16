package controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.impl.MemberServiceImpl;
import vo.Member;

public class TestController {

	public static void main(String[] args) {
		ApplicationContext a=new ClassPathXmlApplicationContext("applicationContext.xml");
		System.out.print(a);
		
		MemberServiceImpl m=(MemberServiceImpl) a.getBean("ms");
		m.add(new Member("kevin","1233","444"));

	}

}
