package thi;
import java.util.Arrays;
import java.util.Scanner;
public class nguyenthehung_cau2 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Nhap so phan tu mang
            int n;
            do {
                System.out.print("Nhap so phan tu cua mang (n <= 100): ");
                n = scanner.nextInt();
            } while (n > 100);

            // Khai bao va nhap mang n so nguyen
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
                arr[i] = scanner.nextInt();
            }

            // a. Tinh va in tong cac phan tu nam o vi tri chan trong mang
            int tongChan = 0;
            for (int i = 0; i < n; i += 2) {
                tongChan += arr[i];
            }
            System.out.println(" Tong cac phan tu o vi tri chan: " + tongChan);

            // b. Tim Max, Min trong mang và khoang cach giua chung
            Arrays.sort(arr);
            // Sap xep mang tang dan de tim  Max, Min
            int max = arr[n - 1];
            int min = arr[0];
            int khoangCach = max - min;
            System.out.println(" So lon nhat  trong mang: " + max);
            System.out.println("   So nho nhat  trong mang: " + min);
            System.out.println("   Khoang cach giua Max va Min: " + khoangCach);

            // c. Sap xep mang theo thu tu tang dan
            System.out.println("c. Mang sau khi sap xep: " + Arrays.toString(arr));


        }
    }


