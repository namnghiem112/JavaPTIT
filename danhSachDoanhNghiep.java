
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author NghiêmNam
 */
class DoanhNghiep {

    private String ma, ten;
    private int soluong;

    public DoanhNghiep() {

    }

    public DoanhNghiep(String ma, String ten, int soluong) {
        this.ma = ma;
        this.ten = ten;
        this.soluong = soluong;
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

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

}

public class danhSachDoanhNghiep {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Integer t = Integer.parseInt(sc.nextLine());
        List<DoanhNghiep> a = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            Integer soluong = Integer.parseInt(sc.nextLine());
            DoanhNghiep dn = new DoanhNghiep(ma, ten, soluong);
            a.add(dn);
        }
        Integer n = Integer.parseInt(sc.nextLine());
        int[][] mang = new int[n][2];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                mang[i][j] = sc.nextInt();
            }
        }
        Collections.sort(a, new Comparator<DoanhNghiep>() {
            @Override
            public int compare(DoanhNghiep dn1, DoanhNghiep dn2) {
                if (dn1.getSoluong() > dn2.getSoluong()) {
                    return -1;
                } else if (dn1.getSoluong() == dn2.getSoluong()) {
                    if (dn1.getMa().compareTo(dn2.getMa()) > 0) {
                        return 1;
                    }
                    return -1;
                }
                return 1;
            }
        });
        for (int k = 0; k < n; k++) {
            System.out.printf("DANH SACH DOANH NGHIEP NHAN TU %d DEN %d SINH VIEN:\n",mang[k][0],mang[k][1]);
            for (int i = 0; i < t; i++) {
                if(a.get(i).getSoluong()>= mang[k][0] && a.get(i).getSoluong()<=mang[k][1]) System.out.printf("%s %s %d\n", a.get(i).getMa(), a.get(i).getTen(), a.get(i).getSoluong());
            }
        }

    }

}
