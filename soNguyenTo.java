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
public class soNguyenTo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner= new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-- != 0){
            int n = scanner.nextInt();
            if(n <=1) System.out.println("NO");
            else{
                int ok = 0;
                for(int i = 2; i <= Math.sqrt(n); i++){
                    if(n % i == 0){
                        System.out.println("NO");
                        ok = 1;
                        break;
                    }
                }
                if(ok == 0) System.out.println("YES");
            }
        }
    }
    
}
