package chapter5;

public class Practice4 {
    public static void main(String[] args) {
        double triangleArea = calcTriangleArea(10.0,5.0);
        System.out.println("Triangle Area: " + triangleArea);
        double circleArea = calcCircleArea(5.0);
        System.out.println("Circle Area: " + circleArea);
    }
    public static double calcTriangleArea(double bottom, double height){
        double area = (bottom * height) / 2;
        return area;
    }
    public static double calcCircleArea(double radius){
        double area = radius * radius * 3.14;
        return area;
    }
}
