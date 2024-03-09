package baitapchuong3;

import java.util.Scanner;

public class bai2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ten nuoc: ");
        String countryName = scanner.nextLine();
        System.out.print("Nhap loai nuoc (1-5): ");
        int countryType = scanner.nextInt();
        System.out.print("Nhap tong thu lap quoc gia: ");
        double totalIncome = scanner.nextDouble();
        double contribution;
        switch (countryType) {
            case 1:
                contribution = totalIncome * 0.01;
                break;
            case 2:
                contribution = totalIncome * 0.007;
                break;
            case 3:
                contribution = totalIncome * 0.005;
                break;
            case 4:
                contribution = totalIncome * 0.001;
                break;
            case 5:
                contribution = 1000000.0;
                break;
            default:
                System.out.println("loai nuoc khong hop le .vui long nhap  lai tu 1 den 5.");
                return;
        }
        System.out.println("Nuoc: " + countryName);
        System.out.println("so tien phai dong gop: $" + contribution);

	}

}
