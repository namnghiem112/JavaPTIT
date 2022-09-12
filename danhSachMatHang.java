package demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author NghiêmNam
 */
class Hang{
    private String ma;
    private String ten;
    private String donvitinh;
    private int giamua;
    private int giaban;
    private int loinhuan;
    public Hang(String ma,String ten,String donvitinh,int giamua,int giaban){
        this.ma=ma;
        this.ten=ten;
        this.donvitinh=donvitinh;
        this.giamua=giamua;
        this.giaban=giaban;
        this.loinhuan=giaban-giamua;
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

    public String getDonvitinh() {
        return donvitinh;
    }

    public void setDonvitinh(String donvitinh) {
        this.donvitinh = donvitinh;
    }

    public int getGiamua() {
        return giamua;
    }

    public void setGiamua(int giamua) {
        this.giamua = giamua;
    }

    public int getGiaban() {
        return giaban;
    }

    public void setGiaban(int giaban) {
        this.giaban = giaban;
    }

    public int getLoinhuan() {
        return loinhuan;
    }

    public void setLoinhuan(int loinhuan) {
        this.loinhuan = loinhuan;
    }
    
}
public class danhSachMatHang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Hang> a = new ArrayList<>();
        String res ="";
        for (int i=0;i<n;i++){
            String line = sc.nextLine();
            String ten = sc.nextLine();
            String donvitinh = sc.nextLine();
            int giamua = sc.nextInt();
            int giaban = sc.nextInt();
            if(i+1<10) res = "MH00"+Integer.toString(i+1);
            else res = "MH0"+Integer.toString(i+1);
            Hang ha = new Hang(res, ten, donvitinh, giamua, giaban);
            a.add(ha);
        }
        Collections.sort(a, new Comparator<Hang>() {
            @Override
            public int compare(Hang h1,Hang h2) {
                if (h1.getLoinhuan() > h2.getLoinhuan()) 
                    return -1;
                return 1;
            }
        });
        for (int i=0;i<n;i++){
            System.out.println(a.get(i).getMa()+" "+a.get(i).getTen()+" "+a.get(i).getDonvitinh()+" "+a.get(i).getGiamua()+" "+a.get(i).getGiaban()+" "+a.get(i).getLoinhuan());
        }
    }
    
}
