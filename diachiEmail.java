/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package demo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author NghiêmNam
 */
public class diachiEmail {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s1 = sc.nextLine();
        ArrayList<String> a = new ArrayList<>();
        for (int i=0;i<n;i++){
            String res ="";
            String s = sc.nextLine();
            s = s.toLowerCase();
            s= s.strip();
            s= s.replaceAll("\\s+", " ");
            String[] mang = s.split("\\s");
            for (int j=0;j<mang.length-1;j++){
                res += mang[j].charAt(0);
            }
            res = mang[mang.length-1]+res;
            a.add(res);
            int cnt = Collections.frequency(a, res);
            if (cnt > 1) res += cnt;
            res += "@ptit.edu.vn";
            System.out.println(res);
        }
    }
    
}
