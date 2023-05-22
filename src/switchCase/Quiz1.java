package switchCase;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("요일 입력: ");
		int dayOfWeek = sc.nextInt();
		System.out.print(dayOfWeek+": ");
		dayOfWeek%=7;
		if(dayOfWeek%7 == 0) {
			dayOfWeek=7;
		}
		switch(dayOfWeek) {
		case 1: System.out.println("월");break;
		case 2: System.out.println("화");break;
		case 3: System.out.println("수");break;
		case 4: System.out.println("목");break;
		case 5: System.out.println("금");break;
		case 6: System.out.println("토");break;
		case 7: System.out.println("일");break;
		}
		sc.close();
	}
}
