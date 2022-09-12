package demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author NghiêmNam
 */
public class tinhTongFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner sc = new Scanner(new File("DATA.in"));
        long d = 0;
        while (sc.hasNext()) {
            String s = sc.next();
            try {
                d += Integer.parseInt(s);
            } catch (Exception x) {
            }
        }
        System.out.print(d);
    }
    
}
