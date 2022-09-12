
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


/**
 *
 * @author NghiêmNam
 */
class Diem {

    private String ten, ma, hanhkiem;
    private double tongdiem;
    private double[] dsdiem;

    public Diem() {

    }

    public Diem(String ma, String ten, double[] dsdiem) {
        this.ma = ma;
        this.ten = ten;
        this.dsdiem = dsdiem;
        double sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += dsdiem[i];
        }
        sum += dsdiem[0] + dsdiem[1];
        this.tongdiem = sum/10/1.2;
        if (this.tongdiem >= 9) {
            this.hanhkiem = "XUAT SAC";
        } else if (this.tongdiem >= 8) {
            this.hanhkiem = "GIOI";
        } else if (this.tongdiem >= 7) {
            this.hanhkiem = "KHA";
        } else if (this.tongdiem >= 5) {
            this.hanhkiem = "TB";
        } else {
            this.hanhkiem = "YEU";
        }
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getHanhkiem() {
        return hanhkiem;
    }

    public void setHanhkiem(String hanhkiem) {
        this.hanhkiem = hanhkiem;
    }

    public double getTongdiem() {
        return tongdiem;
    }

    public void setTongdiem(double tongdiem) {
        this.tongdiem = tongdiem;
    }

    public double[] getDsdiem() {
        return dsdiem;
    }

    public void setDsdiem(double[] dsdiem) {
        this.dsdiem = dsdiem;
    }
    
}

public class bangDiem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        List<Diem> a = new ArrayList<>();
        for(int i=1;i<=t;i++){
            String line = sc.nextLine();
            String ten = sc.nextLine();
            double[] dsdiem = new double[10];
            for (int j=0;j<10;j++){
                dsdiem[j] = sc.nextDouble();
            }
            String ma="";
            if(i<10) ma = "HS0"+Integer.toString(i);
            else ma = "HS"+Integer.toString(i);
            Diem d = new Diem(ma, ten, dsdiem);
            a.add(d);
        }
        Collections.sort(a, new Comparator<Diem>(){
            @Override
            public int compare(Diem d1,Diem d2){
                if(d1.getTongdiem()>d2.getTongdiem()) return -1;
                return 1;
            }
        });
        for (int i=0;i<t;i++){
            System.out.printf("%s %s %.1f %s\n",a.get(i).getMa(),a.get(i).getTen(),a.get(i).getTongdiem(),a.get(i).getHanhkiem());
        }
    }
}
