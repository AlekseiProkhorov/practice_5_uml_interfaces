public class MovableTest {
    public static void testPoint() {
        System.out.println("MovablePoint test");
        MovablePoint point = new MovablePoint(0, 0, 1, 1);
        point.moveUp();
        System.out.println("point move up\n" + point.toString());
        point.moveDown();
        System.out.println("point move down\n" + point.toString());
        point.moveLeft();
        System.out.println("point move left\n" + point.toString());
        point.moveRight();
        System.out.println("point move right\n" + point.toString());
    }

    public static void testCircle() {
        System.out.println("MovableCircle test");
        MovableCircle circle = new MovableCircle(0, 0, 1, 1, 2);
        circle.moveUp();
        System.out.println("circle move up\n" + circle.toString());
        circle.moveDown();
        System.out.println("circle move down\n" + circle.toString());
        circle.moveLeft();
        System.out.println("circle move left\n" + circle.toString());
        circle.moveRight();
        System.out.println("circle move right\n" + circle.toString());
    }
}
