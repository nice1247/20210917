package co.yedam.friend;

import java.util.Scanner;

/*
 * 친구 목록 관리.
 * 이름, 연락처, email, 키, 몸무게
 * showinfo
 * 등록, 조회(이름), 목록, 수정, 삭제, 종료
 */
public class FriendMain {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		Friend[] myfr = new Friend[30];
		myfr[0] = new Friend("홍길동", "1111-1111", "1111@google.com", 180, 80);
		myfr[1] = new Friend("김아무개", "2222-2222", "2222@google.com", 160, 48);
		myfr[2] = new Friend("Sam", "3333-3333", "3333@google.com", 175, 78);

		while (true) {
			System.out.println("1. 등록, 2. 조회(이름), 3. 목록, 4. 수정, 5. 삭제, 9. 종료");
			int menu = readInt("메뉴를 선택하세요>>");
			if (menu == 1) {
				System.out.println("친구등록메뉴입니다");
				String name = readStr("친구이름을 입력하세요");
				String phone = readStr("친구연락처를 입력하세요");
				String email = readStr("친구email을 입력하세요");
				int height = readInt("친구키를 입력하세요");
				int weight = readInt("친구몸무게를 입력하세요");

			} else if (menu == 2) {
				System.out.println("친구조회메뉴입니다");
				String search = readStr("친구이름을 입력하세요");
				for (int i = 0; i < myfr.length; i++) {
					if (myfr.equals(search)) {
						System.out.println(myfr[i]);
					}
				}

			} else if (menu == 3) {
				System.out.println("친구목록 입니다");
				for (Friend friend : myfr)
					if (friend != null) {
						friend.showInfo();
					}

			} else if (menu == 4) {
				System.out.println("친구수정메뉴입니다");

			} else if (menu == 5) {
				System.out.println("친구삭제메뉴입니다");

			} else if (menu == 9) {
				System.out.println("종료되었습니다.");
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
				System.out.println("잘못된 값을 입력했습니다. 다시 입력하세요");
			}
		}
		return result;
	}

}
