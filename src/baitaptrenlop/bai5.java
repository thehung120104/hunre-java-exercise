package baitaptrenlop;
import java.util.Scanner;
public class bai5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner scanner= new Scanner(System.in);
 System.out.println("nhap van toc V (m/s):");
 double V = scanner.nextDouble();
 System.out.println("nhap thoi gian T (s):");
 double T = scanner.nextDouble();
 scanner.close();
 double H = V * T - 0.5 * 9.8 * T * T;
 double S = V * T;
 System.out.println("do cao H cua qua bong la :"+H+"met");
 System.out.println("tam xa S cua qua bong la"+S+"met");
 
 
	}

}
