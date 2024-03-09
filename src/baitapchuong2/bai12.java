package baitapchuong2;

import java.util.Scanner;

public class bai12 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);

        System.out.print("nhap so dien su dung theo thang (so dien tinh theo so): ");
        int soDien = scanner.nextInt();

        double m1 = 1;
        double m2 = 2;
        double m3 = 3;
        double m4 = 4;

        double tienDien = 0;

        if (soDien <= 50) {
            tienDien = soDien * m1;
        } else if (soDien <= 100) {
            tienDien = 50 * m1 + (soDien - 50) * m2;
        } else if (soDien <= 200) {
            tienDien = 50 * m1 + 50 * m2 + (soDien - 100) * m3;
        } else {
            tienDien = 50 * m1 + 50 * m2 + 100 * m3 + (soDien - 200) * m4;
        }

        System.out.println("Tien dien hang thang la: " + tienDien + "d");
    }
}

