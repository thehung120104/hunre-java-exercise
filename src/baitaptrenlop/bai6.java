package baitaptrenlop;
import java.util.Scanner;
public class bai6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap gia tri x:");
		double x = scanner.nextDouble();
		if (x < 0) {
			System.out.println("gia tri cua x lon hon 0 . chuong trinh ket thuc.");
			return;
		}
		System.out.println("nhap gia tri n:");
		double n = scanner.nextDouble();
		double result = Math.pow(x,1/n);
		System.err.println("ket qua phep tinh :"+result);
		
		
		
		

	}

}
