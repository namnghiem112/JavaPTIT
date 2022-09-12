/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package demo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author NghiêmNam
 */
public class thugondayso {

    /**
     */
    public static int n;
    public static void kt(ArrayList<Integer> a){
        int i=0;
        while(true){
            int check=0;
            if(i>=a.size()-1) {
                break;
            }
            if((a.get(i)+a.get(i+1))%2==0){
                a.remove(i);
                a.remove(i);
                check=1;
            }
//            System.out.println(a+" "+i);
            if(check==0) i++;
            else i=0;
        }
        System.out.println(a.size());
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        for (int i=0;i<n;i++){
            a.add(sc.nextInt());
        }
        kt(a);
    }
}