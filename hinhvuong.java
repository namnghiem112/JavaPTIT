/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package demo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author NghiêmNam
 */
public class hinhvuong {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> listx = new ArrayList<>();
        ArrayList<Integer> listy = new ArrayList<>();
        for(int i=0;i<4;i++){
            int x1 =sc.nextInt();
            int y1 =sc.nextInt();
            listx.add(x1);
            listy.add(y1);
        }
        listx.sort(Comparator.naturalOrder());
        listy.sort(Comparator.naturalOrder());
        int x = Math.abs(listx.get(0)-listx.get(3));
        int y = Math.abs(listy.get(0)-listy.get(3));
        int res = Math.max(x, y);
        System.out.println(res*res);
    }
    
}
