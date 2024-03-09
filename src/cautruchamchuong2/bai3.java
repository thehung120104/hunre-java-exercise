package cautruchamchuong2;
import java.util.Scanner;

public class bai3 {
    public static void sl(int n, char c) {
        for (int i = 1; i <= n; i++) {
            System.out.printf("%c", c);
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        int a, b, c, d, e;
        char c1, c2, c3, c4, c5;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so luong sp va ki hieu cua doanh nghiep 1");
        a = sc.nextInt();
        c1 = sc.next().charAt(0);
        System.out.println("nhap so luong sp va ki hieu cua doanh nghiep 2");
        b = sc.nextInt();
        c2 = sc.next().charAt(0);
        System.out.println("nhap so luong sp va ki hieu cua doanh nghiep 3");
        c = sc.nextInt();
        c3 = sc.next().charAt(0);
        System.out.println("nhap so luong sp va ki hieu cua doanh nghiep 4");
        d = sc.nextInt();
        c4 = sc.next().charAt(0);
        System.out.println("nhap so luong sp va ki hieu cua doanh nghiep 5");
        e = sc.nextInt();
        c5 = sc.next().charAt(0);
        System.out.println("bieu do so luong sp giua cac doanh ngiep");
        sl(a, c1);
        sl(b, c2);
        sl(c, c3);
        sl(d, c4);
        sl(e, c5);
        sc.close();
    }

}
