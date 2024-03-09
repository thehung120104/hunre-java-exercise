package hamchuong2;

import java.util.Scanner;

public class bai2 {
    public static void nhap(int n, int mang1[]) {
        System.out.print("bat dau nhap day ");
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            mang1[i] = scan.nextInt();
        }
        scan.close();
    }

    public static void xuat(int n, int a[]) {
        for (int i = 0; i < n; i++) {
            System.out.printf(" %d ", a[i]);
        }
    }

    public static void main(String[] args) {
        int n;
        int a[];
        a = new int[100];
        Scanner sc = new Scanner(System.in);
        char cau;
        System.out.print("nhap cau ban muon thuc hien ");
        cau = sc.next().charAt(0);
        switch (cau) {
            case 'a': {
                int b[], c[];
                int r = 0;
                int w = 0;
                b = new int[50];
                c = new int[50];
                System.out.print("nhap n ");
                do {
                    n = sc.nextInt();
                } while (n <= 0 || n >= 100);
                nhap(n, a);
                for (int i = 0; i < n; i++) {
                    if (a[i] % 3 == 0) {
                        b[r] = a[i];
                        r++;
                    } else {
                        c[w] = a[i];
                        w++;
                    }
                }
                System.out.print("day cac so chia het cho 3 la ");
                xuat(r, b);
                System.out.print("\nday cac so khong chia het cho 3 la ");
                xuat(w, c);
                System.out.print("\ntat ca phan tu cua  day ban dau la ");
                xuat(n, a);
                break;
            }
            case 'b': {
                int tong = 0;
                int r = 0;
                int w = 0;
                System.out.print("nhap n ");
                do {
                    n = sc.nextInt();
                } while (n <= 0 || n >= 100);
                nhap(n, a);
                for (int i = 0; i < n; i++) {
                    if (a[i] % 2 == 0) {
                        tong += a[i];
                        r++;
                    } else {
                        w++;
                    }
                }
                float tbc = (float) tong / r;
                System.out.println("trung binh cong cac so duong trong day la " + tbc);
                System.out.println("so luong cac so le trong day la " + w);
                break;
            }
            case 'c': {
                int b[];
                int r = 0;
                b = new int[100];
                System.out.print("nhap n ");
                do {
                    n = sc.nextInt();
                } while (n <= 0 || n >= 100);
                nhap(n, a);
                for (int i = 0; i < n; i++) {
                    if (i == n - 1) {
                        break;
                    }
                    if (a[i] == a[i + 1]) {
                        b[r] = a[i];
                        r++;
                    }
                }
                if (r != 0) {
                    System.out.print("cac cap so bang nhau la ");
                    for (int i = 0; i < r; i++) {
                        System.out.printf(" %d - %d; ", b[i], b[i]);
                    }
                    System.out.printf("\nso cap so bang nhau tim duoc la %d ", r);
                    if (r % 2 == 0) {
                        System.out.print("\nso cap so bang nhau tim duoc la so chan ");
                    } else {
                        System.out.print("\nso cap so bang nhau tim duoc la so le ");
                    }
                } else {
                    System.out.println("ko co cap so nao bang nhau");
                }
                break;
            }
            case 'd': {
                int r = 0;
                System.out.print("nhap n ");
                do {
                    n = sc.nextInt();
                } while (n <= 0 || n >= 100);
                nhap(n, a);
                for (int i = 0; i < n; i++) {
                    if (i == n - 2) {
                        break;
                    } else {
                        if (a[i] + a[i + 2] == 2 * a[i + 1]) {
                            r++;
                        }
                    }
                }
                if (r != 0) {
                    System.out.println("trong day co cap so cong");
                } else {
                    System.out.println("trong day khong co cap so cong");
                }
                break;
            }
            case 'e': {
                int t = 1;
                int g = 1;
                int tam;
                System.out.print("nhap n ");
                do {
                    n = sc.nextInt();
                } while (n <= 0 || n >= 100);
                nhap(n, a);
                for (int i = 0; i < n; i++) {
                    if (i == n - 1) {
                        break;
                    } else {
                        if (a[i] < a[i + 1]) {
                            t++;
                        }
                        if (a[i] > a[i + 1]) {
                            g++;
                        }
                    }
                }
                if (t == n) {
                    System.out.print("day tang");
                    xuat(n, a);
                }
                if (g == n) {
                    System.out.print("day giam");
                    xuat(n, a);
                }
                if (t != n && g != n) {
                    System.out.print("day can sap xep lai");
                    for (int i = 0; i < n - 1; i++) {
                        for (int j = i + 1; j < n; j++) {
                            if (a[i] > a[j]) {
                                tam = a[i];
                                a[i] = a[j];
                                a[j] = tam;
                            }
                        }
                    }
                    xuat(n, a);
                }
                break;
            }
            case 'f': {
                int tong = 0;
                float x, y;
                System.out.print("nhap n ");
                do {
                    n = sc.nextInt();
                } while (n <= 0 || n >= 100);
                System.out.print("nhap khoang (x,y) ");
                x = sc.nextFloat();
                y = sc.nextFloat();
                nhap(n, a);
                for (int i = 0; i < n; i++) {
                    tong += a[i];
                }
                float tbc = (float) tong / n;
                if (tbc >= x && tbc <= y) {
                    System.out.printf("trung binh cong day = %f nam trong khoang (%f,%f)", tbc, x, y);
                } else {
                    System.out.printf("trung binh cong day = %f nam ngoai khoang (%f,%f)", tbc, x, y);
                }
                break;
            }
            case 'g': {
                int b[], c[];
                int r = 0;
                int w = 0;
                b = new int[50];
                c = new int[50];
                System.out.print("nhap n ");
                do {
                    n = sc.nextInt();
                } while (n <= 0 || n >= 100);
                nhap(n, a);
                for (int i = 0; i < n; i++) {
                    if (a[i] % 2 == 0) {
                        b[r] = a[i];
                        r++;
                    }
                    if (a[i] < 0) {
                        c[w] = a[i];
                        w++;
                    }
                }
                int min = b[0];
                int max = c[0];
                for (int i = 0; i < r; i++) {
                    if (min > b[i]) {
                        min = b[i];
                    }
                }
                for (int j = 0; j < w; j++) {
                    if (max < c[j]) {
                        max = c[j];
                    }
                }
                if (r != 0) {
                    System.out.printf("so chan nho nhat trong day la %d ", min);
                } else {
                    System.out.println("day ko co so chan");
                }
                if (w != 0) {
                    System.out.printf("\nso am lon nhat trong day la %d ", max);
                } else {
                    System.out.println("\nday ko co so am");
                }
                break;
            }
        }
        sc.close();
    }
}
