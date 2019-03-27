package ShapeExample;

import java.util.Random;

// fabryka
public class RandomShapeGenerator {
    private Random random = new Random(40);

    public Shape next() {
        switch (random.nextInt(7)) {
            default:
                System.out.println("elko");
            case 0:
                return new Circle();
            case 1:
                return new Triangle();
            case 2:
                return new Square();
        }
    }
}
