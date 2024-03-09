package hamchuong2;

import java.util.Scanner;

public class bai5 {
    public static void xuatmatran(int n, int m, int a[][]) {
        System.out.printf("ma tran vua nhap la :\n");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("%d\t", a[i][j]);
            }
            System.out.printf("\n");
        }
    }

    public static int timmax(int n, int m, int a[][]) {
        int max = a[0][0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (a[i][j] > max) {
                    max = a[i][j];
                }
            }
        }
        return max;
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
                System.out.printf("a[%d][%d] = ", i, j);
                a[i][j] = sc.nextInt();
            }
        }
        xuatmatran(n, m, a);
        System.out.println("gia tri lon nhat trong ma tran la : " + timmax(n, m, a));
        System.out.print("vi tri cac phan tu dat gia tri lon nhat la : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (a[i][j] == timmax(n, m, a)) {
                    System.out.printf("a[%d][%d] ", i, j);
                }
            }
        }
        sc.close();
    }
}
