/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package demo;

import java.util.Scanner;

public class uocsochiahetcho2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t--!=0){
            long n = sc.nextLong();
            if(n%2==1) System.out.println(0);
            else
            {
                long count =0 ;
                for (long i=1;i<=Math.sqrt(n);i++){
                    if(n%i==0){
                        if(i%2==0) count++;
                        if((n/i)%i==0 && (n/i)%2==0) count++;
                    }
                }
                int x = (int) Math.sqrt(n);
                if(Math.pow(x, 2)==n && x%2==0) count--;
                System.out.println(count);
            }
        }
    }
    
}
