
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
    private String ma,ten,lop,email;
    public SinhVien (){
        
    }
    public SinhVien(String ma,String ten,String lop,String email){
        this.ma= ma;
        this.ten=ten;
        this.lop=lop;
        this.email=email;
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
    
}
public class sapXepSinhVienTheoLop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Integer t = Integer.parseInt(sc.nextLine());
        List<SinhVien> a = new ArrayList<>();
        for (int i=0;i<t;i++){
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            String lop = sc.nextLine();
            String email = sc.nextLine();
            SinhVien sv = new SinhVien(ma, ten, lop, email);
            a.add(sv);
        }
        Collections.sort(a, new Comparator<SinhVien>(){
            @Override
            public int compare(SinhVien sv1,SinhVien sv2){
                if(sv1.getLop().compareTo(sv2.getLop())>0)
                    return 1;
                else if(sv1.getLop().compareTo(sv2.getLop())==0){
                    if(sv1.getMa().compareTo(sv2.getMa())>0)
                        return 1;
                    return -1;
                }
                return -1;
            }
        });
        for(int i=0;i<t;i++){
            System.out.printf("%s %s %s %s\n",a.get(i).getMa(),a.get(i).getTen(),a.get(i).getLop(),a.get(i).getEmail());
        }
    }
}
