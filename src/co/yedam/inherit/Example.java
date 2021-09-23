package co.yedam.inherit;

public class Example {
	public static void main(String[] args) {
		People p1 = new People("Hong", "20200101-1234567");
		System.out.println("이름 : " + p1.getName());
		System.out.println("주민번호 : " + p1.getSsn());
		System.out.println(p1.toString());
		p1.showInfo();

		Student s1 = new Student("Park", "20210102-1234567");
		System.out.println("이름 : " + s1.getName());
		System.out.println("주민번호 : " + s1.getSsn());
		System.out.println(s1.toString());
		s1.showInfo();

		Student s2 = new Student("Choi", "20210103-1234567", 110);
		System.out.println("이름 : " + s2.getName());
		System.out.println("주민번호 : " + s2.getSsn());
		System.out.println("학생번호 : " + s2.getStudentNo());
		System.out.println(s2.toString());
		s2.showInfo();

		People p2 = new Student("Hwang", "20210104-1234567", 120);
//		p1 = new Student("Hwang", "20210104-1234567", 120);

//		Student s3 = new People();
//		p2.getStudentNo(); // 부모클래스 변수 자식클래스에 메소드 호출 불가능.
		if (p2 instanceof Student) {
			Student s3 = (Student) p2;
			s3.getStudentNo();
		}
		if (p1 instanceof Student) {
			Student s4 = (Student) p1;
			s4.getStudentNo();
		} else {
			System.out.println("형변환 할 수 없습니다.");  // p1 값들 형태 다 일치하는거아님 ?? >> people 에는 Studentno가 없어 !
		}

	}

}
