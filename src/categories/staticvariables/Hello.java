package categories.staticvariables;

public class Hello {

    private static String msgStatic = "Hello from static";
    private String msgInstance = "Hello from non-static";

    public static void main(String[] args) {
        System.out.println(msgStatic); // Okay
//        System.out.println(msgInstance);
        // Compilation error: non-static variable xxx cannot be referenced from a static context
    }
}
