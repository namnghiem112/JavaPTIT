
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


/**
 *
 * @author NghiêmNam
 */
class BangDiem{
    private String ma,ten,lop,ktraten;
    private double diem1,diem2,diem3;
    public BangDiem(){
        
    }
    public BangDiem(String ma,String ten,String lop,double diem1,double diem2,double diem3){
        this.ma=ma;
        this.ten=ten;
        this.ktraten=ten.replaceAll("\\s+","").toLowerCase();
        this.lop=lop;
        this.diem1=diem1;
        this.diem2=diem2;
        this.diem3=diem3;
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

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public double getDiem1() {
        return diem1;
    }

    public void setDiem1(double diem1) {
        this.diem1 = diem1;
    }

    public double getDiem2() {
        return diem2;
    }

    public void setDiem2(double diem2) {
        this.diem2 = diem2;
    }

    public double getDiem3() {
        return diem3;
    }

    public void setDiem3(double diem3) {
        this.diem3 = diem3;
    }

    public String getKtraten() {
        return ktraten;
    }

    public void setKtraten(String ktraten) {
        this.ktraten = ktraten;
    }
    
}
public class bangDiemThanhPhan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        List<BangDiem> a = new ArrayList<>();
        for (int i=1;i<=t;i++){
            String line = sc.nextLine();
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            String lop = sc.nextLine();
            double diem1 = sc.nextDouble();
            double diem2 = sc.nextDouble();
            double diem3 = sc.nextDouble();
            BangDiem bd = new BangDiem(ma, ten, lop, diem1, diem2, diem3);
            a.add(bd);
        }
        Collections.sort(a, new Comparator<BangDiem>(){
            @Override
            public int compare(BangDiem bd1 , BangDiem bd2){
                if(bd1.getKtraten().compareTo(bd2.getKtraten())>0) return 1;
                return -1;
            }
        });
        for (int i=0;i<t;i++){
            System.out.printf("%d %s %s %s %.1f %.1f %.1f\n",i+1,a.get(i).getMa(),a.get(i).getTen(),a.get(i).getLop(),a.get(i).getDiem1(),a.get(i).getDiem2(),a.get(i).getDiem3());
        }
    }
    
}
