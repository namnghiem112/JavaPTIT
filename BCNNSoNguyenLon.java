package demo;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author NghiêmNam
 */
public class BCNNSoNguyenLon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            BigInteger m = sc.nextBigInteger();
            BigInteger n = sc.nextBigInteger();
            System.out.println(m.multiply(n).divide(m.gcd(n)));
        }
    }
    
}
