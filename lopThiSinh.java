package demo;

import java.util.Scanner;

/**
 *
 * @author NghiêmNam
 */
class ThiSinh {
    private String ten;
    private String ngaysinh;
    private double mon1;
    private double mon2;
    private double mon3;
    private double tongdiem;
    public ThiSinh(String ten,String ngaysinh,double mon1,double mon2,double mon3){
        this.ten=ten;
        this.ngaysinh=ngaysinh;
        this.mon1 = mon1;
        this.mon2 = mon2;
        this.mon3 = mon3;
    }
    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public double getMon1() {
        return mon1;
    }

    public void setMon1(double mon1) {
        this.mon1 = mon1;
    }

    public double getMon2() {
        return mon2;
    }

    public void setMon2(double mon2) {
        this.mon2 = mon2;
    }

    public double getMon3() {
        return mon3;
    }

    public void setMon3(double mon3) {
        this.mon3 = mon3;
    }
    
    public double getTongDiem() {
        return tongdiem;
    }
    public void setTongDiem(double tongdiem) {
        this.tongdiem = tongdiem;
    }
}
public class lopThiSinh {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String ngsinh = sc.next();
        double d1 = sc.nextDouble();
        double d2 = sc.nextDouble();
        double d3 = sc.nextDouble();
        ThiSinh ts = new ThiSinh(name,ngsinh,d1,d2,d3);
        double tong = d1+d2+d3;
        ts.setTongDiem(tong);
        System.out.printf("%s %s %.1f",ts.getTen(),ts.getNgaysinh(),ts.getTongDiem());
    }
}
