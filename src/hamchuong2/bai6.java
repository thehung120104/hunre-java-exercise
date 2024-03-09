package hamchuong2;

import java.util.Scanner;

public class bai6 {
    public static void xuatmatran(int n, int m, int a[][]) {
        System.out.printf("ma tran vua nhap la :\n");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("%d\t", a[i][j]);
            }
            System.out.printf("\n");
        }
    }

    public static void  timdem(int n, int m, int a[][]) {
        int tong=0;
        int dem=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (a[i][j]%(i+j+2)==0) {
                    tong+=a[i][j];
                    dem++;
                }
            }
        }
        System.out.printf("co %d phan tu trong ma tran chia het cho tong vi tri cua chung",dem);
        System.out.printf("\ntong cac so chia het cho tong vi tri cua no la %d",tong);
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
                System.out.printf("a[%d][%d] = ", i+1, j+1);
                a[i][j] = sc.nextInt();
            }
        }
        xuatmatran(n, m, a);
        timdem(n,m,a);
        sc.close();
    }
}
