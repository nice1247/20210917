package co.yedam.member;

import co.yedam.Student;

public class MemberExample {
	public static void main(String[] args) {
		Member m1 = new Member("user1", "�ڹ̸�", "�뱸 �߱� ���ϵ�"); // ������ȣ��.
		m1.showInfo();
//		m1.memberId = "user1";
		m1.setMemberId("user1");
//		m1.name = "Hong";
		m1.setName("Hone");
//		m1.address = "�߱� ���ϵ�";
		m1.setAddress("�߱� ���ϵ�");
//		System.out.println("���̵� : "+m1.memberId);
		System.out.println("���̵� : " + m1.getMemberId());
//		System.out.println("�̸� : "+m1.name);
		System.out.println("�̸� : " + m1.getName());
//		System.out.println("�ּ� : "+m1.address);
		System.out.println("�ּ� : " + m1.getAddress());
		m1.showInfo();
		System.out.println("====m1");
		Member m2 = new Member("user2");
		m2.setMemberId("123");
		m2.setName("������");
		m2.setAddress("�뱸 ������");
		System.out.println("���̵� : " + m2.getMemberId());
		System.out.println("�̸� : " + m2.getName());
		System.out.println("�ּ� : " + m2.getAddress());
		m2.showInfo();
		m2.showMemberId();
		System.out.println("======m2");

		Member m3 = new Member("user3", "ȫ�浿", "�뱸 ���� �Ŵ絿");
		m3.showInfo();
		m3.setName("�ڱ浿");
		m3.showInfo();
		
//		Student s1 = new Student();
//		s1.name = "Hong";
//		s1.score = 90;

	}

}
