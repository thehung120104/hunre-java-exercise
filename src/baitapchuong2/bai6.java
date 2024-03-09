package baitapchuong2;

import java.util.Scanner;

public class bai6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	       
	        System.out.print("Nhap so thuc a: ");
	        double a = scanner.nextDouble();

	        System.out.print("Nhap so thuc b: ");
	        double b = scanner.nextDouble();

	        System.out.print("Nhap so thuc c: ");
	        double c = scanner.nextDouble();
	        double max = a;
	        if (b > max) {
	        	max = b;
	        }
	        if (c > max) {
	        	max = c;
	        }
	        	double min = a ;
	        	if (b < min) {
	        		min = b;
	        	}
	        		
	        		if (c < min) {
	        		min = c;
	        	}
	        		System.out.println("gia tri lon nhat:"+max);
	        		System.out.println("gia tri nho nhat:"+min);
	        	}
	        }

	


