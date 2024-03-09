package cautruchamchuong2;
import java.util.Scanner;

public class bai1 {
    public static void max(int a, int b, int c) {
        if (a > b && a > c) {
            System.out.println("max la " + a);
        } else if (b > a && b > c) {
            System.out.println("max la " + b);
        } else {
            System.out.println("max la " + c);
        }
    }

    public static void min(int a, int b, int c) {
        if (a < b && a < c) {
            System.out.println("min la " + a);
        } else if (b < a && b < c) {
            System.out.println("min la " + b);
        } else {
            System.out.println("min la " + c);
        }
    }

    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        max(a, b, c);
        min(a, b, c);
        sc.close();
    }
}

