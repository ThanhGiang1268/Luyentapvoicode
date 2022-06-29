package GiaiPhuongTrinhBacNhat;

import java.util.Scanner;

public class GiaiPhuongTrinhBacNhat {
 private static Scanner sc;
private static int x;

public static void main(String[] args) {
	int a,b;
	sc = new Scanner(System.in);
	System.out.println("nhap vao so a");
	a = sc.nextInt();
	System.out.println("nhap vao so b");
	b = sc.nextInt();
	
	x = -b/a;
	if(a==0 && b!=0) 
		System.out.println("Phuong trinh vo nghiem");
	 else if (a==0 && b==0) 
		System.out.println("Phuong trinh co mot nghiem duy nhat x = " + 0);
	 else
		System.out.println("Phuong trinh co vo so nghiem x = " + -b/a);
}
}
