package day1;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("두자리 정수 입력");
		String input = scan.nextLine();
		int num = Integer.parseInt(input);
		
		System.out.println("입력 내용 : "+input);
		System.out.printf("num=%d%n", num);

	}

}
