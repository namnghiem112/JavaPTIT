package demo;

import java.util.Scanner;

/**
 *
 * @author NghiêmNam
 */
class TuyenSinh{
    private String ma,ten,hinhthuc;
    private double toan,ly,hoa,tongdiem;
    private double diemuutien;
    public TuyenSinh(String ma,String ten,double toan,double ly,double hoa){
        this.ma=ma;
        this.ten=ten;
        this.toan=toan;
        this.ly=ly;
        this.hoa=hoa;
        String tmp = ma.substring(0,3);
        if("KV1".equals(tmp)) this.diemuutien=0.5;
        else if("KV2".equals(tmp)) this.diemuutien=1;
        else this.diemuutien = 2.5;
        this.tongdiem = toan*2 + ly + hoa;
        if(this.tongdiem + this.diemuutien >= 24) this.hinhthuc="TRUNG TUYEN";
        else this.hinhthuc="TRUOT";
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getHinhthuc() {
        return hinhthuc;
    }

    public void setHinhthuc(String hinhthuc) {
        this.hinhthuc = hinhthuc;
    }

    public double getToan() {
        return toan;
    }

    public void setToan(double toan) {
        this.toan = toan;
    }

    public double getLy() {
        return ly;
    }

    public void setLy(double ly) {
        this.ly = ly;
    }

    public double getHoa() {
        return hoa;
    }

    public void setHoa(double hoa) {
        this.hoa = hoa;
    }

    public double getTongdiem() {
        return tongdiem;
    }

    public void setTongdiem(double tongdiem) {
        this.tongdiem = tongdiem;
    }

    public double getDiemuutien() {
        return diemuutien;
    }

    public void setDiemuutien(double diemuutien) {
        this.diemuutien = diemuutien;
    }
    
}
public class baiToanTuyenSinh {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String ma = sc.nextLine();
        String ten = sc.nextLine();
        double toan = sc.nextDouble();
        double ly = sc.nextDouble();
        double hoa = sc.nextDouble();
        TuyenSinh ts = new TuyenSinh(ma, ten, toan, ly, hoa);
        double a = ts.getDiemuutien();
        double b = ts.getTongdiem();
        int check =0,check2=0;
        if(a==(int)a) {
            check =1;
        }
        if(b==(int)b) {
            check2 =1;
        }
        if(check==0 && check2==0) System.out.printf("%s %s %.1f %.1f %s",ts.getMa(),ts.getTen(),ts.getDiemuutien(),ts.getTongdiem(),ts.getHinhthuc());
        else if(check==1 && check2==0)
            System.out.printf("%s %s %.0f %.1f %s",ts.getMa(),ts.getTen(),ts.getDiemuutien(),ts.getTongdiem(),ts.getHinhthuc());
        else if(check==0 && check2==1)
            System.out.printf("%s %s %.1f %.0f %s",ts.getMa(),ts.getTen(),ts.getDiemuutien(),ts.getTongdiem(),ts.getHinhthuc());
        else
            System.out.printf("%s %s %.0f %.0f %s",ts.getMa(),ts.getTen(),ts.getDiemuutien(),ts.getTongdiem(),ts.getHinhthuc());
    }
    
}
