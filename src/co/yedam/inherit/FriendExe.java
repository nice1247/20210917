package co.yedam.inherit;

import co.yedam.ScanUtil;

public class FriendExe {

	private static FriendExe singleton = new FriendExe();
	private Friend[] friends;

	private FriendExe() {
		// ģ��, �б�ģ��, ȸ��ģ�� => �迭�� ����.
		// [�迭]�� �� Ÿ�Ը� ���尡�� !
		// CompFriend -> Friend, UnivFriend -> Friend
		friends = new Friend[100];
		friends[0] = new Friend("�質��", "1111-1231");
		friends[5] = new Friend("�質��", "1111-1234");
		friends[1] = new Friend("�̱׸�", "2222-1231");
		friends[2] = new Friend("�ڳ���", "3333-3333");
		friends[3] = new UnivFriend("�ּ���", "1234-5678", "���а�");
		friends[4] = new CompFriend("�̽ù�", "2222-1212", "������");
	}

	public static FriendExe getInstance() {
		return singleton;
	}

	public void execute() {
		while (true) {
			System.out.println("----------------------");
			System.out.println("1.ģ����� 2.��ȸ 3.���� 4.���� 5.����");
			System.out.println("----------------------");
			int menu = ScanUtil.readInt("�޴��� �����ϼ���."); // �ν��Ͻ� �޸� �Ҵ�.

			if (menu == 1) {
				System.out.println("���");
				addFriend();
			} else if (menu == 2) {
				System.out.println("��ȸ");
				showList();
			} else if (menu == 3) {
//				System.out.println("����");
				modify();
			} else if (menu == 4) {
//				System.out.println("����");
				delete();
			} else if (menu == 5) {
				System.out.println("�����մϴ�.");
				break;
			}
		}
		System.out.println("��.");
	}

	private void addFriend() {
		// ģ��, �б�ģ��, ȸ��ģ��
		System.out.println("1.ģ�� 2.�б�ģ�� 3.ȸ��ģ��");
		int choice = ScanUtil.readInt("�޴��� �����ϼ���");

		String name = ScanUtil.readStr("ģ���̸��� �Է�");
		String phone = ScanUtil.readStr("ģ������ó�� �Է�");
		Friend friend = null;
		if (choice == 1) {
			friend = new Friend(name, phone);

		} else if (choice == 2) {
			String major = ScanUtil.readStr("������ �Է�");
			friend = new UnivFriend(name, phone, major);

		} else if (choice == 3) {
			String depart = ScanUtil.readStr("�μ��� �Է�");
			friend = new CompFriend(name, phone, depart);
		}

		for (int i = 0; i < friends.length; i++) {
			if (friends[i] == null) {
				friends[i] = friend;
				break;
			}
			System.out.println("��� ����");
		}

	}

	private void showList() {
		// �̸�, ����ó �Է� => ȫ�浿, ��浿 > "�浿" �Ѵ� ������
		// 1111-1211, 2222-1211 > "1211" �Ѵ� ������
		// �浿, 1211 -> �̸� & ����ó.
		String search1 = ScanUtil.readStr("�̸��� �Է�");
		String search2 = ScanUtil.readStr("����ó�� �Է�");
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null && friends[i].getName().indexOf(search1) != -1
					&& friends[i].getPhone().indexOf(search2) != -1) {
//				System.out.println("�̸� : " + friends[i].getName() + ", ����ó : " + friends[i].getPhone());

//			if (friends[i] != null) {
				System.out.println(friends[i].toString());
			}
		}

//		for (int i = 0; i < friends.length; i++) {
//			if (friends[i] != null) {
//				if (!search1.equals("") && !search2.equals("")) { // �̸� && ��ȭ��ȣ
//					if (friends[i].getName().indexOf(search1) != -1 && friends[i].getPhone().indexOf(search2) != -1) {
//					}
//				} else if (!search1.equals("")) { // �̸�
//					if (friends[i].getName().indexOf(search1) != -1) {
//					}
//
//				} else if (!search2.equals("")) { // ��ȭ��ȣ
//					if (friends[i].getPhone().indexOf(search2) != -1) {
//					}
//				} else { // ����, ����
//					System.out.println(friends[i].toString());
//				}
//			}
//		}
	}

	private void modify() {

		System.out.println("[ģ�� ���]");
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null)
				System.out.println("[" + i + "]" + friends[i].toString());
		}

		int num = ScanUtil.readInt("������ ģ���� �����ϼ���.");
		String phone = ScanUtil.readStr("�ٲ� ��ȣ�� �Է��ϼ���.");
		if (phone != null && phone != "") {
			friends[num].setPhone(phone);
			System.out.println("�����Ϸ�");

		}

		if (friends[num] instanceof UnivFriend) {
			String major = ScanUtil.readStr("�ٲ� ������ �Է��ϼ���.");
			if (major != null && major != "") {
				((UnivFriend) friends[num]).setMajor(major);
				System.out.println("�����Ϸ�");
			} else {
				System.out.println("�������� �ʾҽ��ϴ�.");
			}
		} else if (friends[num] instanceof CompFriend) {
			String depart = ScanUtil.readStr("�ٲ� �μ��� �Է��ϼ���.");
			if (depart != null && depart != "") {
				((CompFriend) friends[num]).setDepart(depart);
				System.out.println("�����Ϸ�");
			} else {
				System.out.println("�������� �ʾҽ��ϴ�.");
			}

		} else {
			System.out.println("�������� �ʾҽ��ϴ�.");
		}

	}

	private void delete() {
		System.out.println("[���� ���]");
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null)
				System.out.println("[" + i + "]" + friends[i].toString());
		}
		String del = ScanUtil.readStr("������ ģ���� �Է��ϼ���.");
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null && friends[i].getName().equals(del)) {
				friends[i] = null;
				System.out.println("�����Ϸ�");
			} else if (friends[i] != null && del == "") {
				System.out.println("������ ���� �����ϴ�.");
				
			}

		}
	}
}
