package hamchuong2;

import java.util.Scanner;

public class bai8 {
    public static void xuatmatran(int n, int a[][]) {
        System.out.printf("ma tran vua nhap la :\n");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%d\t", a[i][j]);
            }
            System.out.printf("\n");
        }
    }

    public static int kiemtra(int n, int a[][]) {
        int dem=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(a[i][j]==a[j][j]) {
                    dem++;
                }
            }
        }
        return dem;
    }

    public static void main(String[] args) {
        int n;
        int a[][];
        a = new int[100][100];
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap n  ");
        do {
            n = sc.nextInt();
        } while (n <= 0 || n >= 100);
        System.out.println("nhap ma tran ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("a[%d][%d] = ", i + 1, j + 1);
                a[i][j] = sc.nextInt();
            }
        }
        xuatmatran(n, a);
        if(kiemtra(n,a)==n) {
            System.out.println("ma tran la ma tran doi xung");
        }
        else {
            System.out.println("ma tran khong la ma tran doi xung");
        }
        sc.close();
    }
}
