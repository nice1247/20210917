package co.yedam.leson;
/*
 * ����Ŭ���� + ���̺귯���� Ŭ���� ������ = �ϳ��� ���α׷�.
 * ��ü����(�л�, ������, ��) => ��ü������
 * �л�(��ü) -> �л�(Ŭ����)			 	(����)
 * ��ҿ� -> new �л�():�ν��Ͻ�. 		(����, ��ü)
 */

public class LessonExample {
	public static void main(String[] args) {
		Teacher t1 = new Teacher("ȫ�浿", "����");

		Student s1 = new Student("��ҿ�", "010-1111", "�뱸 �߱�");
		Student s2 = new Student("������", "010-2222", "�뱸 ����");

		// ������ - �л�1,�л�2,�л�....
		Lesson l1 = new Lesson();
		l1.setTeacher(t1);
		l1.setGroup("3�г�1��");
		l1.addStudent(s1);
		l1.addStudent(s2);
		
		Teacher t2 = l1.getTeacher(); // Teacher
		System.out.println("�������̸� : "+t2.getName());
		System.out.println("�����԰��� : "+l1.getTeacher().getMajor());
		
		l1.showStudents();
	}

}



// public, private ~~  >>> ������, �޼ҵ�?
// ��ٷ� ����... String, int(�ڹ� Ŭ����).... Teacher, Student(���� ���� Ŭ����)....  >>> Ŭ����