package baitaptrenlop;
import java.util.Scanner;
public class bai8b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap gia tri a:");
		double a = scanner.nextDouble();
		System.out.println("nhap gia tri b:");
		double b = scanner.nextDouble();
		System.out.println("nhap gia tri c:");
		double c = scanner.nextDouble();
		System.out.println("nhap gia tri h:");
		double h = scanner.nextDouble();
		System.out.println("nhap gia tri r:");
		double r = scanner.nextDouble();
		double KetQua = ((a + 4) * (b - 2 * c + 3)) / ((r / 2 * h) - 9 * (a - 1));
		System.out.println("ket qua phep tinh:"+KetQua);

	}

}
