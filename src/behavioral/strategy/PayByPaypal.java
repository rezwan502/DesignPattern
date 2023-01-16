package behavioral.strategy;

public class PayByPaypal implements PaymentStrategy{
    @Override
    public void pay(int amount) {
        System.out.println("Paypal: " + amount);
    }
}
