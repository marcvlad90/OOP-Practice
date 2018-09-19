package categories.staticvariables;

public class CircleWithStaticCount {

    public static int count = 0; // A static variable to count the number of instances created
    // shared by all the instances
    // Set to public to simplify access
    private double radius; // An instance variable for each circle to maintain its own radius

    public CircleWithStaticCount(double radius) {
        this.radius = radius;
        ++count; // one more instance created
    }
}
