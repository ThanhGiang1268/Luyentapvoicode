package ChuViDienTichHCN;

import java.util.Scanner;

public class ChuViDienTichHCN {
	public static void main(String[] args) {
		long cd,cr;
		Scanner sc = new Scanner(System.in);
		System.out.println("chieu dai hinh chu nhat la");
		cd = sc.nextLong();
		System.out.println("chieu rong hinh chu nhat la");
		cr = sc.nextLong();
		System.out.println("dien tich hinh chu nhat la: " + (cd*cr));
		System.out.println("chu vi hinh chu nhat la: "+ (cd+cr)*2);
		
	}
}
