package oop2;
// Shapeインターフェース
interface Shape {
    double calculateArea();
}
//Triangle class
class Triangle implements Shape {
    final private double base;
    final private double height;
    public Triangle(double base,double height){
    this.base = base;
    this.height = height;
    }
    @Override
    public double calculateArea(){
        return 0.5 * base *height;
    }
}

//Rectangle class
class Rectangle implements Shape {
    final private double width;
    final private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}

class ShapeTest{
    public static double getTotalArea(Shape[] shapes){
        double totalArea =0.0;
        for(Shape shape:shapes){
            totalArea += shape.calculateArea();
        }
        return totalArea;
    }
}

//創まり
public class Main{
    public static void main(String[] args){
        Shape[] shapes = new Shape[3];
        shapes[0] = new Triangle(10.0,5.0);
        shapes[1] = new Rectangle(8.0,4.0);
        shapes[2] = new Circle(5.0);

        Shape triangle = new Triangle(10,5);
        System.out.println("三角形の面積 : " + triangle.calculateArea());

        Shape Rectangle = new Rectangle(8.0,4.0);
        System.out.println("四角形の面積 : " + Rectangle.calculateArea());

        Shape Circle = new Circle(5.0);
        System.out.printf("円の面積 : %.2f\n", Circle.calculateArea());

        double totalArea =ShapeTest.getTotalArea(shapes);
        System.out.printf("エリアの合計 ： %.2f\n", totalArea);
    }
}

//shsapeを継承したCircle class
class Circle implements Shape{
    final private double radius;

    public Circle(double radius){
        this.radius = radius;
    }
    @Override
    public double calculateArea(){
        return Math.PI * radius * radius;
    }
}