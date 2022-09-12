package demo;

import java.util.Scanner;

/**
 *
 * @author NghiêmNam
 */
class NhanVien {
    private String manv;
    private String ten;
    private String gioitinh;
    private String ngaysinh;
    private String diachi;
    private String mathue;
    private String ngayky;
    public NhanVien(String manv,String ten,String gioitinh,String ngaysinh,String diachi,String mathue,String ngayky){
       this.manv=manv;
       this.ten=ten;
       this.gioitinh=gioitinh;
       this.ngaysinh=ngaysinh;
       this.diachi=diachi;
       this.mathue=mathue;
       this.ngayky=ngayky;
    }

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getMathue() {
        return mathue;
    }

    public void setMathue(String mathue) {
        this.mathue = mathue;
    }

    public String getNgayky() {
        return ngayky;
    }

    public void setNgayky(String ngayky) {
        this.ngayky = ngayky;
    }
    
}
public class khaiBaoLopNhanVien {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String ten = sc.nextLine();
        String gioitinh = sc.nextLine();
        String ngaysinh = sc.nextLine();
        String diachi = sc.nextLine();
        String mathue = sc.nextLine();
        String ngayky = sc.nextLine();
        String manv = "00001";
        NhanVien nv = new NhanVien(manv, ten, gioitinh, ngaysinh, diachi, mathue, ngayky);
        System.out.printf("%s %s %s %s %s %s %s",nv.getManv(),nv.getTen(),nv.getGioitinh(),nv.getNgaysinh(),nv.getDiachi(),nv.getMathue(),nv.getNgayky());
    }
}
