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
public class soTamPhan {

    /**
     * @param s
     * @return 
     */
    public static int kiemtra(String s){
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='0' && s.charAt(i)!='1' && s.charAt(i)!='2') return 0;
        }
        return 1;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new  Scanner(System.in);
        int t = sc.nextInt();
        while(t--!=0){
            String s = sc.next();
            if(kiemtra(s)==1) System.out.println("YES");
            else System.out.println("NO");
        }
    }
    
}
