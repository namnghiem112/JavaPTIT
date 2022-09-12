
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


/**
 *
 * @author NghiêmNam
 */
class Gio{
    private String ma,ten,giovao,giora;
    private int gio,phut;
    public Gio(){
    
    }
    public Gio(String ma,String ten,String giovao,String giora){
        this.ma=ma;
        this.ten=ten;
        this.giovao=giovao;
        this.giora=giora;
        String[] time1 = giovao.split(":");
        String[] time2 = giora.split(":");
        int a = Integer.parseInt(time1[0]);
        int b = Integer.parseInt(time1[1]);
        int c = Integer.parseInt(time2[0]);
        int d = Integer.parseInt(time2[1]);
        if(d>=b) this.phut = d-b;
        else {
            this.phut = d+60-b;
            c--;
        }
        this.gio = c-a;
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

    public String getGiovao() {
        return giovao;
    }

    public void setGiovao(String giovao) {
        this.giovao = giovao;
    }

    public String getGiora() {
        return giora;
    }

    public void setGiora(String giora) {
        this.giora = giora;
    }

    public int getGio() {
        return gio;
    }

    public void setGio(int gio) {
        this.gio = gio;
    }

    public int getPhut() {
        return phut;
    }

    public void setPhut(int phut) {
        this.phut = phut;
    }
    
}
public class tinhGio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String line = sc.nextLine();
        List<Gio>a = new ArrayList<>();
        for(int i=0;i<t;i++){
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            String giovao = sc.nextLine();
            String giora = sc.nextLine();
            Gio g = new Gio(ma, ten, giovao, giora);
            a.add(g);
        }
        Collections.sort(a, new Comparator<Gio>(){
            @Override
            public int compare(Gio g1, Gio g2){
                if(g1.getGio()>g2.getGio()) return -1;
                else if(g1.getGio()==g2.getGio()){
                    if(g1.getPhut()>g2.getPhut())
                        return -1;
                    return 1;
                }
                return 1;
            }
        });
        for(int i=0;i<t;i++){
            System.out.printf("%s %s %d gio %d phut\n",a.get(i).getMa(),a.get(i).getTen(),a.get(i).getGio(),a.get(i).getPhut());
        }
    }
    
}
