

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author NghiêmNam
 */
class WordSet {
    private String s;
    public WordSet(){
        
    }
    public WordSet (String s){
        this.s=s;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }
    public WordSet union (WordSet p){
        TreeSet<String> tr = new TreeSet<>();
        String res = this.getS()+" "+p.getS();
        res = res.trim();
        res = res.replaceAll("\\s+", " ");
        res = res.toLowerCase();
        String[] words = res.split("\\s");
        Arrays.sort(words);
        for (String word : words){
            tr.add(word);
        }
        String res2 = tr.toString();
        res2 = res2.replaceAll(",", "");
        res2 = res2.substring(1,res2.length()-1);
        return new WordSet(res2);
    }
    public WordSet intersection (WordSet p){
        TreeSet<String> a = new TreeSet<>();
        String x1 = this.getS().toLowerCase();
        x1=x1.trim();
        x1= x1.replaceAll("\\s+", " ");
        String[] tmp = x1.split("\\s");
        Arrays.sort(tmp);
        for (String word : tmp){
            a.add(word);
        }
        TreeSet<String> b = new TreeSet<>();
        String x2 = p.getS().toLowerCase();
        x2=x2.trim();
        x2= x2.replaceAll("\\s+", " ");
        String[] tmp2 = x2.split("\\s");
        Arrays.sort(tmp2);
        for (String word : tmp2){
            b.add(word);
        }
        String res="";
        for (String x : a){
            if(b.contains(x)) res=res+x+" ";
        }
        res = res.trim();
        return new WordSet(res);
    }
    @Override
    public String toString(){
        return this.getS();
    }
}
public class word {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        WordSet s1 = new WordSet(in.nextLine());
        WordSet s2 = new WordSet(in.nextLine());
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
}
