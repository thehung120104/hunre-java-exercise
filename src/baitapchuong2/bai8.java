package baitapchuong2;
import java.util.Scanner;
public class bai8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap a:");
		double a = scanner.nextDouble();
		System.out.println("nhap b:");
		double b = scanner.nextDouble();
		System.out.println("nhap c:");
		double c = scanner.nextDouble();
		giaiPhuongTrinhBacHai(a ,b ,c);
		scanner.close();
	}
		public static void giaiPhuongTrinhBacHai ( double a, double b, double c) {
		double delta = b * b - 4 * a * c;
		if ( delta > 0) {
			double x1 = (-b * Math.sqrt(delta)) / (2 * a);
			double x2 = (-b * Math.sqrt(delta)) / (2 * a);
			System.out.println("phuong trinh co 2 nghiem la:");
			System.out.println("x1="+ x1);
			System.out.println("x2="+ x2);
		} else if (delta == 0) {
			double x = -b / 2 *a;
			System.out.println(" phuong trinh co nghiem kep la:");
			System.out.println("x="+ x);
		} else 	{
			System.out.println(" phuong trinh vo nghiem");
			
		}	
			
			
		
		}
	}


