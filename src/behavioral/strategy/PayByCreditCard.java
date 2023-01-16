package behavioral.strategy;

public class PayByCreditCard implements PaymentStrategy {

    @Override
    public void pay(int amount) {
        System.out.println("CreditCard: " + amount);
    }
}
