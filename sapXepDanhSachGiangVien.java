
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


/**
 *
 * @author NghiêmNam
 */
class GiangVien {
    private String hoten,bomon,ma,ten,nganh;
    public GiangVien(){
        
    }
    public GiangVien(String ma,String hoten,String bomon){
        this.ma=ma;
        this.hoten=hoten;
        this.bomon=bomon;
        String[] parts = bomon.split("\\s+");
        String res ="";
        for (String x : parts){
            res += Character.toUpperCase(x.charAt(0));
        }
        this.nganh = res;
        String[] parts2 = hoten.split("\\s+");
        this.ten = parts2[parts2.length-1];
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getBomon() {
        return bomon;
    }

    public void setBomon(String bomon) {
        this.bomon = bomon;
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

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }
    
}
public class sapXepDanhSachGiangVien {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Integer t = Integer.parseInt(sc.nextLine());
        List<GiangVien>a = new ArrayList<>();
        for (int i=1;i<=t;i++){
            String hoten = sc.nextLine();
            String bomon = sc.nextLine();
            String ma ="";
            if(i<10) ma = "GV0"+ Integer.toString(i);
            else ma = "GV"+ Integer.toString(i);
            GiangVien gv = new GiangVien(ma, hoten, bomon);
            a.add(gv);
        }
        Collections.sort(a, new Comparator<GiangVien>(){
            @Override
            public int compare(GiangVien gv1, GiangVien gv2){
                if(gv1.getTen().compareTo(gv2.getTen())>0) return 1;
                else if(gv1.getTen().compareTo(gv2.getTen())==0){
                    if(gv1.getMa().compareTo(gv2.getMa())>0)
                        return 1;
                    return -1;
                }
                return -1;  
            }
        });
        for (int i=0;i<t;i++){
            System.out.printf("%s %s %s\n",a.get(i).getMa(),a.get(i).getHoten(),a.get(i).getNganh());
        }
    }
    
}
