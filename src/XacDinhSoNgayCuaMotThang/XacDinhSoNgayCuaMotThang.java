package XacDinhSoNgayCuaMotThang;

import java.util.Scanner;

public class XacDinhSoNgayCuaMotThang {
	public static void main(String[] args) {
		int month,year;
		Scanner sc = new Scanner(System.in);
		System.out.println("Hay nhap 1 thang de kiem tra co bao nhieu ngay");
		month = sc.nextInt();
		
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("Tháng " + month + " có 31 ngày.");
			break;
		 case 4:
         case 6:
         case 9:
         case 11:
             System.out.println("Tháng " + month + " có 30 ngày.");
             break;
         case 2:
        	 System.out.println("hay nhap 1 nam can kiem tra ");
        	 year = sc.nextInt();
        	 if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
        		 System.out.println("thang " + month + " co 28 ngay");}
        	 
        	 else { System.out.println("thang " + month + " co 27 ngay");}
        		 
		default:
			
			System.out.printf("Ban hay co gang nhap thang de kiem tra");
			return;
		}
		sc.close();

	}
}

