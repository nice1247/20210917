package co.yedam.member;

public class Member {
	// user1(���̵�), ȫ�浿(�̸�), �뱸 �߱� ���ϵ�(�ּ�)
	private String memberId;
	private String name;
	private String address;

	// ������ : �ʵ��� ���� �ʱ�ȭ. �Ʒ�ó�� �����س��Ƶ� �ٸ������� new ~ �� �����ϸ� �ʱ�ȭ ��Ű�� �ٽ� ������ �� �� ����
	public Member() {
		memberId = "user1";
		name = "������";
		address = "�뱸 �߱� ���ϵ�";
	}
	
	public Member(String mId){
		memberId = mId;
	}
	
	public Member(String mId, String n, String a){
		memberId = mId;
		name = n;
		address = a;
	}
	
	public void setMemberId(String mId) {
		memberId = mId;
	}
	
	public void setName(String n) {
		name = n;
	}
	
	public void setAddress(String a) {
		address = a;
	}
	
	public String getMemberId() {
		return memberId; // ��ȯ���ִ� �ʵ�� id
	}
	
	public String getName() {
		return name; // ��ȯ���ִ� �ʵ�� �̸�
	}
	
	public String getAddress() {
		return address; // ��ȯ���ִ� �ʵ�� �ּ�
	}

	// �޼ҵ�
	public void showInfo() {
		System.out.println("���̵� : " + memberId + ", �̸� : " + name + ", �ּ� : " + address);
	}

	public void showMemberId() {
		System.out.println("���̵� : " + memberId);
	}

	public void showName() {
		System.out.println("�̸� : " + name);
	}

	public void showAddress() {
		System.out.println("�ּ� : " + address);
	}

}
