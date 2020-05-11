package Shape;

public class Triangle extends Shape {
    private static Shape triangle;

    public Triangle() {
    }

    public Triangle(String brush, String paper, String frame) {
        super(brush, paper, frame);
    }


    public static Shape createTriangle()
    {
        if (triangle == null) {
            triangle = new Triangle();
        }
        return triangle;
    }

    @Override
    public String draw() {
        return "Draw triangle: " + getBrush() + ", " + getPaper() + ", " + getFrame();
    }


}