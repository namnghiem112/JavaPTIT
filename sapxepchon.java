package demo;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author NghiêmNam
 */
public class sapxepchon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            int res = i;
            for (int j = i + 1; j < n; j++) {
                if (a[res] > a[j]) {
                    res = j;
                }
            }
            int tmp = a[res];
            a[res] = a[i];
            a[i] = tmp;
            int x = i + 1;
            System.out.print("Buoc " + x + ": ");
            for (int k = 0; k < n; k++) {
                System.out.print(a[k] + " ");
            }
            System.out.println("");
        }
    }
}
