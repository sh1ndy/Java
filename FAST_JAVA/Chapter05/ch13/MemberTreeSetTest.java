package ch13;

import java.util.Comparator;
import java.util.TreeSet;

class MyCompare implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		return s1.compareTo(s2) * (-1);
	}
	
}

public class MemberTreeSetTest {
	

	public static void main(String[] args) {

		/*
		// 정렬이 가능하데 중복은 안됨 -> TreeSet
		// 정렬이 될려면 comparable implements 해야함
		MemberTreeSet memberTreeSet = new MemberTreeSet();
		
		Member memberHong = new Member(1004, "홍길동");
		Member memberLee = new Member(1001, "이순신");
		Member memberKim = new Member(1002, "김유신");
		Member memberKang = new Member(1003, "강감찬");
		
		
		memberTreeSet.addMember(memberLee);
		memberTreeSet.addMember(memberKim);
		memberTreeSet.addMember(memberKang);
		memberTreeSet.addMember(memberHong);
		
		memberTreeSet.showAllMember();
		
//		memberTreeSet.showAllMember();
 
		 */
		
		TreeSet<String> set = new TreeSet<String>(new MyCompare());
		set.add("Park");
		set.add("Kim");
		set.add("Lee");
		
		System.out.println(set);
		
	}

}
