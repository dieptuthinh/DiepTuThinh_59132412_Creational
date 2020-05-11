
import Shape.Shape;

public class App {
    public static void main(String[] args) throws Exception {
        ShapeFactory shapeFatogy = new ShapeFactory();
        Shape Rec = shapeFatogy.createShape(ShapeType.rectangle);
        Shape Cir = shapeFatogy.createShape(ShapeType.circle);
        Shape Tri = shapeFatogy.createShape(ShapeType.triangle);
        

        Shape Rec1 = shapeFatogy.createShape(ShapeType.rectangle);
        Rec1.setBrush("Rec-Brurrrr");
        Rec1.setPaper("Rec-Paper");
        Rec1.setFrame("Rec-Frame");
        

        Shape Cir1 = shapeFatogy.createShape(ShapeType.circle);
        Cir1.setBrush("Cir1-Bru");
        Cir1.setPaper("Cir1-Paper");
        Cir1.setFrame("Cir1-Frame");

        Shape Tri1 = shapeFatogy.createShape(ShapeType.triangle);
        Tri1.setBrush("Tri1-Bru");
        Tri1.setPaper("Tri1-Paper");
        Tri1.setFrame("Tri1-Frame");



        System.out.println(Rec.draw());
        System.out.println(Cir.draw());
        System.out.println(Tri.draw());


    }
}
