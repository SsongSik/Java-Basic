package day1;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���ڸ� ���� �Է�");
		String input = scan.nextLine();
		int num = Integer.parseInt(input);
		
		System.out.println("�Է� ���� : "+input);
		System.out.printf("num=%d%n", num);

	}

}
