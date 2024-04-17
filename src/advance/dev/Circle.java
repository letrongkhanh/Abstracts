package advance.dev;

class Circle extends Shape {
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    double chuVi() {
        return 2 * Math.PI * r;
    }

    @Override
    double dienTich() {
        return Math.PI * r * r;
    }
}

class Rectangle extends Shape {
    private double a, b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    double chuVi() {
        return 2 * (a + b);
    }

    @Override
    double dienTich() {
        return a * b;
    }
}
