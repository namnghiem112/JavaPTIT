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
public class chiaTamGiac {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- != 0){
            double k = sc.nextDouble();
            double h =sc.nextDouble();
            for(double i=1 ;i<k;i++){
                System.out.printf("%.6f ",h*Math.sqrt((double)(i)/k));
            }
            System.out.println("");
        }
    }
    
}
