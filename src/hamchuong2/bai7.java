package hamchuong2;

import java.util.Scanner;

public class bai7 {
    public static void xuatmatran(int n, int m, int a[][]) {
        System.out.printf("ma tran vua nhap la :\n");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("%d\t", a[i][j]);
            }
            System.out.printf("\n");
        }
    }

    public static void tongdong1(int m, int a[][]) {
        int tong = 0;
        for (int i = 0; i < m; i++) {
            tong += a[0][i];
        }
        System.out.println("tong ca phan tu o hang 1 la : " + tong);
    }

    public static void tongcotk(int n, int m, int a[][], int k) {
        int tong = 0;
        for (int i = 0; i < n; i++) {
            tong += a[i][k - 1];
        }
        System.out.printf("\ntong ca phan tu o cot %d la %d", k, tong);
    }

    public static void main(String[] args) {
        int n, m;
        int a[][];
        a = new int[100][100];
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap n va m ");
        do {
            n = sc.nextInt();
            m = sc.nextInt();
        } while (n <= 0 || n >= 100 || m <= 0 || m >= 100);
        System.out.println("nhap ma tran ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("a[%d][%d] = ", i + 1, j + 1);
                a[i][j] = sc.nextInt();
            }
        }
        xuatmatran(n, m, a);
        tongdong1(m, a);
        int k;
        System.out.print("nhap k ");
        do {
            k = sc.nextInt();
        } while (k > m || k <= 0);
        tongcotk(n, m, a, k);
        sc.close();
    }
}
