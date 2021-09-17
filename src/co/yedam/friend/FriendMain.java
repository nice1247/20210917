package co.yedam.friend;

import java.util.Scanner;

/*
 * ģ�� ��� ����.
 * �̸�, ����ó, email, Ű, ������
 * showinfo
 * ���, ��ȸ(�̸�), ���, ����, ����, ����
 */
public class FriendMain {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		Friend[] myfr = new Friend[30];
		myfr[0] = new Friend("ȫ�浿", "1111-1111", "1111@google.com", 180, 80);
		myfr[1] = new Friend("��ƹ���", "2222-2222", "2222@google.com", 160, 48);
		myfr[2] = new Friend("Sam", "3333-3333", "3333@google.com", 175, 78);

		while (true) {
			System.out.println("1. ���, 2. ��ȸ(�̸�), 3. ���, 4. ����, 5. ����, 9. ����");
			int menu = readInt("�޴��� �����ϼ���>>");
			if (menu == 1) {
				System.out.println("ģ����ϸ޴��Դϴ�");
				String name = readStr("ģ���̸��� �Է��ϼ���");
				String phone = readStr("ģ������ó�� �Է��ϼ���");
				String email = readStr("ģ��email�� �Է��ϼ���");
				int height = readInt("ģ��Ű�� �Է��ϼ���");
				int weight = readInt("ģ�������Ը� �Է��ϼ���");

			} else if (menu == 2) {
				System.out.println("ģ����ȸ�޴��Դϴ�");
				String search = readStr("ģ���̸��� �Է��ϼ���");
				for (Friend friend : myfr) {
					if (friend != null && friend.getName().equals(search)) {
						friend.showInfo();
					}
				}

			} else if (menu == 3) {
				System.out.println("ģ����� �Դϴ�");
				for (Friend friend : myfr)
					if (friend != null) {
						friend.showInfo();
					}

			} else if (menu == 4) {
				System.out.println("ģ�������޴��Դϴ�");
				String search = readStr("������ ģ���̸��� �Է��ϼ���");
				String phone = readStr("������ ����ó�� �Է��ϼ���[����x > Enter]");
				String email = readStr("������ �̸����� �Է��ϼ���[����x > Enter]");
				String height = readStr("������ Ű���� �Է��ϼ���[����x > Enter]");
				String weight = readStr("������ �����԰��� �Է��ϼ���[����x > Enter]");
				boolean is = false;
				for (int i = 0; i < myfr.length; i++) {
					if (myfr[i] != null && myfr[i].getName().equals(search)) {
						if (!phone.equals("")) {
							myfr[i].setPhone(phone);
						}
						if (!email.equals("")) {
							myfr[i].setEmail(email);
						}
						if (!height.equals("")) {
							myfr[i].setHeight(Integer.parseInt(height));
						}
						if (!weight.equals("")) {
							myfr[i].setWeight(Integer.parseInt(weight));
						}
						is = true;
					}

				}
				if (is) {
					System.out.println("�����Ǿ����ϴ�");
				} else {
					System.out.println("�߸� �ԷµǾ����ϴ�");
				}

			} else if (menu == 5) {
				System.out.println("ģ�������޴��Դϴ�");
				String search = readStr("������ ģ���̸��� �Է��ϼ���");
				for (int i = 0; i < myfr.length; i++) {
					if (myfr[i] != null && myfr[i].getName().equals(search)) {
						myfr[i] = null;
					}
				}
				System.out.println("�����Ϸ�");

			} else if (menu == 9) {
				System.out.println("����Ǿ����ϴ�.");
				break;
			}
		}
	}

	public static String readStr(String msg) {
		System.out.println(msg);
		return scn.nextLine();
	}

	public static int readInt(String msg) {
		System.out.println(msg);
		int result = 0;
		while (true) {
			String act = scn.nextLine();
			try {
				result = Integer.parseInt(act);
				break;
			} catch (Exception e) {
				System.out.println("�߸��� ���� �Է��߽��ϴ�. �ٽ� �Է��ϼ���");
			}
		}
		return result;
	}

}
