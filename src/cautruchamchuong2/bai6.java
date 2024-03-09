package cautruchamchuong2;

import java.util.Scanner;

public class bai6 {
    public static int bcnn(int a, int b) {
        int bcnn = 0;
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        for (int i = 1; i <= min; i++) {
            if ((max * i) % min == 0) {
                bcnn = max * i;
                break;
            }
        }
        return bcnn;
    }

    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap a");
        a = sc.nextInt();
        System.out.println("nhap b");
        b = sc.nextInt();
        System.out.println("BCNN cua " + a + " va " + b + " la " + bcnn(a, b));
        sc.close();

    }

}
