package baitaptrenlop;
import java.util.Scanner;
public class bai7b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap so a:");
		int a = scanner.nextInt();
		System.out.println("nhap so b:");
		int b = scanner.nextInt();
		scanner.close();
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("khi hoan doi:");
		System.out.println("a="+a);
		System.out.println("b="+b);
	}
}
