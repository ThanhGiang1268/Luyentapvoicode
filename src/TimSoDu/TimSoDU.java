package TimSoDu;

import java.util.Scanner;

public class TimSoDU {
	public static void main(String[] args) {
		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Hay nhap vao so a: ");
		a = sc.nextInt();
		System.out.println("Hay nhap vao so b");
		b = sc.nextInt();
		System.out.println("So du can tim la " + (a % b));
	}
}
