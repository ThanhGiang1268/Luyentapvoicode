package MayTinhBoTui;

import java.util.Scanner;

public class MayTinhBoTui {
	private static Scanner sc;

	public static void main(String[] args) {
		float s1, s2;
		sc = new Scanner(System.in);
		System.out.println("nhap vao so 1");
		s1 = sc.nextFloat();
		System.out.println("nhap vao so 2");
		s2 = sc.nextFloat();
		System.out.println("moi lua chon phep tinh");
		System.out.print("Chon phep tinh (+, -, *, /): ");
		char operator = sc.next().charAt(0);
		sc.close();
		double output;
		switch (operator) {
		case '+':
			output = s1 + s2;
			break;
		case '-':
			output = s1 - s2;
			break;
		case '*':
			output = s1 * s2;
			break;
		case '/':
			output = s1 / s2;
			break;
		default:
			System.out.printf("Ban chua chon phep tinh co ban");
            return;
		}
		System.out.println("ket qua cua phep tinh thu nhat va phep tinh thu hai la");
		System.out.println( s1 +" "+operator+" "+s2+" = " + output);
	}
}
