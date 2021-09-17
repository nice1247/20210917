package co.yedam.person;

public class PersonExample {
	public static void main(String[] args) {
		// p1
		// p2, p3
		// family => 가족정보(이름, 혈액형, 나이) : 끝1

		// 키가 165이상 가족만 출력(이름, 키, 몸무게) : 끝2

		// family => 혈액형이 AB형인 사람만
		Person p1 = new Person("오재준", 200.5, 100.0, "B", 50);
		Person p2 = new Person("고우미", 175.3, 50.0, "O", 25);
		Person p3 = new Person("아르미", 162.5, 45.6, "AB", 21);

		Person[] family = { p1, p2, p3 };
		for (int i = 0; i < family.length; i++) {
			System.out.println(
					"이름 : " + family[i].getName() + " 혈액형 : " + family[i].getBlood() + " 나이 : " + family[i].getAge());
		}
		System.out.println("=====끝1.");

		for (int i = 0; i < family.length; i++) {
			if (family[i].getHeight() > 165.0) {
				System.out.println("이름 : " + family[i].getName() + " 키 : " + family[i].getHeight() + " 몸무게 : "
						+ family[i].getWeight());
			}

		}
		System.out.println("=====끝2.");

		for (int i = 0; i < family.length; i++) {
			if (family[i].getBlood() == "AB") {
				System.out.println("이름 : " + family[i].getName() + " 혈액형 : " + family[i].getBlood());
			}
		}
		System.out.println("=====끝3.");
	}
}
