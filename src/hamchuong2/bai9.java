package hamchuong2;

import java.util.Scanner;

public class bai9 {
    public static void xuatmatran(int n, int a[][]) {
        System.out.printf("ma tran vua nhap la :\n");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%d\t", a[i][j]);
            }
            System.out.printf("\n");
        }
    }

    public static int tong(int n, int a[][]) {
        int tong = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j] % 2 == 0) {
                    tong += a[i][j];
                }
            }
        }
        return tong;
    }

    public static float tbc(int n, int a[][]) {
        int tong = 0;
        int dem = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j] % 2 != 0) {
                    tong += a[i][j];
                    dem++;
                }
            }
        }
        float tbc = (float) tong / dem;
        return tbc;
    }

    public static void timmax(int n, int a[][]) {
        int max = a[0][0];
        int hang = 1;
        int cot = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j] > max) {
                    max = a[i][j];
                    hang = i + 1;
                    cot = j + 1;
                }
            }
        }
        System.out.println("phan tu dat gia tri lon nhat trong ma tran la " + max);
        System.out.printf("no lam o hang %d cot %d", hang, cot);
    }

    public static void timmin(int n, int a[][]) {
        int min = a[0][0];
        int hang = 1;
        int cot = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j] < min) {
                    min = a[i][j];
                    hang = i + 1;
                    cot = j + 1;
                }
            }
        }
        System.out.println("\nphan tu dat gia tri nho nhat trong ma tran la " + min);
        System.out.printf("no lam o hang %d cot %d", hang, cot);
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
        System.out.print("nhap cau ban muon thuc hien : ");
        char cau;
        cau = sc.next().charAt(0);
        switch (cau) {
            case 'a': {
                xuatmatran(n, a);
                break;
            }
            case 'b': {
                xuatmatran(n, a);
                System.out.println("tong ca phan tu chan trong ma tran la : " + tong(n, a));
                System.out.println("trung binh cong ca phan tu le trong ma tran la : " + tbc(n, a));
                break;
            }
            case 'c': {
                xuatmatran(n, a);
                timmax(n, a);
                timmin(n, a);
                break;
            }
            default:{
                System.out.println("cau nay ko ton tai");
                break;
            }
        }
        sc.close();
    }
}
