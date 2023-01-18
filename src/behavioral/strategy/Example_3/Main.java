package behavioral.strategy.Example_3;

public class Main {
    public static void main(String[] args) {
        Car sedan = new Sedan();
        sedan.display();
        sedan.doFill();

        Car hybrid = new Hybrid();
        hybrid.display();
        hybrid.doFill();
    }
}
