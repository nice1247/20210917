package co.yedam;

import java.util.Scanner;

public class ScanUtil {
	// static�� �ٿ������ν� ScanUtil Ŭ������ �θ��� �ٷ� readInt�� �о� ���� �� ����
	// >> �� �� ������ ������ �ٲ� �� �ִ�.
	static Scanner scn = new Scanner(System.in);

	public static int readInt(String msg) {
		System.out.println(msg);
		int num = scn.nextInt();
		scn.nextLine();
		return num;
	}

	public static String readStr(String msg) {
//		if (scn.hasNextLine()) { // ���� �ִ��� Ȯ�� �� boolean�� �����մϴ�. �ٹٲ��� ������ true�� �����մϴ�.
//			scn.nextLine();
//		}
		System.out.println(msg);
		return scn.nextLine();
	}
}
