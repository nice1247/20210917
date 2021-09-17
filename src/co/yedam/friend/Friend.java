package co.yedam.friend;
//* ģ�� ��� ����.
//* �̸�, ����ó, email, Ű, ������
//* showinfo
public class Friend {
	private String name;
	private String phone;
	private String email;
	private int height;
	private int weight;
	
	public Friend(String name, String phone, String email, int height, int weight) {
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.height = height;
		this.weight = weight;
	}
	
	public String getName() {
		return name;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public String getEmail() {
		return email;
	}
	
	public int getHeight() {
		return height;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public void showInfo() {
		System.out.printf("�̸� : %s, ����ó : %s, �̸��� : %s, Ű : %d, ������ : %d\n", name, phone, email, height, weight);
	}
	
}