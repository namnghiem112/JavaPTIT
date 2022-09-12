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
public class tinhFibonaci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-- != 0){
            int n = scanner.nextInt();
            long[] f = new long[5000];
            f[1] = 1; f[2] = 1;
            if(n == 1 || n == 2) System.out.println(1);
            else{
                for(int i = 3; i <= n; i++){
                    f[i] = f[i-1] + f[i-2];
                }
                System.out.println(f[n]);
            }
        }
    }
    
}
