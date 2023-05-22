package switchCase;

import java.util.Scanner;

public class TestClass01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("수 입력");
		int num = sc.nextInt();
		switch(num) {
		case 1:System.out.println("1 입력");break;
		case 2:System.out.println("2 입력");break;
		default:System.out.println("그 외 입력");break;
		}
		sc.close();
	}
}
