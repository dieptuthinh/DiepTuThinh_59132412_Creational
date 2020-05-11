package Shape;

public class Rectangle extends Shape {

    private static Shape rectangle;

    public Rectangle() {
    }

    public Rectangle(String brush, String paper, String frame) {
        super(brush, paper, frame);
    }
    

    public static Shape createRectangle() {
        if (rectangle == null) {
            rectangle = new Rectangle();
        }
        return rectangle;
    }

    @Override
    public String draw() {
        return "Draw rectangle: " + getBrush() + ", " + getPaper() + ", " + getFrame();
    }


    
}