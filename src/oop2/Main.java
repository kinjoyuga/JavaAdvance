package oop2;

public class Main {
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
