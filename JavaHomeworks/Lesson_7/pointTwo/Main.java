package Lesson_7.pointTwo;

public class Main {

    public static void main(String[] args) {
       
        Circle circle = new Circle(8, "green", "red");
        Rectangle rectangle = new Rectangle(10, 14, "blue", "yellow");
        Triangle triangle = new Triangle(4, 6, 7, "white", "red");

        
        System.out.println("Круг:\n" +
            "Периметр: " + circle.getPerimeter() + "\n" +
            "Площадь: " + circle.getArea() + "\n" +
            "Цвет заливки: " + circle.getFillColor() + "\n" +
            "Цвет границы: " + circle.getBorderColor() + "\n");

        System.out.println("Прямоугольник:\n" +
            "Периметр: " + rectangle.getPerimeter() + "\n" +
            "Площадь: " + rectangle.getArea() + "\n" +
            "Цвет заливки: " + rectangle.getFillColor() + "\n" +
            "Цвет границы: " + rectangle.getBorderColor() + "\n");
        

        System.out.println("Треугольник:\n" +
            "Периметр: " + triangle.getPerimeter() + "\n" +
            "Площадь: " + triangle.getArea() + "\n" +
            "Цвет заливки: " + triangle.getFillColor() + "\n" +
            "Цвет границы: " + triangle.getBorderColor());
    }
}
