package baitapchuong2;

import java.util.Scanner;

public class bai5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

	      
        System.out.print("Nhap so thuc a: ");
        double a = scanner.nextDouble();

        System.out.print("Nhap so thuc b: ");
        double b = scanner.nextDouble();

        System.out.print("Nhap so thuc c: ");
        double c = scanner.nextDouble();
        
        if (2 * a * b - c -7 != 0) {
        	double KetQua = ((a + b) * c *(Math.sin(a) - 1))/ 2 * a * b - c + 7; 
        	System.out.println("gia tri bieu thuc:" + KetQua);
        } else {
			System.out.println("mau khong the bang 0");
		}
	}
}
        
        
	


