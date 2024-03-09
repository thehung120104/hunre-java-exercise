package cautruchamchuong2;

import java.util.Scanner;

public class bai5 {
    public static int kt(int n) {
        int t = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                t += i;
            }
        }
        if (t == n) {
            return 1;
        } else {
            return 0;
        }

    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        if (kt(n) == 1) {
            System.out.println("so do la so perfect");
        } else {
            System.out.println("so ko do la so perfect");
        }
        sc.close();
    }

}
