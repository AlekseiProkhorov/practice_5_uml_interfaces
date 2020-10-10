public class MovableCircle implements Movable {
    int radius;
    MovablePoint center;

    public MovableCircle() {
    }

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    public void moveUp() {
        center.moveUp();
    }

    public void moveDown() {
        center.moveDown();
    }

    public void moveLeft() {
        center.moveLeft();
    }

    public void moveRight() {
        center.moveRight();
    }

    public String toString() {
        return "x = " + center.x + "\ny = " + center.y +
                "\nradius = " + radius;
    }

}
