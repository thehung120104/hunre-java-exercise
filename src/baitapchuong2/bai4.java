package baitapchuong2;

import java.util.Scanner;

public class bai4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

		   
	        System.out.print("Nhap so thuc a: ");
	        double a = scanner.nextDouble();

	        System.out.print("Nhap so thuc b: ");
	        double b = scanner.nextDouble();

	        System.out.print("Nhap so thuc  c: ");
	        double c = scanner.nextDouble();	      
	        if (isTriangle(a, b, c)) {	           
	            double DienTich = TinhdienTich (a, b, c);
	            double ChuVi= TinhChuVi(a, b, c);
	            double BanKinhDuongTron = TinhBanKinhDuongTron(a, b, c);

	          
	            System.out.println("Ba so thuc a, b, c là do dai ba canh cua mot tam giac.");
	            System.out.println("Dien tich tam giac la: " + DienTich);
	            System.out.println("Chu vi tam giac la: "+ ChuVi );
	            System.out.println("ban kinh duong tron ngoai tiep tam giac la: " + BanKinhDuongTron );
	        } else {
	            System.out.println("Ba so thuc a, b, c khong phai la do dai ba canh cua mot tam giac.");
	        }

	        
	      
	    }

	   
	    private static boolean isTriangle(double a, double b, double c) {
	        return a + b > c && b + c > a && c + a > b;
	    }

	  
	    private static double TinhdienTich(double a, double b, double c) {
	        double s = (a + b + c) / 2;
	        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
	    }

	    
	    private static double TinhChuVi(double a, double b, double c) {
	        return a + b + c;
	    }

	  
	    private static double TinhBanKinhDuongTron(double a, double b, double c) {
	        return (a * b * c) / (4 * Math.sqrt((a + b + c) * (a + b - c) * (b + c - a) * (c + a - b)));
	    }

	}

	


