package demo;

import java.util.Scanner;

/**
 *
 * @author NghiêmNam
 */
class GiaoVien {
    private String ma;
    private String ten;
    private long luongcoban;
    private int coso;
    private long phucap;
    private long thunhap;
    public GiaoVien(String ma , String ten,long luongcoban){
        this.ma=ma;
        this.ten=ten;
        this.coso=Integer.parseInt(ma.substring(2));
        String res = ma.substring(0,2);
        switch (res) {
            case "HT":
                this.phucap=2000000;
                break;
            case "HP":
                this.phucap=900000;
                break;
            default:
                this.phucap=500000;
                break;
        }
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

    public long getLuongcoban() {
        return luongcoban;
    }

    public void setLuongcoban(long luongcoban) {
        this.luongcoban = luongcoban;
    }

    public long getCoso() {
        return coso;
    }

    public void setCoso(int coso) {
        this.coso = coso;
    }

    public long getPhucap() {
        return phucap;
    }

    public void setPhucap(long phucap) {
        this.phucap = phucap;
    }

    public long getThunhap() {
        return thunhap;
    }

    public void setThunhap(long thunhap) {
        this.thunhap = thunhap;
    }
    
}
public class thuNhapGiaoVien {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String ma = sc.nextLine();
        String ten = sc.nextLine();
        long luongcoban = sc.nextLong();
        GiaoVien gv = new GiaoVien(ma, ten, luongcoban);
        gv.setThunhap(luongcoban*gv.getCoso()+gv.getPhucap());
        System.out.printf("%s %s %d %d %d",gv.getMa(),gv.getTen(),gv.getCoso(),gv.getPhucap(),gv.getThunhap());
    }
    
}
