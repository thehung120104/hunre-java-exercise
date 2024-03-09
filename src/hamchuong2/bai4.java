package hamchuong2;

import java.util.Scanner;

public class bai4 {


    public static void xuat(int n, int a[]) {
        for (int i = 0; i < n; i++) {
            System.out.printf(" %d", a[i]);
        }
    }

    public static void main(String[] args) {
        int n;
        int a[];
        a = new int[100];
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap n ");
        do {
            n = sc.nextInt();
        } while (n <= 0 || n >= 100);
        System.out.print("bat dau nhap day ");
        int k;
        do {
            k = 0;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                if (i == n - 1) {
                    break;
                }
                if (a[i] <= a[i + 1]) {
                    k++;
                }
            }
            if (k == n - 1) {
                System.out.println("nhap dung");
                break;
            } else {
                System.out.println("nhap lai");
            }
        } while (k != n - 1);
        System.out.print("day vua nhap la :");
        xuat(n, a);
        System.out.print("\nnhap so muon chen ");
        int x;
        x = sc.nextInt();
        int y = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] > x) {
                if (i != 0) {
                    y = i;
                    break;
                } else {
                    y = 0;
                    break;
                }
            }
            if (x >= a[n - 1]) {
                y = n;
                break;
            }
        }
        if (y == n) {
            n++;
            a[y] = x;
            xuat(n, a);
        } else {
            n++;
            for (int i = n; i > y; i--) {
                a[i] = a[i - 1];
            }
            a[y] = x;
            xuat(n, a);
        }
        sc.close();
    }
}
