/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package demo;

import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author NghiêmNam
 */
public class tapturiengcuaxau {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String s = sc.nextLine();
        while (t-- > 0) {
            String s1 = sc.nextLine();
            String a[] = s1.split("\\s+");
            TreeSet<String> ts1 = new TreeSet<>();
            for (int i = 0; i < a.length; i++) {
                ts1.add(a[i]);
            }
            String s2 = sc.nextLine();
            String b[] = s2.split("\\s+");
            TreeSet<String> ts2 = new TreeSet<>();
            for (int i = 0; i < b.length; i++) {
                ts2.add(b[i]);
            }
            for (String x : ts1) {
                if (ts2.contains(x) == false) {
                    System.out.print(x + " ");
                }
            }
            System.out.println();
        }
    }
}
