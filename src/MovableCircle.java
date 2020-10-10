public class MovableCircle implements Movable{
    int radius;
    MovablePoint center;

    public MovableCircle() {}

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }
    public void moveUp(){
        center.y += center.ySpeed * center.speedRatio;
    }
    public void moveDown(){
        center.y -= center.ySpeed * center.speedRatio;
    }
    public void moveLeft(){
        center.x -= center.xSpeed * center.speedRatio;
    }
    public void moveRight(){
        center.x += center.xSpeed * center.speedRatio;
    }
    public String toString(){
        return "Current circle coordinates: \n" +
                "x = " + center.x + "\ny = " + center.y +
                "\nradius = " + radius;
    }

}
