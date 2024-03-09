package baitapchuong2;

import java.util.Scanner;

public class bai1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap vao a:");
		double a = scanner.nextDouble();
		System.out.println("nhap vao b:");
		double b = scanner.nextDouble();
	double Tong = a + b;
	double Tich = a * b;
	if (Tong / 2 == 0) {
		System.out.println("tong cua a va b la so chan");
	}else {
			System.out.println("tong cua a va b la so le");
		}
	if  (Tich / 2 == 0) {
	System.out.println("tich cua a va b la so chan");
	}else {
		System.err.println("tich cua a va b la so le");
	}

	}

}
