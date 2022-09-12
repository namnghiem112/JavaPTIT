
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author NghiêmNam
 */
class NhanVien {

    private String manv;
    private String ten;
    private String gioitinh;
    private String ngaysinh;
    private int ngay,thang,nam;
    private String diachi;
    private String mathue;
    private String ngayky;

    public NhanVien(String manv, String ten, String gioitinh, String ngaysinh, String diachi, String mathue, String ngayky) {
        this.manv = manv;
        this.ten = ten;
        this.gioitinh = gioitinh;
        this.ngaysinh = ngaysinh;
        this.diachi = diachi;
        this.mathue = mathue;
        this.ngayky = ngayky;
    }

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getMathue() {
        return mathue;
    }

    public void setMathue(String mathue) {
        this.mathue = mathue;
    }

    public String getNgayky() {
        return ngayky;
    }

    public int getNgay() {
        return ngay;
    }

    public void setNgay(int ngay) {
        this.ngay = ngay;
    }

    public int getThang() {
        return thang;
    }

    public void setThang(int thang) {
        this.thang = thang;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }

    public void setNgayky(String ngayky) {
        this.ngayky = ngayky;
    }

}

public class danhSachNhanVien {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String line = sc.nextLine();
        List<NhanVien> a = new ArrayList<>();
        for (int i = 1; i <= t; i++) {
            String ten = sc.nextLine();
            String gioitinh = sc.nextLine();
            String ngaysinh = sc.nextLine();
            String[] parts = ngaysinh.split("/");
            String diachi = sc.nextLine();
            String mathue = sc.nextLine();
            String ngayky = sc.nextLine();
            String manv = "";
            if(i<10) manv = "0000"+Integer.toString(i);
            else manv = "000"+Integer.toString(i);
            NhanVien nv = new NhanVien(manv, ten, gioitinh, ngaysinh, diachi, mathue, ngayky);
            nv.setNgay(Integer.parseInt(parts[0]));
            nv.setThang(Integer.parseInt(parts[1]));
            nv.setNam(Integer.parseInt(parts[2]));
            a.add(nv);
        }
        Collections.sort(a, new Comparator<NhanVien>(){
            @Override
            public int compare(NhanVien nv1 ,NhanVien nv2){
                if(nv1.getNam()>nv2.getNam()) return 1;
                else if (nv1.getNam()==nv2.getNam()){
                    if(nv1.getThang()>nv2.getThang()) return 1;
                    else if(nv1.getThang()==nv2.getThang()){
                        if(nv1.getNgay()>nv2.getNgay())
                            return 1;
                        return -1;
                    }
                    return -1;
                }
                return -1;
            }
        });
        for (int i = 0; i < t; i++) {
            System.out.printf("%s %s %s %s %s %s %s\n", a.get(i).getManv(), a.get(i).getTen(), a.get(i).getGioitinh(), a.get(i).getNgaysinh(), a.get(i).getDiachi(), a.get(i).getMathue(), a.get(i).getNgayky());
        }
    }
}
