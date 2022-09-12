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
class SinhVien {

    private String ten;
    private String lop;
    private String ngaysinh;
    private double diem;
    private String ma;

    public SinhVien(String ma, String ten, String lop, String ngaysinh, Double diem) {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.ngaysinh = ngaysinh;
        this.diem = diem;
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

public class danhSachSinhVien {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        List<SinhVien>a= new ArrayList<>();
        for (int i=1;i<=t;i++) {
            String line = sc.nextLine();
            String name = sc.nextLine();
            name = name.trim();
            String res = name.replaceAll("\\s+", " ");
            String[] parts = res.split("\\s");
            String res2 ="";
            for (String part : parts){
                res2 += part.substring(0,1).toUpperCase()+part.substring(1).toLowerCase()+" ";
            }
            res2 = res2.trim();
            String lop = sc.next();
            String ngsinh = sc.next();
            if (ngsinh.charAt(2) != '/') {
                ngsinh = "0" + ngsinh;
            }
            if (ngsinh.charAt(5) != '/') {
                ngsinh = ngsinh.substring(0, 3) + "0" + ngsinh.substring(3);
            }
            double diem1 = sc.nextDouble();
            String masv="";
            if(i<10) {
                masv = "B20DCCN00" +Integer.toString(i);
            }
            else  masv = "B20DCCN0" +Integer.toString(i);
            SinhVien sv = new SinhVien(masv, res2, lop, ngsinh, diem1);
            a.add(sv);
        }
        Collections.sort(a, new Comparator<SinhVien>(){
            @Override
            public int compare(SinhVien sv1,SinhVien sv2){
                if(sv1.getDiem()>sv2.getDiem())
                    return -1;
                return 1;
            }
        });
        for (int i=0;i<t;i++){
            System.out.printf("%s %s %s %s %.2f\n", a.get(i).getMa(), a.get(i).getTen(), a.get(i).getLop(), a.get(i).getNgaysinh(), a.get(i).getDiem());
        }
    }
}
