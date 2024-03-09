package cautruchamchuong2;
import java.util.Scanner;

public class bai2 {
    public static int ucln(int a, int b) {
        int r = a % b; // a = b*x + r;
        while (r != 0) {
            // Gán lại a = b, quay về bài toán tìm ucln của b và r
            a = b;
            b = r;
            r = a % b; // r là phần dư của phép chia a/b
        }

        return b;
    }

    public static void main(String[] args) {

        char kt;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap y ban muon thuc hien  a hoac b");
        kt = sc.next().charAt(0);
        switch (kt) {
            case 'a': {
                int a, b;
                System.out.println("nhap a");
                a = sc.nextInt();
                System.out.println("nhap b");
                b = sc.nextInt();
                System.out.printf("ucln cua %d vs %d la %d", a, b, ucln(a, b));
                break;
            }
            case 'b': {
                int c, d;
                System.out.println("nhap c");
                c = sc.nextInt();
                System.out.println("nhap d");
                d = sc.nextInt();
                if (ucln(c, d) == 1) {
                    System.out.printf("%d / %d la phan so toi gian", c, d);
                } else {
                    System.out.printf("%d / %d la phan so chua toi gian", c, d);
                }
                break;
            }
        }
        sc.close();
    }

}
