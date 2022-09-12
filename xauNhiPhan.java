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
public class xauNhiPhan{
    public static long[] F = new long[93];
    public static void slove(int n,long i){
        while(n>2){
            if(i<=F[n-2]) n-=2;
            else 
            {
                i-=F[n-2];
                n-=1;
            }
        }
        if(n==1) System.out.println(0);
        else System.out.println(1);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        F[1]=F[2]=1;
        for (int i=3;i<=92;i++){
            F[i]=F[i-1]+F[i-2];
        }
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--!=0){
            int n = sc.nextInt();
            long k =sc.nextLong();
            slove(n,k);
        }
    }
    
}
    
