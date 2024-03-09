package cautruchamchuong2;

import java.util.Scanner;

public class bai8 {
    public static void xuatthuong(int n) {
        int tong = 0;
        System.out.print("xuat dang day ");
        while (n >= 1) {
            int i = n % 10;
            n = n / 10;
            System.out.print(+i);
            tong *= 10;
            tong += i;
        }
        System.out.println("\nxuat dang so " + tong);
    }

    public static int xuatdequy(int n) {
        int tong = n % 10;
        if (n < 10) {
            return tong;
        } else {
            if (tong != 0) {
                int t = n;
                while (tong < n) {
                    t = t / 10;
                    if (t < 1) {
                        break;
                    }
                    tong = tong * 10;
                }
            }
            return tong + xuatdequy(n / 10);
        }
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        xuatthuong(n);
        System.out.println("xuat de quy " + xuatdequy(n));
        sc.close();

    }

}
