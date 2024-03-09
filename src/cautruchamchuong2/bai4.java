package cautruchamchuong2;
import java.util.Scanner;

public class bai4 {
    public static int dem(int n) {
        int i = 1;
        while (n > 1) {
            if (n < 10) {
                break;
            }
            n = n / 10;
            i++;
        }
        return i;
    }

    public static int tong(int n) {
        int k = dem(n);
        int so = 0;
        double thuong;
        for (int i = k; i >= 0; i--) {
            thuong = (int) n / Math.pow(10, i - 1);
            double v = (int) thuong * Math.pow(10, i - 1);
            n = n - (int) v;
            so += (int) thuong;

        }
        return so;
    }

    public static int kt(int n, int tong) {
        int i = 1;
        if (tong % 3 == 0) {
            return i;
        } else {
            return -1;
        }

    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println("tong cac chu so cu so " + n + " la " + tong(n));
        if (kt(n, tong(n)) == 1) {
            System.out.println(n + " chia het cho 3");
        } else {
            System.out.println(n + " ko chia het cho 3");
        }
        sc.close();
    }
}
