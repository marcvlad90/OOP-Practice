package categories.compositionvsinheritance;

public class LineSub extends Point {

    Point end = new Point(13, 14);

    // Constructors
    public LineSub(int beginX, int beginY, int endX, int endY) {
        super(beginX, beginY); // construct the begin Point
        this.end = new Point(endX, endY); // construct the end Point
    }

    public LineSub(Point begin, Point end) { // caller to construct the Points
        super(begin.getX(), begin.getY()); // need to reconstruct the begin Point
        this.end = end;
    }

    public LineSub(Point begin) { // caller to construct the Points
        super(begin.getX(), begin.getY()); // need to reconstruct the begin Point
    }

    @Override
    public String toString() {
        return "Line: from point (" + super.getX() + "," + super.getY() + ") to point (" + end.getX() + ","
                + end.getY() + ")";
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }
}
