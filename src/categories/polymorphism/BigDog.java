package categories.polymorphism;

public class BigDog extends Dog {

    @Override
    public void greeting() {
        System.out.println("big dog ham!");
    }

    @Override
    public void greeting(Dog another) {
        System.out.println("big dog another dog haaaam!");
    }
}
