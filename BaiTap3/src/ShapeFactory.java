import Shape.Circle;
import Shape.Rectangle;
import Shape.Shape;
import Shape.Triangle;

public class ShapeFactory {
    public Shape createShape(ShapeType shapeType) {
        if (null != shapeType) switch (shapeType) {
            case rectangle:
                return Rectangle.createRectangle();
            case circle:
                return Circle.createCircle();
            case triangle:
                return Triangle.createTriangle();
            default:
                break;
        }
        return null;
    }
}