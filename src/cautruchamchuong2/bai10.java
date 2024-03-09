package cautruchamchuong2;

import java.util.Scanner;

public class bai10 {
    public static int fibonnaci(int x) {
        if (x == 0) {
            return 0;
        } else if (x == 1) {
            return 1;
        } else if (x == 2) {
            return 1;
            // chi can khi cho dk la n<=2
        } else {
            return fibonnaci(x - 1) + fibonnaci(x - 2);
        }

    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.printf("so fibonnaci thu %d = %d", n, fibonnaci(n));
        sc.close();
    }
}
