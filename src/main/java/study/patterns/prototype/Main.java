package study.patterns.prototype;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Circle circle1 = new Circle(10, 20,8);
        Circle circle2 = circle1.copy();

        System.out.println("circle1.X" + circle1.getX());
        System.out.println("circle2.X" + circle2.getX());
    }
}
