package point;

public class Point {

    private int x, y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int[] getXY() {
        int[] results = new int[2];
        results[0] = x;
        results[1] = y;
        return results;
    }

    @Override
    public String toString() {
        return String.format("(%d,%d, args)", x, y);
    }

 // Return the distance from this instance to the given point at (x,y).
    public double distance(int x, int y) {
       int xDiff = this.x - x;
       int yDiff = this.y - y;
       return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }
    // Return the distance from this instance to the given Point instance (called another).
    public double distance(Point another) {
       int xDiff = this.x - another.x;
       int yDiff = this.y - another.y;
       return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }
    // Return the distance from this instance to (0,0).
    public double distance() {
       return Math.sqrt(this.x*this.x + this.y*this.y);
    }
}
