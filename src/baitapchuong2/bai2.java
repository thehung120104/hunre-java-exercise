package baitapchuong2;

import java.util.Scanner;

public class bai2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap canh :");
		double canh = scanner.nextDouble();
		System.out.println("nhap duong cao:");
		double H = scanner.nextDouble();
		double dientichtamgiac = 0.5 * canh * H;
		System.out.println("dien tich tam giac la:");
		double dientichchunhat = canh * H;
		if (dientichchunhat %2 == 0) {
		System.out.println("dien tich hinh chu nhat la so chan");
		} else {
			System.out.println("dien tich hinh chu nhat la so le");
		}
		

	}

}
