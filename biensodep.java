package demo;




import java.util.Scanner;

public class biensodep {
    public static int kiemtra(String s){
        if(Integer.parseInt(s)%11111==0) return 1;
        String res1 = s.substring(0, 3);
        String res2 = s.substring(3);
        if(Integer.parseInt(res1)%111==0 && Integer.parseInt(res2)%11==0) return 1;
        int count=0,dem=0;
        for (int i=1;i<s.length();i++){
            if(s.charAt(i)=='6' || s.charAt(i)=='8') dem++;
            if(s.charAt(i)>s.charAt(i-1)) count++;
        }
        if(s.charAt(0)=='6' || s.charAt(0)=='8') dem++;
        if(dem==5 || count==4) return 1;
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String s = sc.next();
            String res = s.substring(5);
            res = res.replace(".", "");
            if(kiemtra(res)==1) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
