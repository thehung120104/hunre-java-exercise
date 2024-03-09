package baitaptrenlop;
import java.util.Scanner;


public class bai9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap gia tri A:");
		double A = scanner.nextDouble();
		System.out.println("nhap gia tri B:");
		double B = scanner.nextDouble();
		System.out.println("nhap gia tri C:");
		double C = scanner.nextDouble();
		System.out.println("nhap gia tri xi:");
		double xi = scanner.nextDouble();
		System.out.println("nhap gia tri yi:");
		double yi = scanner.nextDouble();
		double distance = calulateDistance(A, B, C, xi, yi);
		System.out.println("khoang cach diem("+ xi +","+ yi +") den duong thang Ax +By +C = 0 la:" +distance);
	}
		private static double calulateDistance(double A, double B, double C, double xi, double yi) {
			return Math.abs(A * xi + B * yi + C) / Math.sqrt( A * A + B * B);
		}
	}

;
