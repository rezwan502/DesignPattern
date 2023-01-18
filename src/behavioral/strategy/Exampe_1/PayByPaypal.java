package behavioral.strategy.Exampe_1;

public class PayByPaypal implements PaymentStrategy{
    @Override
    public void pay(int amount) {
        System.out.println("Paypal: " + amount);
    }
}
