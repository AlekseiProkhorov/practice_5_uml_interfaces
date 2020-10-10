public class Main {

    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(0, 0, 1, 1);
        MovableCircle circle = new MovableCircle(0, 0, 1, 1, 2);
        MovableTest.run(point, "point");
        MovableTest.run(circle, "circle");
    }
}
