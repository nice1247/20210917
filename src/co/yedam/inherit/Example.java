package co.yedam.inherit;

public class Example {
	public static void main(String[] args) {
		People p1 = new People("Hong", "20200101-1234567");
		System.out.println("�̸� : " + p1.getName());
		System.out.println("�ֹι�ȣ : " + p1.getSsn());
		System.out.println(p1.toString());
		p1.showInfo();

		Student s1 = new Student("Park", "20210102-1234567");
		System.out.println("�̸� : " + s1.getName());
		System.out.println("�ֹι�ȣ : " + s1.getSsn());
		System.out.println(s1.toString());
		s1.showInfo();

		Student s2 = new Student("Choi", "20210103-1234567", 110);
		System.out.println("�̸� : " + s2.getName());
		System.out.println("�ֹι�ȣ : " + s2.getSsn());
		System.out.println("�л���ȣ : " + s2.getStudentNo());
		System.out.println(s2.toString());
		s2.showInfo();

		People p2 = new Student("Hwang", "20210104-1234567", 120);
//		p1 = new Student("Hwang", "20210104-1234567", 120);

//		Student s3 = new People();
//		p2.getStudentNo(); // �θ�Ŭ���� ���� �ڽ�Ŭ������ �޼ҵ� ȣ�� �Ұ���.
		if (p2 instanceof Student) {
			Student s3 = (Student) p2;
			s3.getStudentNo();
		}
		if (p1 instanceof Student) {
			Student s4 = (Student) p1;
			s4.getStudentNo();
		} else {
			System.out.println("����ȯ �� �� �����ϴ�.");  // p1 ���� ���� �� ��ġ�ϴ°žƴ� ?? >> people ���� Studentno�� ���� !
		}

	}

}
