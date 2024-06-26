package controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import service.impl.MemberServiceImpl;
import vo.Member;

@Controller
public class MemberController {
	private static ApplicationContext a=new ClassPathXmlApplicationContext("applicationContext.xml");
	private static MemberServiceImpl m=(MemberServiceImpl) a.getBean("ms");
	
	@PostMapping("addMember")
	public String add(String name,String username,String password)
	{
		m.add(new Member(name,username,password));
		return "addSuccess";
	}
	@RequestMapping("query")
	public String gotoQuery()
	{	
		
		return "query";
		
	}
	
}
