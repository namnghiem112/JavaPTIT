package demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author NghiêmNam
 */
public class soKhacNhauTrongFile_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        File f = new File("DATA.in");
        Scanner sc = new Scanner(f);
        int[] dp  = new int[1005];
        while(sc.hasNext()){
            try {
                String s = sc.next();
                dp[Integer.parseInt(s)]++;
            } catch (Exception e) {
            }
        }
        for (int i=0;i<=1000;i++){
            if(dp[i]!=0) System.out.printf("%d %d\n",i,dp[i]);
        }
    }
    
}
