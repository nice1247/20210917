package co.yedam.member;

import co.yedam.Student;

public class MemberExample {
	public static void main(String[] args) {
		Member m1 = new Member("user1", "박미림", "대구 중구 내일동"); // 생성자호출.
		m1.showInfo();
//		m1.memberId = "user1";
		m1.setMemberId("user1");
//		m1.name = "Hong";
		m1.setName("Hone");
//		m1.address = "중구 남일동";
		m1.setAddress("중구 남일동");
//		System.out.println("아이디 : "+m1.memberId);
		System.out.println("아이디 : " + m1.getMemberId());
//		System.out.println("이름 : "+m1.name);
		System.out.println("이름 : " + m1.getName());
//		System.out.println("주소 : "+m1.address);
		System.out.println("주소 : " + m1.getAddress());
		m1.showInfo();
		System.out.println("====m1");
		Member m2 = new Member("user2");
		m2.setMemberId("123");
		m2.setName("오재준");
		m2.setAddress("대구 수성구");
		System.out.println("아이디 : " + m2.getMemberId());
		System.out.println("이름 : " + m2.getName());
		System.out.println("주소 : " + m2.getAddress());
		m2.showInfo();
		m2.showMemberId();
		System.out.println("======m2");

		Member m3 = new Member("user3", "홍길동", "대구 서구 신당동");
		m3.showInfo();
		m3.setName("박길동");
		m3.showInfo();
		
//		Student s1 = new Student();
//		s1.name = "Hong";
//		s1.score = 90;

	}

}
