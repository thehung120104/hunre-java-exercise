package baitaptrenlop;

import java.util.Scanner;
public class bai4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner = new Scanner(System.in);
System.out.println(" nhap so thuc a:");
double a = scanner.nextDouble();
System.out.println("nhap  so thuc x:");
double x = scanner.nextDouble();
scanner.close();
double z = Math.exp(a+Math.sin(x)*Math.sin(x)-x);



System.out.println("z="+z);
	}

}
