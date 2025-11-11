import java.util.Scanner;
public class labpgm4 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.input();
        r.printArea();

        Triangle t = new Triangle();
        t.input();
        t.printArea();

        Circle c = new Circle();
        c.input();
        c.printArea();
    }
}

class InputScanner {
    Scanner sc = new Scanner(System.in);
}

abstract class shape extends InputScanner {
    int dim1, dim2;
    abstract void input();
    abstract void printArea();
}

class Rectangle extends shape {
    void input() {
        System.out.println("Enter the dimensions of the rectangle (length and breadth):");
        dim1 = sc.nextInt();
        dim2 = sc.nextInt();
    }
    void printArea() {
        double area = (double) (dim1 * dim2);
        System.out.println("Area of Rectangle = " + area);
    }
}

class Triangle extends shape {
    void input() {
        System.out.println("Enter the dimensions of the triangle (base and height):");
        dim1 = sc.nextInt();
        dim2 = sc.nextInt();
    }
    void printArea() {
        double area = 0.5 * dim1 * dim2;
        System.out.println("Area of Triangle = " + area);
    }
}

class Circle extends shape {
    void input() {
        System.out.println("Enter the radius of the circle:");
        dim1 = sc.nextInt();
    }
    void printArea() {
        double area = Math.PI * dim1 * dim1;
        System.out.println("Area of Circle = " + area);
    }
}
