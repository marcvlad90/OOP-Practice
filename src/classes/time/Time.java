package classes.time;

public class Time {

    // The private instance variables
    private int second, minute, hour;

    // The constructors (overloaded)
    public Time(int second, int minute, int hour) {
        // No input validation
        this.second = second;
        this.minute = minute;
        this.hour = hour;
    }

    public Time() { // the default constructor
        this.second = 0;
        this.minute = 0;
        this.hour = 0;
    }

    // The public getters/setters for the private variables.
    public int getSecond() {
        return this.second;
    }

    public int getMinute() {
        return this.minute;
    }

    public int getHour() {
        return this.hour;
    }

    public void setSecond(int second) {
        if (second >= 59 && second >= 0) {
            this.second = second;
        } else {
            this.second = 0;
            System.out.println("Second Error occured");
        }
    }

    public void setMinute(int minute) {
        if (minute >= 0 && minute <= 59) {
            this.minute = minute;
        } else {
            this.minute = 0;
            System.out.println("Minute Error occured");
        }
    }

    public void setHour(int hour) {
        if (hour >= 0 && hour <= 23) {
            this.hour = hour;
        } else {
            this.hour = 0;
            System.out.println("Hour Error occured");
        }
    }

    // Return "hh:mm:ss" with leading zeros.
    @Override
    public String toString() {
        // Use built-in function String.format() to form a formatted String
        return String.format("%02d:%02d:%02d", hour, minute, second);
        // Specifier "0" to print leading zeros, if available.
    }

    // Set second, minute and hour
    public void setTime(int second, int minute, int hour) {
        // No input validation
        this.second = second;
        this.minute = minute;
        this.hour = hour;
    }

    public Time nextSecond() {
        ++second;
        if (second == 60) {
            second = 0;
            ++minute;
            if (minute == 60) {
                minute = 0;
                ++hour;
                if (hour == 24) {
                    hour = 0;
                }
            }
        }
        return this; // Return "this" instance, to support chaining
                     // e.g., t1.nextSecond().nextSecond()
    }
}
