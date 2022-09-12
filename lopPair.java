package newpackage;

import java.util.Scanner;

/**
 *
 * @author NghiêmNam
 */
class Pair <K,V>{
    private K key;
    private V value;
    public Pair (){
        
    }
    public Pair (K k,V v){
        this.key =k;
        this.value=v;
    }
    public static int kiemtra(int n){
        if(n<2) return 0;
        for (int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) return 0;
        }
        return 1;
    }
    public boolean isPrime(){
        int inKey = Integer.parseInt(this.key.toString()), inVal = Integer.parseInt(this.value.toString());
        if(kiemtra(inKey)==1 && kiemtra(inVal)==1) return true;
        return false;
    }
    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
    @Override
    public String toString() {
        return this.key + " " + this.value;
    }
}
public class lopPair {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            boolean check = false;
            for(int i = 2; i <= 2*Math.sqrt(n); i++){
                Pair<Integer, Integer> p = new Pair<>(i, n-i);
                if(p.isPrime()){
                    System.out.println(p);
                    check = true;
                    break; 
                }
            }
            if(!check) System.out.println(-1);
        }
    }
    
}
