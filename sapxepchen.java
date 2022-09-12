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
public class sapxepchen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Buoc 0: " + a[0]);
        for (int i = 1; i < n; i++) {
            int j = i - 1;
            int key = a[i];
            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = key;
            System.out.print("Buoc " + i + ": ");
            for (int x = 0; x <= i; x++) {
                System.out.print(a[x] + " ");
            }
            System.out.println("");
        }
    }
}
