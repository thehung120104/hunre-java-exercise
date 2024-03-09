package baitapchuong2;
import java.util.Scanner;
public class bai7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap x:");
		double x = scanner.nextDouble();
		  double f;
	        if(x<0.5)
	            f=2*Math.sin(x+3);
	        else if(0.5<=x&&x<=13.5)
	            f=5*x*x+x;
	        else 
	            f=4*x+7;
	        System.out.println("Gia tri F(n) = "+f);
	    }
	}
		
		

	


