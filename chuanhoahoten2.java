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
public class chuanhoahoten2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        String s1 = scanner.nextLine();
        while(t-- != 0){
            String s = scanner.nextLine();
            s=s.trim();
            String res = s.replaceAll("\\s+", " ");
            String[] parts = res.split("\\s");
            int dem=0;
            String res2 = "";
            for (String part : parts) { 
                dem++;
                if(dem==1) {
                    res2 = part;
                    continue;
                }
                if (part != null && dem!=parts.length) {
                    System.out.print(String.valueOf(part.charAt(0)).toUpperCase() + part.substring(1).toLowerCase() + " ");
                }
                else System.out.print(String.valueOf(part.charAt(0)).toUpperCase() + part.substring(1).toLowerCase() + ", ");
            }
            System.out.println(res2.toUpperCase());
        }
    }
    
}
