package demo;

import java.util.Scanner;

/**
 *
 * @author NghiêmNam
 */
class Rectange {

	private double width;

	private double height;

	private String color;

	public Rectange() {
            this.width = 1;
            this.height = 1;
	}

	public Rectange(double width, double height, String color) {
            this.width = width;
            this.height = height;
            this.color = color;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
            this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
            this.height = height;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
            this.color = color;
	}

	public double findArea() {
		return this.width*this.height;
	}

	public double findPerimeter() {
		return this.width*2+this.height*2;
	}

    String getColor(String s) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}

public class khaiBaoLopHinhChuNhat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        String s = sc.next();
        Rectange re = new Rectange();
        if(x>0 && y >0){
            re.setHeight(x);
            re.setWidth(y);
            double tich = re.findArea();
            double sum = re.findPerimeter();
            String tmp = s.substring(0,1).toUpperCase()+s.substring(1).toLowerCase();
            re.setColor(tmp);
            System.out.println((int)sum+" "+(int)tich+" "+re.getColor());
        }
        else System.out.println("INVALID");
    }
}
