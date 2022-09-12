package demo2;


import java.util.Scanner;

/**
 *
 * @author NghiêmNam
 */
class PhanSo {

    private long tu;
    private long mau;

    public long getTu() {
        return tu;
    }

    public void setTu(long tu) {
        this.tu = tu;
    }

    public long getMau() {
        return mau;
    }

    public void setMau(long mau) {
        this.mau = mau;
    }

    public PhanSo() {
        this.tu = 0;
        this.mau = 1;
    }

    public PhanSo(long tu, long mau) {
        this.tu = tu;
        this.mau = mau;
    }

    public PhanSo tong(PhanSo p1) {
        long c = this.tu * p1.mau + this.mau * p1.tu;
        long d = this.mau * p1.mau;
        return new PhanSo(c, d);
    }

    public PhanSo tich(PhanSo p2) {
        long e = this.tu * p2.tu;
        long f = this.mau * p2.mau;
        return new PhanSo(e, f);
    }

    public static long gcd(long a, long b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public PhanSo rutgon() {
        long x = gcd(this.tu, this.mau);
        return new PhanSo(this.tu / x, this.mau / x);
    }
}

public class tinhToanPhanSo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            PhanSo A = new PhanSo(a, b);
            long a1 = sc.nextLong();
            long b1 = sc.nextLong();
            PhanSo B = new PhanSo(a1, b1);
            PhanSo sum = A.tong(B);
            PhanSo C = sum.tich(sum);
            PhanSo C1 = C.rutgon();
            PhanSo res = A.tich(B);
            PhanSo D = res.tich(C1);
            PhanSo D1 = D.rutgon();
            System.out.println(C1.getTu()+"/"+C1.getMau()+" "+D1.getTu()+"/"+D1.getMau());
        }
    }
}
