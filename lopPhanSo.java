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
    public static long gcd(long a, long b){
        if(b==0) return a;
        return gcd(b, a%b);
    }
    public PhanSo rutgon(){
        long x = gcd (this.tu,this.mau);
        return new PhanSo(this.tu/x,this.mau/x);  
    }
}
public class lopPhanSo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        PhanSo kq = new PhanSo(a,b);
        PhanSo res = kq.rutgon();
        System.out.println(res.getTu()+"/"+res.getMau());
    }  
}
