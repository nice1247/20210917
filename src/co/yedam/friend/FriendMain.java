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
				for (int i = 0; i < myfr.length; i++) {
					if (myfr.equals(search)) {
						System.out.println(myfr[i]);
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

			} else if (menu == 5) {
				System.out.println("ģ�������޴��Դϴ�");

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
