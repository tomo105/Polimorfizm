package ShapeExample;

public class Main {
    public static void main(String[] args) {
        RandomShapeGenerator r = new RandomShapeGenerator();
        Shape[] s = new Shape[9];
        for (int i = 0; i < s.length; i++)
            s[i] = r.next();

        for( Shape shape :s)
            shape.draw();
    }
}
