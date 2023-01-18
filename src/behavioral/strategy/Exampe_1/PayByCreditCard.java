package behavioral.strategy.Exampe_1;

public class PayByCreditCard implements PaymentStrategy {

    @Override
    public void pay(int amount) {
        System.out.println("CreditCard: " + amount);
    }
}
