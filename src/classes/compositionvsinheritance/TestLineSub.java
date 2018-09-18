package classes.compositionvsinheritance;

public class TestLineSub {

    public static void main(String[] args) {
        LineSub l1 = new LineSub(11, 22, 33, 44);
        System.out.println(l1);
        Point p1 = new Point(100, 200);
        Point p2 = new Point(300, 400);
        LineSub l2 = new LineSub(p1, p2);
        System.out.println(l2);
        LineSub l3 = new LineSub(p2);
        System.out.println(l3);
    }
}
