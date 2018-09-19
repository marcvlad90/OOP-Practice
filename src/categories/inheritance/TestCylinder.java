package categories.inheritance;

public class TestCylinder {

    public static void main(String args[]) {
        Cylinder c1 = new Cylinder();
        System.out.println("Cylinder radius = " + c1.getRadius() + " height = " + c1.getHeight()
                + " volume = " + c1.getVolume() + " area = " + c1.getArea());
        Cylinder c2 = new Cylinder(10.0);
        System.out.println("Cylinder radius = " + c2.getRadius() + " height = " + c2.getHeight()
                + " volume = " + c2.getVolume() + " area = " + c2.getArea());
        Circle circle1 = new Circle(200.00);
        Cylinder c3 = new Cylinder(4.0, 10.0);
        System.out.println("Cylinder radius = " + c3.getRadius() + " height = " + c3.getHeight()
                + " volume = " + c3.getVolume() + " area = " + c3.getArea());
        System.out.println(circle1.getArea());
        System.out.println(c1.getArea());
        System.out.println(c3.getArea());

    }
}
