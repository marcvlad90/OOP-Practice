package categories.polymorphism;

public class Dog extends Animal {

    @Override
    public void greeting() {
        System.out.println("dog ham!");
    }

    public void greeting(Dog another) {
        System.out.println("dog another's dog ham!");
    }

}
