class Shape {
    int height;
    int width;

    Shape(int height, int width) {
        this.height = height;
        this.width = width;
    }

    void area() {
        float result = height * width;
        System.out.println("Shape area: " + result);
    }

    void circum() {
        float result = 2 * (height + width);
        System.out.println("Shape circumference: " + result);
    }
}

class Circle extends Shape {

    Circle(int radius) {
        super(radius, radius);
    }

    @Override
    void area() {
        float result = (float) (Math.PI * height * height);
        System.out.println("Circle area: " + result);
    }

    @Override
    void circum() {
        float result = (float) (2 * Math.PI * height);
        System.out.println("Circle circumference: " + result);
    }
}

class Triangle extends Shape {

    Triangle(int base, int height) {
        super(height, base);
    }

    @Override
    void area() {
        float result = 0.5f * width * height;
        System.out.println("Triangle area: " + result);
    }

    @Override
    void circum() {
        float hypotenuse = (float) Math.sqrt(height * height + width * width);
        float result = height + width + hypotenuse;
        System.out.println("Triangle circumference: " + result);
    }
}

 class Finalpractice1 {
    public static void main(String[] args) {
        Shape shape = new Shape(10, 20);
        shape.area();
        shape.circum();

        Shape circle = new Circle(10);
        circle.area();
        circle.circum();

        Shape triangle = new Triangle(10, 20);
        triangle.area();
        triangle.circum();
    }
}
