// Interface
interface Color {

    void fillColor();

}

// Abstract Class
abstract class Shape {

    // abstract method
    abstract void draw();

    // normal method
    void message() {

        System.out.println("This is Shape Class");

    }

}

// Child Class (Inheritance + Interface)
class Circle extends Shape implements Color {

    // Implement abstract method
    void draw() {

        System.out.println("Drawing Circle");

    }

    // Implement interface method
    public void fillColor() {

        System.out.println("Filling Circle with Color");

    }

}

// Another Child Class
class Rectangle extends Shape implements Color {

    void draw() {

        System.out.println("Drawing Rectangle");

    }

    public void fillColor() {

        System.out.println("Filling Rectangle with Color");

    }

}

// Main Class
public class ShapeDemo {

    public static void main(String args[]) {

        // Circle Object
        Circle c = new Circle();

        c.message();
        c.draw();
        c.fillColor();

        System.out.println();

        // Rectangle Object
        Rectangle r = new Rectangle();

        r.message();
        r.draw();
        r.fillColor();

    }

}
