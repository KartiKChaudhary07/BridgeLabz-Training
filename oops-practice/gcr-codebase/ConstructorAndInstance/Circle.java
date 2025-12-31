class Circle {
    double radius;

    Circle() {
        this(1.0); // constructor chaining
    }

    Circle(double r) {
        radius = r;
    }

    double area() {
        return 3.14 * radius * radius;
    }
}
