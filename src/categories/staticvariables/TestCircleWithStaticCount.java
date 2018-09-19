package categories.staticvariables;

public class TestCircleWithStaticCount {

    public static void main(String[] args) {
        System.out.println(CircleWithStaticCount.count);
        CircleWithStaticCount c1 = new CircleWithStaticCount(22);
        System.out.println(c1.count);
        System.out.println(CircleWithStaticCount.count);
        CircleWithStaticCount c2 = new CircleWithStaticCount(44);
        System.out.println(c2.count);
        System.out.println(CircleWithStaticCount.count);
    }
}
