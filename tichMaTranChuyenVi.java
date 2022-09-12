package demo;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author NghiêmNam
 */
public class tichMaTranChuyenVi {

    /**
     * @param hang
     * @param cot
     * @param mang
     * @param args the command line arguments
     * @return
     */
    public static int[][] chuyenvi(int hang, int cot, int[][] mang) {
        int[][] res = new int[100][100];
        for (int i = 0; i < cot; i++) {
            for (int j = 0; j < hang; j++) {
                res[i][j] = mang[j][i];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int x =1;x<=t;x++) {
            int hang = sc.nextInt();
            int cot = sc.nextInt();
            int[][] mang = new int[hang + 5][cot + 5];
            for (int i = 0; i < hang; i++) {
                for (int j = 0; j < cot; j++) {
                    mang[i][j] = sc.nextInt();
                }
            }
            int[][] res = new int[100][100];
            int[][] mang3 = new int[100][100];
            res = chuyenvi(hang, cot, mang);
            for (int i = 0; i < hang; i++) {
                for (int j = 0; j < hang; j++) {
                    mang3[i][j] = 0;
                    for (int k = 0; k < cot; k++) {
                        mang3[i][j] += mang[i][k] * res[k][j];
                    }
                }
            }
            System.out.printf("Test %d:\n",x);
            for (int i=0;i<hang;i++){
                for (int j=0;j<hang;j++){
                    System.out.print(mang3[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
}
