/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package demo;

import java.util.Scanner;

/**
 *
 * @author NghiêmNam
 */
public class tongUocSo_1 {

    /**
     */
    public static int[] prime = new int[2000006];
    public static int[] d = new int[2000006];
    public static void snt() {
        for (int i = 2; i <= 2000005; i++) {
            prime[i] = 1;
        }
        for (int i = 2; i <= 2000005; i++) {
            if (prime[i] == 1) {
                for (int j = i; j <= 2000005; j += i) {
                    int k = j;
                    while (k % i == 0) {
                        k /= i;
                        d[j] += i;
                        prime[j] = 0;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        snt();
        int t = sc.nextInt();
        long sum =0;
        while(t--!=0){
            int p = sc.nextInt();
            sum += d[p];
        }
        System.out.println(sum);
    }
}
