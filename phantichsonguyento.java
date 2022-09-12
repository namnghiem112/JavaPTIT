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
public class phantichsonguyento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner= new Scanner(System.in);
        int t = scanner.nextInt();
        int test = 1;
        while(t-- != 0){
            int n = scanner.nextInt();
            System.out.print("Test " + (test++) + ": ");
            int k = n;
            for(int i = 2; i <= n; i++){
                int dem = 0;
                while(n % i == 0){
                    dem++;
                    n /= i;
                }
                if(dem != 0){
                    System.out.print(i + "(" + dem + ") " );
                }
            }
            System.out.println("");
            }
    }
    
}
