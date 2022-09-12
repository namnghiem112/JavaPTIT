


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author NghiêmNam
 */
class Students {

    private String ma, ten, lop, email,doanhnghiep;
    private int stt;
    public Students() {

    }

    public Students(int stt,String ma, String ten, String lop, String email,String doanhnghiep) {
        this.stt=stt;
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
        this.doanhnghiep = doanhnghiep;
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

    public String getDoanhnghiep() {
        return doanhnghiep;
    }

    public void setDoanhnghiep(String doanhnghiep) {
        this.doanhnghiep = doanhnghiep;
    }

    public int getStt() {
        return stt;
    }

    public void setStt(int stt) {
        this.stt = stt;
    }
    
}

public class danhSachThucTap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Integer t = Integer.parseInt(sc.nextLine());
        List<Students> a = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            String lop = sc.nextLine();
            String email = sc.nextLine();
            String doanhnghiep = sc.nextLine();
            Students sv = new Students(i+1,ma, ten, lop, email, doanhnghiep);
            a.add(sv);
        }
        Collections.sort(a, new Comparator<Students>(){
            @Override
            public int compare(Students st1,Students st2){
                if(st1.getMa().compareTo(st2.getMa())>0) return 1;
                return -1;
            }
        });
        Integer n = Integer.parseInt(sc.nextLine());
        String[] parts = new String[n];
        for (int i = 0; i < n; i++) {
            parts[i] = sc.nextLine();
        }
        for (String x : parts) {
            for (int i = 0; i < t; i++) {
                if(a.get(i).getDoanhnghiep().equals(x)) System.out.printf("%d %s %s %s %s %s\n",a.get(i).getStt(), a.get(i).getMa(), a.get(i).getTen(), a.get(i).getLop(), a.get(i).getEmail(),a.get(i).getDoanhnghiep());
            }
        }
    }

}
