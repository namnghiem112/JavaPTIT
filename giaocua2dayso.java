/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package demo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author NghiêmNam
 */
public class giaocua2dayso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Set<Integer> mang1 = new TreeSet<>();
        Set<Integer> mang2 = new TreeSet<>();
        for ( int i=0;i<n;i++){
            mang1.add(sc.nextInt());
        }
        for ( int i=0;i<m;i++){
            mang2.add(sc.nextInt());
        }
        mang1.retainAll(mang2);
        for (int i: mang1){
            System.out.print(i+" ");
        }
    }
    
}
