package hamchuong2;

import java.util.Scanner;

public class bai3 {
    public static void nhap(int n, int a[]) {
        System.out.print("bat dau nhap day ");
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        scan.close();
    }

    public static void xuat(int n, int a[]) {
        for (int i = 0; i < n; i++) {
            System.out.printf(" %d", a[i]);
        }
    }

    public static void sapxeptang(int n, int a[]) {
        int tam;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    tam = a[i];
                    a[i] = a[j];
                    a[j] = tam;
                }
            }
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
        nhap(n, a);
        int min = a[0];
        for (int i = 0; i < n; i++) {
            if (min > a[i]) {
                min = a[i];
            }
        }
        System.out.println("min =  " + min);
        int b[];
        b = new int[100];
        int r = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] == a[j]) {
                    b[r] = j;
                    r++;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < r; j++) {
                if (i == b[j]) {
                    a[i] = min;
                }
            }
        }
        int dem = 0;
        for (int d = 0; d < n; d++) {
            if (a[d] == min) {
                dem++;
            }
        }
        do {
            for (int i = 0; i < n; i++) {
                if (a[i] == min) {
                    for (int j = i; j < n - 1; j++) {
                        a[j] = a[j + 1];

                    }
                    dem--;
                    n--;
                }
            }
        } while (dem > 1);
        System.out.print("mang sau khi xoa ca phan tu trung nhau la : ");
        xuat(n, a);
        sapxeptang(n, a);
        System.out.print("\nmang sau khi sap xep tang la : ");
        xuat(n, a);
        sc.close();

    }

}
