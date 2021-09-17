package co.yedam;

public class MemberExample {
	public static void main(String[] args) {
		Member m1 = new Member();
		m1.memberId = 10;
		m1.name = "박미림";
		m1.phone = "010-1111-2222";

		Member m2 = new Member();
		m2.memberId = 20;
		m2.name = "홍길동";
		m2.phone = "010-3333-4444";

		Member[] Members = { m1, m2 };
		for (Member membe : Members) {
			System.out.println("ID :" + membe.memberId);
			System.out.println("이름 :" + membe.name);
			System.out.println("연락처 :" + membe.phone);

		}

//		m1 ==> members[0]
		m1.name = "김미림";
		Members[0].phone = "010-5555-6666";
		// Member = String+ int값 이라고 생각해 ! member는 변수 이름, Members는 배열의 크기 !
		for (Member member : Members) {
			member.showInfo();
			
		}

	}

}
