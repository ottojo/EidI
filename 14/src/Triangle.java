public class Triangle extends Shape {
    double height;
    double width;

    public Triangle(double height, double width) {
        this.height = height;
        this.width = width;
        this.edges = 3;
        this.circumference = width + 2 * (Math.sqrt(height * height + (width / 2) * (width / 2)));
    }

    @Override
    double calcArea() {
        return 0.5 * width * height;
    }

}
