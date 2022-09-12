package newpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author NghiêmNam
 */
class IntSet{
    private int[] a;
    public IntSet(){
        
    }
    public IntSet (int[] a){
        this.a=a;
    }
    public IntSet union(IntSet p){
        int m = this.getA().length;
        int n = p.getA().length;
        int[] res = new int[n+m];
        int dem=0;
        for (int i=0;i<m;i++){
            res[dem]=this.getA()[i];
            dem++;
        }
        for (int i=0;i<n;i++){
            res[dem]=p.getA()[i];
            dem++;
        }
        TreeSet<Integer> newres = new TreeSet();
        for (int i=0;i<m+n;i++){
            newres.add(res[i]);
        }
        int len = newres.size();
        int[] res2 = new int[len];
        int j=0;
        for (int i : newres){
            res2[j]=i;
            j++;
        }
        return new IntSet(res2);
    }

    public int[] getA() {
        return a;
    }

    public void setA(int[] a) {
        this.a = a;
    }
    
    @Override
    public String toString(){
        String tmp = Arrays.toString(a);
        tmp = tmp.replaceAll(",", "");
        tmp = tmp.substring(1,tmp.length()-1);
        return tmp;
    }
}
public class lopIntset {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
        for(int i = 0; i<n; i++) a[i] = sc.nextInt();
        for(int i = 0; i<m; i++) b[i] = sc.nextInt();
        IntSet s1 = new IntSet(a);
        IntSet s2 = new IntSet(b);
        IntSet s3 = s1.union(s2);
        System.out.println(s3);
    }
}
