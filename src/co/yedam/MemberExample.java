package co.yedam;

public class MemberExample {
	public static void main(String[] args) {
		Member m1 = new Member();
		m1.memberId = 10;
		m1.name = "�ڹ̸�";
		m1.phone = "010-1111-2222";

		Member m2 = new Member();
		m2.memberId = 20;
		m2.name = "ȫ�浿";
		m2.phone = "010-3333-4444";

		Member[] Members = { m1, m2 };
		for (Member membe : Members) {
			System.out.println("ID :" + membe.memberId);
			System.out.println("�̸� :" + membe.name);
			System.out.println("����ó :" + membe.phone);

		}

//		m1 ==> members[0]
		m1.name = "��̸�";
		Members[0].phone = "010-5555-6666";
		// Member = String+ int�� �̶�� ������ ! member�� ���� �̸�, Members�� �迭�� ũ�� !
		for (Member member : Members) {
			member.showInfo();
			
		}

	}

}
