package baitapchuong3;

import java.util.Scanner;

public class bai1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Nhap thang (1-12): ");
        //TODO: lam sau
        int month = scanner.nextInt();

        System.out.print("Nhap nam: ");
        int year = scanner.nextInt();


        int daysInMonth;

        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12:
                daysInMonth = 31;
                break;
            case 4, 6, 9, 11:
                daysInMonth = 30;
                break;
            case 2:

                if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                    daysInMonth = 29;
                } else {
                    daysInMonth = 28;
                }
                break;
            default:
                System.out.println("thang khong hop le . vui long nhap lai.");
                return;
        }


        System.out.println("so ngay cau thang " + month + " nam " + year + " la: " + daysInMonth);


    }


}


