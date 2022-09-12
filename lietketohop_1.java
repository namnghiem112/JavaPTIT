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
public class lietketohop_1 {

    /**
     */
    public static int n,ok=1,k;
    public static void khoitao(int a[]){
        for (int i=1;i<=k;i++){
            a[i]=i;
        }
    }
    public static void sinh(int a[]){
        int i=k;
        while(i>=1 && a[i]==n-k+i) i--;
        if(i==0) ok=0;
        else a[i]++;
        int p=a[i];
        while(i<=k) a[i++]=p++;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        k=sc.nextInt();
        int[] a = new int[n+5];
        khoitao(a);
        ok=1;
        int count=0;
        while(ok!=0){
            for(int i=1;i<=k;i++){
                System.out.print(a[i]);
            }
            System.out.print(" ");
            count++;
            sinh(a);
        }
        System.out.println("");
        System.out.printf("Tong cong co %d to hop",count);
    }  
}
