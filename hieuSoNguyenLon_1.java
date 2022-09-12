/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package demo;

/**
 *
 * @author NghiêmNam
 */
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;
public class hieuSoNguyenLon_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0) {
            String s1 = sc.next();
            String s2 = sc.next();
            BigInteger a = new BigInteger(s1);
            BigInteger b = new BigInteger(s2);
            BigInteger res = a.subtract(b).abs();
            int maxLen = Integer.max(s1.length(), s2.length());
            char[] zeros = new char[maxLen];
            Arrays.fill(zeros, '0');
            DecimalFormat df = new DecimalFormat(String.valueOf(zeros));
            System.out.println(df.format(res));
        }
    }
    
}
