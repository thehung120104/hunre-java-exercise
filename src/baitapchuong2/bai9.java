package baitapchuong2;

import java.util.Scanner;


public class bai9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap a:");
		double a = scanner.nextDouble();
		System.out.println("nhap b:");
		double b = scanner.nextDouble();
		System.out.println("nhap c:");
		double c = scanner.nextDouble();
		giaiPhuongTrinhBacBon(a, b, c);
		scanner.close();
	}
		public static void giaiPhuongTrinhBacBon (double a, double b, double c) {
			double delta = b * b - 4 * a *c;
			if (delta > 0) { 
				double y1 = ( -b + Math.sqrt(delta)) / (2 * a);
				double y2 = ( -b + Math.sqrt(delta)) / (2 * a);
				double x1 = Math.sqrt(y1);
				double x2 =  -Math.sqrt(y1);
				double x3 = Math.sqrt(y2);
				double x4 = -Math.sqrt(y2); 
				System.out.println("phuong trinh co 4 nghiem phan biet");
				System.out.println("x1="+ x1);
				System.out.println("x2="+ x2);
				System.out.println("x3="+ x3);
				System.out.println("x4="+ x4);
			} else if ( delta == 0){
				double y = -b / (2 * a);
				double x1 = Math.sqrt(y);
				double x2 = -Math.sqrt(y);
				System.out.println("phuong trinh co 2 nghiem kep");
				System.out.println("x1="+ x1);
				System.out.println("x2="+ x2);
			} else {
				System.out.println("phuong trinh vo nghiem");
			}
				
			}	
				
			
		}
		
		
		
		

	
		

