import java.util.Scanner;

abstract class Shape {
    int width;
    abstract void area();
}

class Square extends Shape {
    public Square(int x) {
        this.width = x;
    }
    public void area() {
        int areax2 = width*width;
        System.out.println(areax2);
    }
}

class Circle extends Shape {
    public Circle(int x) {
        this.width = x;
    }
    public void area() {
        double areapi = Math.PI*width*width;
        System.out.println(areapi);
    }
}

class Program {
    public static void main(String[ ] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        Square a = new Square(x);
        Circle b = new Circle(y);
        a.area();
        b.area();

        sc.close();
    }
}