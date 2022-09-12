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
public class tongGaiThua {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long tich = 1,s = 0;
        for(int i = 1; i <= n; i++){
            tich *= i;
            s += tich;
        }
        System.out.println(s);
    }
    
}
