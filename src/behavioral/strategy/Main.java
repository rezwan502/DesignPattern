package behavioral.strategy;

public class Main {
    public static void main(String[] args) {
        PaymentService service = new PaymentService();
        service.setStrategy(new PayByCreditCard());
        service.processPayment(100);

        service.setStrategy(new PayByPaypal());
        service.processPayment(100);
    }
}
