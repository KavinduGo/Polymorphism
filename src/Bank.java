public class Bank {
    void savingsBalance() {
        System.out.println("10000");
    }
}
class BOC extends Bank {
    @Override
    void savingsBalance() {
        System.out.println("25000");
    }
}
class PeoplesBank extends Bank {
    @Override
    void savingsBalance() {
        System.out.println("30000");
    }
}
class NSB extends Bank {
    @Override
    void savingsBalance() {
        System.out.println("35000");
    }
}
class Test {
    public static void main(String[] args) {
        Bank b;
        b = new BOC();
        b.savingsBalance();
        b = new PeoplesBank();
        b.savingsBalance();
        b = new NSB();
        b.savingsBalance();
    }
}
