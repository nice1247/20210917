package co.yedam.leson;

/*
 * �л��̸�, ����ó, �ּ�
 */
public class Student {
	private String studentName;
	private String phone;
	private String address;

	public Student(String name, String phone, String address) {
		this.studentName = name;
		this.phone = phone;
		this.address = address;
	}

	public void setstudentName(String name) {
		this.studentName = name;
	}

	public void setphone(String phone) {
		this.phone = phone;
	}

	public void setaddress(String address) {
		this.address = address;
	}

	public String getstudentName() {
		return studentName;
	}

	public String getphone() {
		return phone;
	}

	public String getaddress() {
		return address;
	}

}
