package exercise.oop;

import java.util.Scanner;

/**
 * @author ThanhBuiNguyen
 * @since 09/03/2024
 */
public class Input {
    // syntax - cu phap: access modifier: private, public, protected
    // return type - kieu du lieu tra ve: void - khong tra ve gi ca, Data type - Kieu du lieu: int, float, String
    // Method name - Ten phuong thuc
    // () Parameters - Tham so truyen vao:  (int a, String b)
    // {}
    public int inputInteger() {
        Scanner scanner = new Scanner(System.in); // Kieu du lieu - doi tuong : ten bien/ten doi tuong
        Scanner scanner2 = new Scanner(System.in); // Kieu du lieu - doi tuong : ten bien/ten doi tuong
        System.out.println("nhap so nguyen N:");
        int n = scanner.nextInt();
        return n;
    }

    public float inputfloat() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so thuc N:");
        float n = scanner.nextFloat();
        return n;
    }

    public String inputString() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap chuoi ky tu:");
        String n = scanner.nextLine();
        return n;
    }

}
