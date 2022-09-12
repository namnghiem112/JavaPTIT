package demo;

import java.util.Scanner;

public class chuanhoahoten_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        String s1 = scanner.nextLine();
        while(t-- != 0){
            String s = scanner.nextLine();
            s=s.trim();
            String res = s.replaceAll("\\s+", " ");
            String[] parts = res.split("\\s");
            for (String part : parts) {
                if (part != null) {
                    System.out.print(String.valueOf(part.charAt(0)).toUpperCase() + part.substring(1).toLowerCase() + " ");
                }
            }
            System.out.println("");
        }
    }
}
