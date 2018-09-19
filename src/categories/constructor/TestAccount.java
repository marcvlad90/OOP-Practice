package categories.constructor;

public class TestAccount {

    public static void main(String[] args) {
        Account a1 = new Account(11.22);
        Account a2 = new Account(100);
        Account a3 = new Account(33, 55.999);
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        a1.setBalance(400.521);
        System.out.println(a1);
        a1.credit(200.300);
        System.out.println(a1);
        a1.debit(300.300);
        System.out.println(a1);
    }
}
