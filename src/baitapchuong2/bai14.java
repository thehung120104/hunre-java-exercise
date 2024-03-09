package baitapchuong2;
import java.util.Scanner;
public class bai14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap a:");
		int a = scanner.nextInt();
		System.out.println("nhap b:");
		int b = scanner.nextInt();
		System.out.println("nhap c:");
		int c = scanner.nextInt();
		System.out.println("nhap d:");
		int d = scanner.nextInt();
		int tong = a + b + c + d;
		int bieuThuc = a * b - c * d;
		if (bieuThuc != 0) {
			System.out.println("tong 4 so: " + tong);
			System.out.println("gia tri bieu thuc: " + bieuThuc);
			System.out.println("tong  khong chia het cho bieu thuc");
			System.out.println("phan du: " + (tong % bieuThuc));
		} else {
			System.out.println("tong 4 so: " + tong);
			System.out.println("gia tri bieu thuc: " + bieuThuc);
			System.out.println("tong chia het cho bieu thuc");
			System.out.println("thuong: " + (tong / bieuThuc));
			
		}

	}

}
