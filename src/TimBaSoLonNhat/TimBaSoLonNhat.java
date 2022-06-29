package TimBaSoLonNhat;

import java.util.Scanner;

public class TimBaSoLonNhat {
	public static void main(String[] args) {
		int a, b ,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Hay nhap vao so a: ");
		a = sc.nextInt();
		System.out.println("Hay nhap vao so b");
		b = sc.nextInt();
		System.out.println("Hay nhap vao so c");
		c = sc.nextInt();
		System.out.println("so lon nhat la: " + ((a>b?a:b) > c ? (a>b?a:b):c));
	}
	
}
