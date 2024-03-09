package baitaptrenlop;
import java.util.Scanner;
public class Nhap_xuatDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.print("moi ban nhap ten:");
String name = sc.nextLine();
System.out.print("moi ban nhap tuoi:");
int old=Integer.parseInt(sc.nextLine());
System.out.print("nhap que quan:");
String add=sc.nextLine();
System.out.printf("chao ban%s,tuoi%d,que quan:%s",name,old,add);
	}

}
