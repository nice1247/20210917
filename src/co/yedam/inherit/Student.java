package co.yedam.inherit;
/*
 * People ��� Student
 * �ڽ� extends �θ�
 */

public class Student extends People {
	private int studentNo;

	Student(String name, String ssn) {
		super(name, ssn); // �θ� Ŭ������ ������ �ִ� ���� ������ ���ڴ�
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
	} // super, this?? ��ӹ����� ������°ɱ� ??

	// Student -> People -> Object
	@Override
	public String toString() {
		return "�л� [�̸�=" + this.getName() + ", �ֹι�ȣ=" + this.getSsn() + ", �й� " + this.getStudentNo() + "]";
	}

}
