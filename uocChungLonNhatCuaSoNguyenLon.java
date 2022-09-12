package demo;

import java.math.BigInteger;
import java.util.Scanner;

public class uocChungLonNhatCuaSoNguyenLon
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0) {
            BigInteger b1 = new BigInteger(sc.nextLine());
            BigInteger b2 = new BigInteger(sc.nextLine());
            System.out.println(b1.gcd(b2));
        }
    }
}