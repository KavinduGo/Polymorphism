public class Shapes {
    void draw() {
        System.out.println("Drawing");
    }
}
class Rectangle extends Shapes {
    @Override
    void draw() {
        System.out.println("Drawing Rectangle");
    }
}
class Circle extends Shapes {
    @Override
    void draw() {
        System.out.println("Drawing Circle");
    }
}
class Triangle extends Shapes {
    @Override
    void draw() {
        System.out.println("Drawing Triangle");
    }
}
class testRun {
    public static void main(String[] args) {
        Shapes s;
         s = new Rectangle();
         s.draw();
         s = new Circle();
         s.draw();
         s = new Triangle();
         s.draw();
    }
}
