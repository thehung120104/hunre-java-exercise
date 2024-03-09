package baitaptrenlop;
import java.util.Scanner;

import javax.security.auth.kerberos.KerberosTicket;
public class bai3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner = new Scanner(System.in);
System.out.println("nhap so thuc x:");
double x = scanner.nextDouble();
System.out.println("nhap so thuc y");
double y = scanner.nextDouble();
scanner.close();
double S = Math.pow(x, y);
System.out.println("ket qua cua S:"+S);

	}

}
