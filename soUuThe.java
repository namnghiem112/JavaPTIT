package demo;

import java.util.Scanner;

/**
 *
 * @author NghiêmNam
 */
public class soUuThe {

    /**
     * @param s
     * @param args the command line arguments
     * @return 
     */
    public static int chuyen(String s){
        int len = s.length();
        int chan=0;
        int le=0;
        for (int i=0;i<s.length();i++){
            if(s.charAt(i)%2==0) chan++;
            else le++;
        }
        if((len%2==0 && chan>le) || (len%2==1 && le>chan)) return 1;
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String line = sc.nextLine();
        while(t-->0){
            String s = sc.nextLine();
            int check=1;
            for (int i=0;i<s.length();i++){
                if((s.charAt(i)<'0' || s.charAt(i)>'9') || s.charAt(0)=='0') {
                    check=0;
                    break;
                }
            }
            if(check==0) System.out.println("INVALID");
            else
            {
                if(chuyen(s)==1) System.out.println("YES");
                else System.out.println("NO");
            }
        }
    }
}
