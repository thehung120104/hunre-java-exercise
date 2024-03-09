package baitaptrenlop;
import java.util.Scanner;

public class bai2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner = new Scanner(System.in);
System.out.println("nhap ban kinh duong tron:");
double bankinh = scanner.nextDouble();
scanner.close();
double dientich = Math.PI * Math.pow(bankinh,2);
double chuvi = 2*Math.PI*bankinh;
System.out.println("dien tich hinh tron la:"+dientich);
System.out.println("chu vi hinh tron la:"+chuvi);


	}

}
