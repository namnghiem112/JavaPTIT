
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


/**
 *
 * @author NghiêmNam
 */
class Tuoi {
    private String ten,ngaysinh;
    private int ngay,thang,nam;
    public Tuoi(){
        
    }
    public Tuoi(String ten, String ngaysinh){
        this.ten=ten;
        this.ngaysinh=ngaysinh;
        String[] parts = ngaysinh.split("/");
        this.ngay=Integer.parseInt(parts[0]);
        this.thang=Integer.parseInt(parts[1]);
        this.nam = Integer.parseInt(parts[2]);
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
    
}
public class treNhatGiaNhat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Integer t = Integer.parseInt(sc.nextLine());
        List<Tuoi>a = new ArrayList<>();
        for(int i=0;i<t;i++){
            String s = sc.nextLine();
            String[] res = s.split("\\s");
            String ten = res[0];
            String ngaysinh =res[1];
            Tuoi age = new Tuoi(ten, ngaysinh);
            a.add(age);
        }
        Collections.sort(a, new Comparator<Tuoi>(){
            @Override
            public int compare(Tuoi t1, Tuoi t2){
                if(t1.getNam()>t2.getNam()) return -1;
                else if(t1.getNam()==t2.getNam()){
                    if(t1.getThang()>t2.getThang())
                        return -1;
                    else if(t1.getThang()==t2.getThang()){
                        if(t1.getNgay()>t2.getNgay())
                            return -1;
                        return 1;
                    }
                    return 1;
                }
                return 1;
            }
        });
        System.out.println(a.get(0).getTen());
        System.out.println(a.get(t-1).getTen());
    }
    
}
