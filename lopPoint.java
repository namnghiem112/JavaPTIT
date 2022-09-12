package demo;

import java.util.Scanner;

class Point {
    private double x,y;
    Point(){

    }
    Point(double x, double y){

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

    @Override
    public String toString() {
        return x+" "+y;
    }
}

public class lopPoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- != 0){
            Point p1 = new Point();
            Point p2 = new Point();
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();
            p1.setX(x);
            p1.setY(y);
//            System.out.println(x + " " + y);
            x = scanner.nextDouble();
            y = scanner.nextDouble();
            p2.setX(x);
            p2.setY(y);
//            System.out.println(x + " " + y);
            System.out.println(String.format("%.4f",p1.distance(p1,p2)));
        }
    }
}
