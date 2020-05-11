package Shape;

public class Circle extends Shape {
    private static Shape circle;

    public Circle() {
    }

    public Circle(String brush, String paper, String frame) {
        super(brush, paper, frame);
    }


    public static Shape createCircle()
    {
        if (circle == null) {
            circle = new Circle();
        }
        return circle;
    }

    @Override
    public String draw() {
        return "Draw circle: " + getBrush() + ", " + getPaper() + ", " + getFrame();
    }

}