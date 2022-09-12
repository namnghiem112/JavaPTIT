package demo;

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
    public PhanSo(){
        this.tu=0;
        this.mau=1;
    }
    public PhanSo(long tu ,long mau){
        this.tu=tu;
        this.mau=mau;
    }

    public PhanSo tong(PhanSo p){
        long a = this.tu*p.mau + this.mau*p.tu;
        long b = this.mau*p.mau;
        return new PhanSo(a,b);
    }
    public static long gcd(long a, long b){
        if(b==0) return a;
        return gcd(b, a%b);
    }
    public PhanSo rutgon(){
        long k = gcd (this.tu,this.mau);
        return new PhanSo(this.tu/k,this.mau/k);  
    }
}
public class tongPhanSo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);
        long x = sc.nextLong();
        long y = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();
        PhanSo p1 = new PhanSo();
        PhanSo p2 = new PhanSo();
        p1.setTu(x);
        p1.setMau(y);
        p2.setTu(c);
        p2.setMau(d);
        PhanSo kq = p1.tong(p2);
        PhanSo res = kq.rutgon();
        System.out.println(res.getTu()+"/"+res.getMau());
    }  
}
