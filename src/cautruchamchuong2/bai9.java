package cautruchamchuong2;

import java.util.Scanner;

public class bai9 {
    public static int A(int m, int n) {
        if(m==0) {
            return n+1;
        }
        else if(n==0) {
            return  A(m-1,n);
        }
        else {
            return A(m-1,A(m,n-1));
        }
    }

    public static void main(String[] args) {
        int n,m;
        Scanner sc=new Scanner(System.in);
        System.out.print("nhap m va n ");
        m=sc.nextInt();
        n=sc.nextInt();
        System.out.printf("A(%d,%d) = %d",m,n,A(m,n));
        sc.close();

    }

}
