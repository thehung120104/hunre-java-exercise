package baitapchuong2;

import java.util.Scanner;

public class bai11 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        System.out.println(" nhap ten cong nhan");
        String tencongnhan = scanner.nextLine();
        System.out.println(" nhap SLSP");
        double SLSP = scanner.nextDouble();
        System.out.println("nhap DMSP");
        double DMSP = scanner.nextDouble();
        double tienThuong = ( SLSP - DMSP) * 100;
        if ( SLSP <= DMSP) {
            System.out.println("tien thuong cua cong nhan"+tencongnhan+" la 0 dong");
        } else {

            System.out.println("tien thuong cua cong nhan"+"tencongnhan"+"tienthuong");

        }









    }

}

