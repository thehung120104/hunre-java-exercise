package hamchuong2;


import java.util.Scanner;

public class bai1 {
    public static void nhap(int n, int mang1[]) {
        System.out.println("bat dau nhap day ");
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            mang1[i] = scan.nextInt();
        }
        scan.close();
    }

    public static void xuat(int n, int mang1[]) {
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = %d\n", i, mang1[i]);
        }
    }

    public static void main(String[] args) {
        int n;
        int mang1[];
        mang1 = new int[100];
        Scanner sc = new Scanner(System.in);
        char cau;
        System.out.print("nhap cau ban muon thuc hien ");
        cau = sc.next().charAt(0);
        switch (cau) {
            case 'a': {
                System.out.print("nhap n ");
                do {
                    n = sc.nextInt();
                } while (n <= 0 || n >= 100);
                nhap(n, mang1);
                xuat(n, mang1);
                break;
            }
            case 'b': {
                System.out.print("nhap n ");
                do {
                    n = sc.nextInt();
                } while (n <= 0 || n >= 100);
                nhap(n, mang1);
                float tong = 0;
                for (int i = 0; i < n; i++) {
                    tong += mang1[i];
                }
                System.out.println("tong cac phan tu trong day vua nhap la " + tong);
                break;
            }
            case 'c': {
                System.out.print("nhap n ");
                do {
                    n = sc.nextInt();
                } while (n <= 0 || n >= 100);
                nhap(n, mang1);
                float tong = 0;
                int dem = 0;
                for (int i = 0; i < n; i++) {
                    if (mang1[i] > 0) {
                        tong += mang1[i];
                        dem++;
                    }
                }
                if (dem != 0) {
                    double tbc = (double) tong / n;
                    System.out.println("trung binh cong cac so duong trong day vua nhap la " + tbc);
                } else {
                    System.out.println("day vua nhap ko co so duong nao");
                }
                break;
            }
            case 'd': {
                System.out.print("nhap n ");
                do {
                    n = sc.nextInt();
                } while (n <= 0 || n >= 100);
                nhap(n, mang1);
                int dem = 0;
                for (int i = 0; i < n; i++) {
                    if (mang1[i] > 0) {
                        dem++;
                    }
                }
                if (dem != 0) {
                    System.out.printf("co %d so am rtong day vua nhap\n");
                    System.out.println("cac so do la");
                    for (int i = 0; i < n; i++) {
                        if (mang1[i] < 0) {
                            System.out.println(+mang1[i]);
                        }
                    }
                } else {
                    System.out.println("day vua nhap ko co so am nao");
                }
                break;
            }
            case 'e': {
                System.out.print("nhap n ");
                do {
                    n = sc.nextInt();
                } while (n <= 0 || n >= 100);
                nhap(n, mang1);
                int dem1 = 0, dem2 = 0;
                int max = mang1[0];
                int min = mang1[0];
                for (int i = 0; i < n; i++) {
                    if (max < mang1[i]) {
                        max = mang1[i];
                        dem1 = i;
                    }
                    if (min > mang1[i]) {
                        min = mang1[i];
                        dem2 = i;
                    }
                }
                System.out.printf("so lon nhat trong day la %d nam o vi tri a[%d]", max, dem1);
                System.out.printf("so nho nhat trong day la %d nam o vi tri a[%d]", min, dem2);
                break;
            }
            case 'f': {
                System.out.print("nhap n ");
                do {
                    n = sc.nextInt();
                } while (n <= 0 || n >= 100);
                nhap(n, mang1);
                int S = 0;
                for (int i = 0; i < n; i++) {
                    if (i % 2 == 0) {
                        S += mang1[i];
                    } else {
                        S -= mang1[i];
                    }
                }
                System.out.println("S = " + S);
                break;
            }
            case 'g': {
                System.out.print("nhap n ");
                do {
                    n = sc.nextInt();
                } while (n <= 0 || n >= 100);
                System.out.println("nhap so luong so duong dung ke nhau ");
                int S1;
                do {
                    S1 = sc.nextInt();
                } while (S1 <= 0 || S1 >= n);
                nhap(n, mang1);
                int S2 = S1;
                for (int i = 0; i < n; i++) {
                    if (mang1[i] > 0) {
                        S1--;
                        if (S1 == 0) {
                            System.out.printf("co day %d so duong dung canh nhau", S2);
                            break;
                        } else {
                            if (i == n - 1) {
                                System.out.printf("khong co day %d so duong dung canh nhau", S2);
                            }
                            if (mang1[i + 1] <= 0) {
                                S1 = S2;
                            }
                        }
                    }
                }
                break;
            }
            case 'h': {
                int mang2[], tam;
                mang2 = new int[100];
                int k = 0;
                System.out.print("nhap n ");
                do {
                    n = sc.nextInt();
                } while (n <= 0 || n >= 100);
                nhap(n, mang1);
                for (int i = 0; i < n; i++) {
                    if (mang1[i] > 0) {
                        mang2[k] = mang1[i];
                        k++;
                    }
                }
                for (int i = 0; i < k - 1; i++) {
                    for (int j = i + 1; j < k; j++) {
                        if (mang2[i] > mang2[j]) {
                            tam = mang2[i];
                            mang2[i] = mang2[j];
                            mang2[j] = tam;
                        }
                    }
                }
                System.out.println("mang cac so duong tang dan la ");
                xuat(k, mang2);
                break;
            }
            case 'i': {
                int t = 0;
                System.out.print("nhap n ");
                do {
                    n = sc.nextInt();
                } while (n <= 0 || n >= 100);
                nhap(n, mang1);
                for (int i = 0; i < n; i++) {
                    out: for (int j = 0; j < n; j++) {
                        for (int k = 0; k < n; k++) {
                            if (j != i && k != i && j != k && mang1[i] == mang1[j] + mang1[k]) {
                                System.out.println(+mang1[i]);
                                t++;
                                break out;
                            }
                        }
                    }
                }
                if (t == 0) {
                    System.out.println("ko so nao bang tong 2 so khac trong day");
                }
                break;
            }
            case 'j': {
                System.out.print("nhap n ");
                do {
                    n = sc.nextInt();
                } while (n <= 0 || n >= 100);
                nhap(n, mang1);
                for (int i = 0; i < n; i++) {
                    if (i == n - 1) {
                        break;
                    }
                    if (mang1[i] + 3 == mang1[i + 1]) {
                        System.out.println(+mang1[i + 1]);
                    }
                }
                break;
            }
            default:{
                System.out.println("ko co cau nay ");
            }
        }
        sc.close();
    }
}
