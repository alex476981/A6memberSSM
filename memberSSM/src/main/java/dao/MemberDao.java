package dao;

import java.util.List;

import vo.Member;

public interface MemberDao {
	//c
	void add(Member m);
	//r
	List<Member> selectAll();
}
