package co.yedam;

import java.util.Scanner;

public class ScanUtil {
	// static을 붙여줌으로써 ScanUtil 클래스를 부를때 바로 readInt를 읽어 들일 수 있음
	// >> 좀 더 간단한 식으로 바꿀 수 있다.
	static Scanner scn = new Scanner(System.in);

	public static int readInt(String msg) {
		System.out.println(msg);
		int num = scn.nextInt();
		scn.nextLine();
		return num;
	}

	public static String readStr(String msg) {
//		if (scn.hasNextLine()) { // 행이 있는지 확인 후 boolean을 리턴합니다. 줄바뀜이 있으면 true를 리턴합니다.
//			scn.nextLine();
//		}
		System.out.println(msg);
		return scn.nextLine();
	}
}
