package ch14;

import java.util.HashMap;

public class MemberHashMapTest {
	

	public static void main(String[] args) {

		
		// 정렬이 가능하데 중복은 안됨 -> TreeSet
		// 정렬이 될려면 comparable implements 해야함
		MemberHashMap memberHashMap = new MemberHashMap();
		
		Member memberHong = new Member(1004, "홍길동");
		Member memberLee = new Member(1001, "이순신");
		Member memberKim = new Member(1002, "김유신");
		Member memberKang = new Member(1003, "강감찬");
		
		
		memberHashMap.addMember(memberLee);
		memberHashMap.addMember(memberKim);
		memberHashMap.addMember(memberKang);
		memberHashMap.addMember(memberHong);
		
		memberHashMap.showAllMember();
		
		HashMap<Integer, String> hashMap = new HashMap<>();
		hashMap.put(1001, "kim");
		hashMap.put(1002, "lee");
		hashMap.put(1003, "park");
		hashMap.put(1004, "hong");
		System.out.println(hashMap.toString());
		
 
		 
		
	}

}
