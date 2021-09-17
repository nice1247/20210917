package co.yedam.person;

public class PersonExample {
	public static void main(String[] args) {
		// p1
		// p2, p3
		// family => ��������(�̸�, ������, ����) : ��1

		// Ű�� 165�̻� ������ ���(�̸�, Ű, ������) : ��2

		// family => �������� AB���� �����
		Person p1 = new Person("������", 200.5, 100.0, "B", 50);
		Person p2 = new Person("����", 175.3, 50.0, "O", 25);
		Person p3 = new Person("�Ƹ���", 162.5, 45.6, "AB", 21);

		Person[] family = { p1, p2, p3 };
		for (int i = 0; i < family.length; i++) {
			System.out.println(
					"�̸� : " + family[i].getName() + " ������ : " + family[i].getBlood() + " ���� : " + family[i].getAge());
		}
		System.out.println("=====��1.");

		for (int i = 0; i < family.length; i++) {
			if (family[i].getHeight() > 165.0) {
				System.out.println("�̸� : " + family[i].getName() + " Ű : " + family[i].getHeight() + " ������ : "
						+ family[i].getWeight());
			}

		}
		System.out.println("=====��2.");

		for (int i = 0; i < family.length; i++) {
			if (family[i].getBlood() == "AB") {
				System.out.println("�̸� : " + family[i].getName() + " ������ : " + family[i].getBlood());
			}
		}
		System.out.println("=====��3.");
	}
}
