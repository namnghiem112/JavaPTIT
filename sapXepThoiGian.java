package demo;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author hongs
 */
class Time {
    private int h;
    private int se;
    private int mi;
    public Time (int h,int se,int mi){
        this.h=h;
        this.se=se;
        this.mi=mi;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public int getSe() {
        return se;
    }

    public void setSe(int se) {
        this.se = se;
    }

    public int getMi() {
        return mi;
    }

    public void setMi(int mi) {
        this.mi = mi;
    }
    
}
public class sapXepThoiGian {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Time> a = new  ArrayList<>();
        for (int i=0;i<n;i++){
            int h = sc.nextInt();
            int se=sc.nextInt();
            int mi = sc.nextInt();
            Time dh = new Time(h, se, mi);
            a.add(dh);
        }
        Collections.sort(a, new Comparator<Time>() {
            @Override
            public int compare(Time o1, Time o2) {
                if (o1.getH() != o2.getH()) {
                    return o1.getH() - o2.getH();
                }
                if (o1.getSe() != o2.getSe()) {
                    return o1.getSe() - o2.getSe();
                }
                return o1.getMi() - o2.getMi();
            }
        });
        for (int i=0;i<n;i++){
            System.out.println(a.get(i).getH()+" "+a.get(i).getSe()+" "+a.get(i).getMi());
        }
    }
}

