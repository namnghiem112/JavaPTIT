/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package demo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
 * @author NghiêmNam
 */
public class helloFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Đọc dữ liệu từ File với Scanner
        try {
            FileReader fr = new FileReader("Hello.txt");
            BufferedReader br = new BufferedReader(fr);
            String line;
            while(true){
                line=br.readLine();
                if(line==null) break;
                System.out.println(line);
            }
        } catch (IOException e) {
        }
    }   
}
