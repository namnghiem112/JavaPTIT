

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author NghiêmNam
 */
class SinhVien {

    private String ma, ten, lop, email,nganh;

    public SinhVien() {

    }

    public SinhVien(String ma, String ten, String lop, String email) {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
        String res = ma.substring(3,7);
        res = res.toUpperCase();
        if(res.equals("DCKT")) this.nganh = "KE TOAN";
        else if(res.equals("DCCN") && lop.charAt(0)!='E' && lop.charAt(0)!='e') this.nganh = "CONG NGHE THONG TIN";
        else if(res.equals("DCAT") && lop.charAt(0)!='E' && lop.charAt(0)!='e') this.nganh = "AN TOAN THONG TIN";
        else if(res.equals("DCVT")) this.nganh = "VIEN THONG";
        else if(res.equals("DCDT")) this.nganh = "DIEN TU";
        else this.nganh = "";
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }
    
}

public class lietKeSinhVienTheoLop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Integer t = Integer.parseInt(sc.nextLine());
        List<SinhVien> a = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            String lop = sc.nextLine();
            String email = sc.nextLine();
            SinhVien sv = new SinhVien(ma, ten, lop, email);
            a.add(sv);
        }
        Integer n = Integer.parseInt(sc.nextLine());
        String[] parts = new String[n];
        for (int i = 0; i < n; i++) {
            parts[i] = sc.nextLine().toUpperCase();
        }
        for (String x : parts) {
            System.out.printf("DANH SACH SINH VIEN NGANH %s:\n",x);
            for (int i = 0; i < t; i++) {
                String tmp = a.get(i).getNganh();
                if(tmp.equals(x)) System.out.printf("%s %s %s %s\n", a.get(i).getMa(), a.get(i).getTen(), a.get(i).getLop(), a.get(i).getEmail());
            }
        }
    }

}
