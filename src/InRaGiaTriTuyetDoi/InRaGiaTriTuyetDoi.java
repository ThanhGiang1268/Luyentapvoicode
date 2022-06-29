package InRaGiaTriTuyetDoi;

import java.util.Scanner;

public class InRaGiaTriTuyetDoi {
	private static Scanner sc;

	public static void main(String[] args) {
		int a,b;
		sc = new Scanner(System.in);
		System.out.println("Hay nhap vao so a: ");
		a = sc.nextInt();
		System.out.println("Hay nhap vao so b");
		b = sc.nextInt();
		System.out.println("Gia tri tuyet doi cua hai so la:" + Math.abs(a-b));
		System.out.println("Gia tri tuyet doi cua hai so la:" + Math.abs(a+b));
		System.out.println("Gia tri tuyet doi cua hai so la:" + Math.abs(a*b));
		System.out.println("Gia tri tuyet doi cua hai so la:" + Math.abs(a/b));
	}
}
