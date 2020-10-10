public class MovableTest {
    public static void run(Movable shape, String name) {
        System.out.println("Movable " + name + " test");
        shape.moveUp();
        System.out.println(name + " move up\n" + shape.toString());
        shape.moveDown();
        System.out.println(name + " move down\n" + shape.toString());
        shape.moveLeft();
        System.out.println(name + " move left\n" + shape.toString());
        shape.moveRight();
        System.out.println(name + " move right\n" + shape.toString());
    }
}
