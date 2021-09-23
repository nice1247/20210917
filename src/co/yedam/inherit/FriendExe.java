package co.yedam.inherit;

import co.yedam.ScanUtil;

public class FriendExe {

	private static FriendExe singleton = new FriendExe();
	private Friend[] friends;

	private FriendExe() {
		// 친구, 학교친구, 회사친구 => 배열에 저장.
		// [배열]은 한 타입만 저장가능 !
		// CompFriend -> Friend, UnivFriend -> Friend
		friends = new Friend[100];
		friends[0] = new Friend("김나라", "1111-1231");
		friends[5] = new Friend("김나라", "1111-1234");
		friends[1] = new Friend("이그림", "2222-1231");
		friends[2] = new Friend("박나라", "3333-3333");
		friends[3] = new UnivFriend("최수진", "1234-5678", "수학과");
		friends[4] = new CompFriend("이시민", "2222-1212", "영업부");
	}

	public static FriendExe getInstance() {
		return singleton;
	}

	public void execute() {
		while (true) {
			System.out.println("----------------------");
			System.out.println("1.친구등록 2.조회 3.수정 4.삭제 5.종료");
			System.out.println("----------------------");
			int menu = ScanUtil.readInt("메뉴를 선택하세요."); // 인스턴스 메모리 할당.

			if (menu == 1) {
				System.out.println("등록");
				addFriend();
			} else if (menu == 2) {
				System.out.println("조회");
				showList();
			} else if (menu == 3) {
//				System.out.println("수정");
				modify();
			} else if (menu == 4) {
//				System.out.println("삭제");
				delete();
			} else if (menu == 5) {
				System.out.println("종료합니다.");
				break;
			}
		}
		System.out.println("끝.");
	}

	private void addFriend() {
		// 친구, 학교친구, 회사친구
		System.out.println("1.친구 2.학교친구 3.회사친구");
		int choice = ScanUtil.readInt("메뉴를 선택하세요");

		String name = ScanUtil.readStr("친구이름을 입력");
		String phone = ScanUtil.readStr("친구연락처를 입력");
		Friend friend = null;
		if (choice == 1) {
			friend = new Friend(name, phone);

		} else if (choice == 2) {
			String major = ScanUtil.readStr("전공을 입력");
			friend = new UnivFriend(name, phone, major);

		} else if (choice == 3) {
			String depart = ScanUtil.readStr("부서를 입력");
			friend = new CompFriend(name, phone, depart);
		}

		for (int i = 0; i < friends.length; i++) {
			if (friends[i] == null) {
				friends[i] = friend;
				break;
			}
			System.out.println("등록 성공");
		}

	}

	private void showList() {
		// 이름, 연락처 입력 => 홍길동, 김길동 > "길동" 둘다 나오게
		// 1111-1211, 2222-1211 > "1211" 둘다 나오게
		// 길동, 1211 -> 이름 & 연락처.
		String search1 = ScanUtil.readStr("이름을 입력");
		String search2 = ScanUtil.readStr("연락처를 입력");
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null && friends[i].getName().indexOf(search1) != -1
					&& friends[i].getPhone().indexOf(search2) != -1) {
//				System.out.println("이름 : " + friends[i].getName() + ", 연락처 : " + friends[i].getPhone());

//			if (friends[i] != null) {
				System.out.println(friends[i].toString());
			}
		}

//		for (int i = 0; i < friends.length; i++) {
//			if (friends[i] != null) {
//				if (!search1.equals("") && !search2.equals("")) { // 이름 && 전화번호
//					if (friends[i].getName().indexOf(search1) != -1 && friends[i].getPhone().indexOf(search2) != -1) {
//					}
//				} else if (!search1.equals("")) { // 이름
//					if (friends[i].getName().indexOf(search1) != -1) {
//					}
//
//				} else if (!search2.equals("")) { // 전화번호
//					if (friends[i].getPhone().indexOf(search2) != -1) {
//					}
//				} else { // 엔터, 엔터
//					System.out.println(friends[i].toString());
//				}
//			}
//		}
	}

	private void modify() {

		System.out.println("[친구 목록]");
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null)
				System.out.println("[" + i + "]" + friends[i].toString());
		}

		int num = ScanUtil.readInt("수정할 친구를 선택하세요.");
		String phone = ScanUtil.readStr("바꿀 번호를 입력하세요.");
		if (phone != null && phone != "") {
			friends[num].setPhone(phone);
			System.out.println("수정완료");

		}

		if (friends[num] instanceof UnivFriend) {
			String major = ScanUtil.readStr("바꿀 전공을 입력하세요.");
			if (major != null && major != "") {
				((UnivFriend) friends[num]).setMajor(major);
				System.out.println("수정완료");
			} else {
				System.out.println("수정되지 않았습니다.");
			}
		} else if (friends[num] instanceof CompFriend) {
			String depart = ScanUtil.readStr("바꿀 부서를 입력하세요.");
			if (depart != null && depart != "") {
				((CompFriend) friends[num]).setDepart(depart);
				System.out.println("수정완료");
			} else {
				System.out.println("수정되지 않았습니다.");
			}

		} else {
			System.out.println("수정되지 않았습니다.");
		}

	}

	private void delete() {
		System.out.println("[삭제 목록]");
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null)
				System.out.println("[" + i + "]" + friends[i].toString());
		}
		String del = ScanUtil.readStr("삭제할 친구를 입력하세요.");
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null && friends[i].getName().equals(del)) {
				friends[i] = null;
				System.out.println("삭제완료");
			} else if (friends[i] != null && del == "") {
				System.out.println("삭제할 것이 없습니다.");
				
			}

		}
	}
}
