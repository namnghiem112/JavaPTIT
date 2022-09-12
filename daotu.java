package demo;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class daotu {
    public static String chuyen(String s){
        String res ="";
        for (int i=s.length()-1;i>=0;i--){
            res += s.charAt(i);
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String line = sc.nextLine();
        while(t-->0){
            List<String> mang = new ArrayList<>();
            String s = sc.nextLine();
            s=s.trim();
            s=s.replaceAll("\\s+", " ");
            String[] parts = s.split(" ");
            for(String x : parts){
                mang.add(chuyen(x));
            }
            for (String v : mang){
                System.out.print(v+" ");
            }
            System.out.println();
        }
    }
}
