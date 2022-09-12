package newpackage;

import java.util.Scanner;

class Point {

    private double x, y;
    public Point(){
        
    }
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
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

    public static Point nextPoint(Scanner sc) {
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        return new Point(a, b);
    }

    public double distance(Point secondPoint) {
        return Math.sqrt(Math.pow(this.x - secondPoint.x, 2) + Math.pow(this.y - secondPoint.y, 2));
    }

    public static double distance(Point p1, Point p2) {
        return Math.sqrt(Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2));
    }

    @Override
    public String toString() {
        return x + " " + y;
    }
}

class Triangle extends Point {

    private Point a, b, c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getPerimeter() {
        double p = Math.pow(10, 3);
        double x = distance(this.a, this.b);
        double y = distance(this.b, this.c);
        double z = distance(this.a, this.c);
        double res = (x + y + z);
        return Math.round(res * p) / p;
    }

    public boolean valid() {
        double x = distance(this.a, this.b);
        double y = distance(this.b, this.c);
        double z = distance(this.a, this.c);
        if (x + y > z && x + z > y && y + z > x) {
            return true;
        }
        return false;
    }
}

public class lopTriangle_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            Triangle a = new Triangle(Point.nextPoint(sc), Point.nextPoint(sc), Point.nextPoint(sc));
            if(!a.valid()){
                System.out.println("INVALID");
            } else{
                System.out.println(a.getPerimeter());
            }
        }
    }
}
