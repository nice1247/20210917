package co.yedam.leson;

/*
 * �̸�, ����
 */
public class Teacher {
	// �ʵ�
	private String name;
	private String major;

	// Teacher t1 = new Teacher(); => ��������°� �ν��Ͻ��� �����Ѵ� ��� �Ѵ�

	// this�� �ʵ� ���� ��Ÿ���ٴ� ��
	// ������
	public Teacher(String name, String major) {
		this.name = name;
		this.major = major;
	}

	// �޼ҵ�
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
