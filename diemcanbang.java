package demo;

import java.util.Scanner;

public class diemcanbang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-- != 0){
            int n = scanner.nextInt();
            int[] a = new int[n+5];
            int sum = 0, s= 0,ok = 0;
            for(int i = 1; i <= n; i++){
                a[i] = scanner.nextInt();
                sum += a[i];
            }
            for(int i = 1; i <= n; i++){
                s += a[i-1];
                if(2*s == sum - a[i]){
                    ok = 1;
                    System.out.println(i);
                    break;
                }
            }
            if(ok == 0) System.out.println(-1);
        }
    }
}