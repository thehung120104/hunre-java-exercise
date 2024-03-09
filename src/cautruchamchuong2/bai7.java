package cautruchamchuong2;

import java.util.Scanner;

public class bai7 {
    public static int a(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 0) {
            return 0;
        } else {
            return n + a(n - 1);
        }
    }

    public static float b(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 0) {
            return 0;
        } else {
            return (float) 1 / n + (float) b(n - 1);
        }
    }

    public static float c(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 0) {
            return 0;
        } else {
            return (float) Math.pow(-1, n + 1) * (float) 1 / n + (float) c(n - 1);
        }
    }

    public static float d(int n, int x) {
        if (n == 0) {
            return 1;
        } else {
            return (float) Math.sin(n * ((float) x * Math.PI / 180)) + (float) d(n - 1, x);
        }
    }

    public static void main(String[] args) {
        int n;
        char cau;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap cau ban muon thuc hien");
        cau = sc.next().charAt(0);
        switch (cau) {
            case 'a': {
                System.out.println("nhap n");
                n = sc.nextInt();
                System.out.println("kq cau a = " + a(n));
                break;
            }
            case 'b': {
                System.out.println("nhap n");
                n = sc.nextInt();
                System.out.println("kq cau b = " + b(n));
                break;
            }
            case 'c': {
                System.out.println("nhap n");
                n = sc.nextInt();
                System.out.println("kq cau c = " + c(n));
                break;
            }
            case 'd': {
                System.out.println("nhap n");
                n = sc.nextInt();
                int x;
                System.out.println("nhap goc apha");
                x = sc.nextInt();
                System.out.println("kq cau d = " + d(n, x));
                break;
            }
            default: {
                System.out.println("ko co cau nay");
                break;
            }
        }
        sc.close();
    }

}
