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
public class uocSoNguyenToLonNhat {

    /**
     * @param n
     * @return 
     */
    public static long kiemtra(long n){
        if(n<2) return 0;
        for(long i =2;i<=Math.sqrt(n);i++){
            if(n%i==0) return 0;
        }
        return 1;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--!=0){
            long n = sc.nextLong();
            if(kiemtra(n)==1) 
                System.out.println(n);
            else 
            {
                long res = 0;
                for(int i=2;i<=Math.sqrt(n);i++){
                    while(n%i==0){
                        res= Math.max(i, n/i);
                        n/=i;
                    }
                }
                System.out.println(res);
            }
        }
    }
    
}
