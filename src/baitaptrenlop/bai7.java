package baitaptrenlop;
import java.util.Scanner;
public class bai7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap vao so a:");
		int a = scanner.nextInt();
		System.out.println("nhap vao so b:");
		int b = scanner.nextInt();
		scanner.close();
		int temp = a;
		a = b;
		b = temp;
		System.out.println("sau khi hoan doi:");
		System.out.println("a="+a);
		System.out.println("b="+b);

	}

}
