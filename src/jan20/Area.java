package jan20;

import java.util.Scanner;

public class Area {

    public static void main(String[] args) {
        Area area =  new Area();
        Scanner sc = new Scanner(System.in);
        System.out.println("****Welcome to our Calculator");
        System.out.println("1.Area of Circle");
        System.out.println("2.Area of Sqaure");
        System.out.println("3.Area of Rectangle");
        System.out.println("Enter your choice");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter the radius of the circle");
                int radius = sc.nextInt();
                double circle = area.circle(radius);
                System.out.println("Area of circle is : " +circle);
                break;
            case 2:
                System.out.println("Enter the size of the square");
                int side = sc.nextInt();
                int sq = area.square(side);
                System.out.println("Area of Square is : " +sq);
                break;
            case 3:
                System.out.println("Enter the length of the Rectangle");
                int length = sc.nextInt();
                System.out.println("Enter the breadth of the Rectangle");
                int breadth = sc.nextInt();
                int rec = area.rectangle(length, breadth);
                System.out.println("Area of Square is : " +rec);
                break;
            default:
                System.out.println("Invalid Selection");
        }
    }
    public double circle(int r){
        double area = (3.14*r*r);
        return area;
    }
    public int square(int s){
        int area = (s*s);
        return area;
    }
    public int rectangle(int l, int b){
        int area = (l*b);
        return area;
    }
}
