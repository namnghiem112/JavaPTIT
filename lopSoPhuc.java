package demo;

import java.util.Scanner;

/**
 *
 * @author NghiêmNam
 */
class SoPhuc {

    private int thuc, ao;

    public SoPhuc(int thuc, int ao) {
        this.thuc = thuc;
        this.ao = ao;
    }

    public SoPhuc tong(SoPhuc p) {
        int x = this.thuc + p.thuc;
        int y = this.ao + p.ao;
        return new SoPhuc(x, y);
    }

    public int getThuc() {
        return thuc;
    }

    public void setThuc(int thuc) {
        this.thuc = thuc;
    }

    public int getAo() {
        return ao;
    }

    public void setAo(int ao) {
        this.ao = ao;
    }
    
    public SoPhuc tich(SoPhuc p) {
        int a = this.thuc;
        int b = this.ao;
        int c = p.thuc;
        int d = p.ao;
        int x = a * c - b * d;
        int y = a * d + b * c;
        return new SoPhuc(x, y);
    }
}

public class lopSoPhuc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a, b, c, d;
            a = sc.nextInt();
            b = sc.nextInt();
            SoPhuc A = new SoPhuc(a, b);
            c = sc.nextInt();
            d = sc.nextInt();
            SoPhuc B = new SoPhuc(c, d);
            SoPhuc sum = A.tong(B);
            SoPhuc C = A.tich(sum);
            SoPhuc D = sum.tich(sum);
            String kt1="",kt2="";
            if(C.getAo()<0) kt1="-";
            else kt1="+";
            if(D.getAo()<0) kt2="-";
            else kt2="+";
            System.out.println(C.getThuc()+" "+kt1+" "+Math.abs(C.getAo())+"i"+", "+D.getThuc()+" "+kt2+" "+Math.abs(D.getAo())+"i");
        }

    }

}
