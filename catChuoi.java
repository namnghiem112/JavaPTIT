/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package demo;

import java.util.Scanner;


public class catChuoi {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t != 0) {
            long n = sc.nextLong();
            long[] a = new long[19];
            int i = 0;
            boolean check = true;
            while (n != 0) {
                long x = n % 10;
                if (x == 1) {
                    a[i] = x;
                } else {
                    if (x != 0 && x != 8 && x != 9) {
                        check = false;
                        break;
                    }
                }
                n /= 10;
                i++;
            }
            if (check == false) {
                System.out.println("INVALID");
            } else {
                long res = 0;
                for (int j = i - 1; j >= 0; j--) {
                    res = res * 10 + a[j];
                }
                if (res == 0) {
                    System.out.println("INVALID");
                } else {
                    System.out.println(res);
                }
            }
            t--;
        }
    }
}
