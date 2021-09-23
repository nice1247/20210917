package co.yedam.inherit;
/*
 * People 상속 Student
 * 자식 extends 부모
 */

public class Student extends People {
	private int studentNo;

	Student(String name, String ssn) {
		super(name, ssn); // 부모 클래스가 가지고 있는 값을 가지고 오겠다
	}

	Student(String name, String ssn, int studentNo) {
		super(name, ssn);
		this.studentNo = studentNo;
	}

	public int getStudentNo() {
		return studentNo;
	}

	// override
	@Override
	public void showInfo() {
		System.out.println(
				"TTTTTTTName : " + super.getName() + ", SSN : " + getSsn() + ", SNO : " + this.getStudentNo() + "\n");
	} // super, this?? 상속받은건 상관없는걸까 ??

	// Student -> People -> Object
	@Override
	public String toString() {
		return "학생 [이름=" + this.getName() + ", 주민번호=" + this.getSsn() + ", 학번 " + this.getStudentNo() + "]";
	}

}
