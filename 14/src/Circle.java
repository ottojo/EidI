public class Circle extends Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
        this.edges = 0;
        this.circumference = Math.PI * radius * 2;
    }

    @Override
    double calcArea() {
        return Math.PI * radius * radius;
    }

}
