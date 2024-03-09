package exercise.oop;

import java.util.Scanner;

public class Input {
    // syntax - cu phap: access modifier: private, public, protected
    //    // return type - kieu du lieu tra ve: void - khong tra ve gi ca, Data type - Kieu du lieu: int, float, String
    //    // Method name - Ten phuong thuc
    //    // () Parameters - Tham so truyen vao:  (int a, String b)
    //    // {}


    public int inputInteger() {//ham doi tuong
        Scanner scanner = new Scanner(System.in); // Kieu du lieu - doi tuong : ten bien/ten doi tuong
        int n = scanner.nextInt();
        return n;
    }

    public float inputfloat() {
        Scanner scanner = new Scanner(System.in);
        float n = scanner.nextFloat();
        return n;
    }

    public String inputString() {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        return n;
    }


}
