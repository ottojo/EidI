public class Square extends Shape {
    double lenght;

    public Square(double lenght) {
        this.lenght = lenght;
        this.edges = 4;
        this.circumference = 4 * lenght;
    }

    @Override
    double calcArea() {
        return lenght * lenght;
    }

}
