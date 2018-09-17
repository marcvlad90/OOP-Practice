package time;

public class TestTime {

    public static void main(String[] args) {
        // Test Constructors and toString()
        Time t1 = new Time(1, 2, 3);
        System.out.println(t1);  // toString()
        Time t2 = new Time();    // The default constructor
        System.out.println(t2);

        // Test Setters and Getters
        t1.setHour(4);
        t1.setMinute(5);
        t1.setSecond(6);
        System.out.println(t1);  // run toString() to inspect the modified instance
        System.out.println("Hour is: " + t1.getHour());
        System.out.println("Minute is: " + t1.getMinute());
        System.out.println("Second is: " + t1.getSecond());

        // Test setTime()
        t1.setTime(58, 59, 23);
        System.out.println(t1);  // toString()

        // Test nextSecond() and chaining
        System.out.println(t1.nextSecond()); // Return an instance of Time. Invoke Time's toString()
        System.out.println(t1.nextSecond().nextSecond().nextSecond());
     }
}
