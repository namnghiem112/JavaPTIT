package demo;

import java.util.Scanner;

/**
 *
 * @author NghiêmNam
 */
class SinhVien {
    private String ten;
    private String lop;
    private String ngaysinh;
    private double diem;
    private String ma;
    public SinhVien(String ma ,String ten,String lop,String ngaysinh,Double diem){
        this.ma=ma;
        this.ten=ten;
        this.lop=lop;
        this.ngaysinh=ngaysinh;
        this.diem=diem;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }
    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }
    
}
public class lopSinhVien {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String lop = sc.next();
        String ngsinh = sc.next();
        if(ngsinh.charAt(2)!='/') ngsinh="0"+ngsinh;
        if(ngsinh.charAt(5)!='/') ngsinh = ngsinh.substring(0,3)+"0"+ngsinh.substring(3);
        double diem1 =sc.nextDouble();
        String masv = "B20DCCN001";
        SinhVien sv = new SinhVien(masv,name, lop, ngsinh,diem1);
        System.out.printf("%s %s %s %s %.2f",sv.getMa(),sv.getTen(),sv.getLop(),sv.getNgaysinh(),sv.getDiem());
    }
}
