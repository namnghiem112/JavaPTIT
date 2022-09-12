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
public class boisonhonhatcuaNsonguyenduong {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            long[] kt = new long[1005];
            int m = sc.nextInt();
            for (int j = 2; j <= m; j++) {
                int n=j;
                for (int i = 2; i <= n; i++) {
                    int dem = 0;
                    while (n % i == 0) {
                        dem++;
                        n /= i;
                    }
                    if (dem != 0) {
                        kt[i] = Math.max(dem,kt[i]);
                    }
                }
            }
            long res = 1;
            for (int i=2;i<=m;i++){
                res = (long) (res * Math.pow(i, kt[i]));
            }
            System.out.println(res);
        }
    }

}
