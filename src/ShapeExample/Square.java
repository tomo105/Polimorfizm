package ShapeExample;

public class Square extends Shape {
    @Override
    public void erase() {
        System.out.println("erase square");
    }

    @Override
    public void draw() {
        System.out.println("draw square");
    }
}
