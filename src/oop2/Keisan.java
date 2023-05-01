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



//shapeを継承したCircle class
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
