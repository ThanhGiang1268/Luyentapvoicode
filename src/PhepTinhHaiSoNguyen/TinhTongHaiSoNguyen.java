package PhepTinhHaiSoNguyen;

import java.util.Scanner;

public class TinhTongHaiSoNguyen {

	public static void main(String[] args) {
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Hay nhap vao so a: ");
		a = sc.nextInt();
		System.out.println("Hay nhap vao so b");
		b = sc.nextInt();
		System.out.println("Tong hai so nguyen la " + (a+b));
		System.out.println("Tong hai so nguyen la " + (a-b));
		System.out.println("Tong hai so nguyen la " + (a*b));
		System.out.println("Tong hai so nguyen la " + (a/b));
	}

}
