package co.yedam.leson;
/*
 * 실행클래스 + 라이브러리용 클래스 여러개 = 하나의 프로그램.
 * 객체구성(학생, 선생님, 반) => 객체지향언어
 * 학생(객체) -> 학생(클래스)			 	(상위)
 * 김소영 -> new 학생():인스턴스. 		(하위, 실체)
 */

public class LessonExample {
	public static void main(String[] args) {
		Teacher t1 = new Teacher("홍길동", "국사");

		Student s1 = new Student("김소영", "010-1111", "대구 중구");
		Student s2 = new Student("정혜윤", "010-2222", "대구 서구");

		// 선생님 - 학생1,학생2,학생....
		Lesson l1 = new Lesson();
		l1.setTeacher(t1);
		l1.setGroup("3학년1반");
		l1.addStudent(s1);
		l1.addStudent(s2);
		
		Teacher t2 = l1.getTeacher(); // Teacher
		System.out.println("선생님이름 : "+t2.getName());
		System.out.println("선생님과목 : "+l1.getTeacher().getMajor());
		
		l1.showStudents();
	}

}



// public, private ~~  >>> 생성자, 메소드?
// 곧바로 무언가... String, int(자바 클래스).... Teacher, Student(내가 만든 클래스)....  >>> 클래스