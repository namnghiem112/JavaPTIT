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
public class BCNN_UCLN {

    /**
     * @param a
     * @param b
     * @return 
     */
    public static long gcd(long a,long b){
        if(a==0 || b==0) return a+b;
        while(a!=b){
            if(a>b) a-=b;
            else b-=a;
        }
        return a;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            t--;
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = gcd(a, b);
            System.out.println(a*b/c +" "+c);
        }
    }
    
}
