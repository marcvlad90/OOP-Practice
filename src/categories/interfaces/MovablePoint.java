package categories.interfaces;

public class MovablePoint implements Movable {

    public int x, y, xSpeed, ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public void moveUp() {
        y = y + ySpeed;
    }

    public void moveDown() {
        y = y - ySpeed;
    }

    public void moveLeft() {
        x = x - xSpeed;
    }

    public void moveRight() {
        x = x + xSpeed;
    }

}
