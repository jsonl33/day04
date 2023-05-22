package switchCase;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String myHome = "";
		String myOffice = "";
		while(true) {
			System.out.println("1. 우리집 등록");
			System.out.println("2. 회사 등록");
			System.out.println("3. 등록 보기");
			System.out.println("4. 종료");
			int sel = sc.nextInt();
			switch(sel) {
			case 1:
				myHome = sc.next();
				break;
			case 2:
				myOffice = sc.next();
				break;
			case 3:
				System.out.println("우리 집 : " + myHome);
				System.out.println("회사 : " + myOffice);
				System.out.println("");
				break;
			case 4:
				sc.close();
				System.out.println("프로그램 종료");
				return;
			}
		}
	}
}
