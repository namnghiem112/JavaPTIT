


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
    private int ma;
    private String ten;
    private String donvitinh;
    private double giamua;
    private double giaban;
    private double loinhuan;
    public Hang(int ma,String ten,String donvitinh,double giamua,double giaban){
        this.ma=ma;
        this.ten=ten;
        this.donvitinh=donvitinh;
        this.giamua=giamua;
        this.giaban=giaban;
        this.loinhuan=giaban-giamua;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
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

    public double getGiamua() {
        return giamua;
    }

    public void setGiamua(double giamua) {
        this.giamua = giamua;
    }

    public double getGiaban() {
        return giaban;
    }

    public void setGiaban(double giaban) {
        this.giaban = giaban;
    }

    public double getLoinhuan() {
        return loinhuan;
    }

    public void setLoinhuan(double loinhuan) {
        this.loinhuan = loinhuan;
    }
    
}
public class sapXepDanhSachMatHang {

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
            double giamua = sc.nextDouble();
            double giaban = sc.nextDouble();
            Hang ha = new Hang(i+1, ten, donvitinh, giamua, giaban);
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
            System.out.printf("%d %s %s %.2f\n",a.get(i).getMa(),a.get(i).getTen(),a.get(i).getDonvitinh(),a.get(i).getLoinhuan());
        }
    }
    
}
