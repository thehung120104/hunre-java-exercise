package baitaptrenlop;
import java.util.Scanner;
public class bai1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner = new Scanner(System.in);
System.out.println(" nhap do dai canh a:");
double a = scanner.nextDouble();
System.out.println("nhap do dai canh b:");
double b = scanner.nextDouble();
scanner.close();
double dientich = a*b;
double chuvi = 2*(a+b);
double duongcheo = Math.sqrt(a*a+b*b);
System.out.println("dien tich hinh chu nhat la:"+dientich);
System.out.println("chu vi hinh chu nhat la:"+chuvi);
System.out.println("duong cheo hinh chu nhat la:"+duongcheo);
	

	}

}
