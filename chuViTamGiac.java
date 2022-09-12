package newpackage;


import java.util.Scanner;

class Point {
    private double x,y;
    Point(){

    }
    Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    Point(Point p){
        
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    public double distance(Point secondPoint){
        return Math.sqrt(Math.pow(this.x - secondPoint.x,2) + Math.pow(this.y - secondPoint.y,2));
    }
    public double distance(Point p1, Point p2){
        return Math.sqrt(Math.pow(p1.x - p2.x,2) + Math.pow(p1.y - p2.y,2));
    }
    public double tinhChuVi(Point p1,Point p2){
        double a = this.distance(p1);
        double b = this.distance(p2);
        double c = p1.distance(p2);
        if(a+b>c && a+c>b && b+c>a) return a+b+c;
        else return 0;
    }
    @Override
    public String toString() {
        return "";
    }
}

public class chuViTamGiac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- != 0){
            Point p1 = new Point();
            Point p2 = new Point();
            Point p3 = new Point();
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();
            p1.setX(x);
            p1.setY(y);
            x = scanner.nextDouble();
            y = scanner.nextDouble();
            p2.setX(x);
            p2.setY(y);
            x = scanner.nextDouble();
            y = scanner.nextDouble();
            p3.setX(x);
            p3.setY(y);
            if(p1.tinhChuVi(p2, p3)==0) System.out.println("INVALID");
            else System.out.println(String.format("%.3f",p1.tinhChuVi(p2,p3)));
        }
    }
}
