package thi;
import java.util.Scanner;
public class nguyenthehung_cau1 {


public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // nhap vao so nguyen duong n
    System.out.print("Nhap vao so nguyen duong  n: ");
    int n = scanner.nextInt();

    // Kiem tra n la so chan hay le
    if (n % 2 == 0) {
        // Neu n la chan , tinh tong S(n)=1/2 + 1/4 + … + 1/2n
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / (2 * i);
        }
        System.out.println("Tong S(n) = " + sum);
    } else {
        // Neu n la le , tinh tong S(n) = 1/3 + 1/5 + … + 1/2n+1
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / (2 * i + 1);
        }
        System.out.println("Tong S(n) = " + sum);
    }

}
}