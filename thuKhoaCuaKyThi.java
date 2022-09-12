package demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author NghiêmNam
 */
class ThuKhoa{
    private String ten,ngaysinh;
    private double toan,ly,hoa,tongdiem;
    private int ma;
    public ThuKhoa()
    {
        
    }
    public ThuKhoa (int ma,String ten,String ngaysinh,double toan,double ly ,double hoa){
        this.ma=ma;
        this.ten=ten;
        this.ngaysinh=ngaysinh;
        this.toan=toan;
        this.ly=ly;
        this.hoa=hoa;
        this.tongdiem = toan+ly+hoa;
    }

    public double getTongdiem() {
        return tongdiem;
    }

    public void setTongdiem(double tongdiem) {
        this.tongdiem = tongdiem;
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

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
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
    
}
public class thuKhoaCuaKyThi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        double res =0;
        List<ThuKhoa>a = new ArrayList<>();
        for (int i=1;i<=t;i++){
            String line = sc.nextLine();
            String ten = sc.nextLine();
            String ngaysinh = sc.nextLine();
            double toan = sc.nextDouble();
            double ly = sc.nextDouble();
            double hoa = sc.nextDouble();
            ThuKhoa tk = new ThuKhoa(i, ten, ngaysinh, toan, ly, hoa);
            res = Double.max(res, tk.getTongdiem());
            a.add(tk);
        }
        for (int i=0;i<t;i++){
            if(res==a.get(i).getTongdiem()){
                System.out.printf("%d %s %s %.1f\n",a.get(i).getMa(),a.get(i).getTen(),a.get(i).getNgaysinh(),a.get(i).getTongdiem());
            }
        }
    }
    
}
