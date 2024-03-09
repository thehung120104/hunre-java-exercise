package baitaptrenlop;
import java.util.Scanner;
public class bai8c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap gia tri a:");
		double a = scanner.nextDouble();
		System.out.println("nhap gia tri x:");
		double x = scanner.nextDouble();
		double KetQua = Math.sqrt(Math.abs(a + Math.sin(x) * Math.sin(x) - x));
		System.err.println("ket qua phep tinh:"+KetQua);

	}

}
