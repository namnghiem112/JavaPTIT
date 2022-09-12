package demo;

import java.util.Scanner;

/**
 *
 * @author NghiêmNam
 */
class TinhCong{
    private String ma,ten,chucvu;
    private int luongcoban,songay,luongthang,thuong,phucap,thunhap;
    public TinhCong(String ma,String ten,int luongcoban,int songay,String chucvu){
        this.ma=ma;
        this.ten=ten;
        this.luongcoban=luongcoban;
        this.songay=songay;
        this.chucvu=chucvu;
        this.luongthang = songay*luongcoban;
        if(songay >= 25){
            this.thuong = (int) (0.2*this.luongthang);
        }
        else if(songay>=22) this.thuong = (int) (0.1*this.luongthang);
        else this.thuong =0;
        switch (chucvu) {
            case "GD":
                this.phucap=250000;
                break;
            case "PGD":
                this.phucap=200000;
                break;
            case "TP":
                this.phucap=180000;
                break;
            case "NV":
                this.phucap=150000;
                break;
            default:
                break;
        }
        this.thunhap = luongthang+thuong+phucap;
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

    public String getChucvu() {
        return chucvu;
    }

    public void setChucvu(String chucvu) {
        this.chucvu = chucvu;
    }

    public int getLuongcoban() {
        return luongcoban;
    }

    public void setLuongcoban(int luongcoban) {
        this.luongcoban = luongcoban;
    }

    public int getSongay() {
        return songay;
    }

    public void setSongay(int songay) {
        this.songay = songay;
    }

    public int getLuongthang() {
        return luongthang;
    }

    public void setLuongthang(int luongthang) {
        this.luongthang = luongthang;
    }

    public int getThuong() {
        return thuong;
    }

    public void setThuong(int thuong) {
        this.thuong = thuong;
    }

    public int getPhucap() {
        return phucap;
    }

    public void setPhucap(int phucap) {
        this.phucap = phucap;
    }

    public int getThunhap() {
        return thunhap;
    }

    public void setThunhap(int thunhap) {
        this.thunhap = thunhap;
    }
    
}
public class baiToanTinhCong {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String ten = sc.nextLine();
//        String line = sc.nextLine();
        Integer luongcoban = Integer.parseInt(sc.nextLine());
        Integer songay = Integer.parseInt(sc.nextLine());
        String chucvu = sc.nextLine();
        TinhCong co = new TinhCong("NV01", ten, luongcoban, songay, chucvu);
        System.out.printf("%s %s %d %d %d %d\n",co.getMa(),co.getTen(),co.getLuongthang(),co.getThuong(),co.getPhucap(),co.getThunhap());
    }
    
}
