package baitapchuong2;

import java.util.Scanner;

public class bai3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap a:");
		double a = scanner.nextDouble();
		System.out.println("nhap b:");
		double b = scanner.nextDouble();
		System.out.println("nhap c:");
		double c = scanner.nextDouble();
		 if ( KieuTamGiac (a, b, c)) {
	
	            String KieuTamGiac = XacDinhKieuTamGiac(a, b, c);

	          
	            System.out.println("Ba so thuc a, b, c la do dai 3 canh cua 1 tam giac.");
	            System.out.println("Loai tam giac la: " + KieuTamGiac);
	        } else {
	            System.out.println("Ba so thuc  a, b, c khong phai la do dai 3 canh 1 tam giac.");
	        }

	      
	        scanner.close();
	    }

	   
	    private static boolean KieuTamGiac(double a, double b, double c) {
	        return a + b > c && b + c > a && c + a > b;
	    }

	 
	    private static String XacDinhKieuTamGiac(double a, double b, double c) {
	        if (a * a + b * b == c * c || b * b + c * c == a * a || c * c + a * a == b * b) {
	            return "Tam giac vuong";
	        } else if (a * a + b * b < c * c || b * b + c * c < a * a || c * c + a * a < b * b) {
	            return "Tam giac tu";
	        } else {
	            return "Tam giac nhon";
	        }

	}

}
