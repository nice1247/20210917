package co.yedam.leson;

/*
 * 이름, 과목
 */
public class Teacher {
	// 필드
	private String name;
	private String major;

	// Teacher t1 = new Teacher(); => 공간만드는걸 인스턴스를 생성한다 라고 한다

	// this는 필드 값을 나타낸다는 것
	// 생성자
	public Teacher(String name, String major) {
		this.name = name;
		this.major = major;
	}

	// 메소드
	public void setName(String name) {
		this.name = name;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getName() {
		return this.name;
	}

	public String getMajor() {
		return this.major;
	}

}
