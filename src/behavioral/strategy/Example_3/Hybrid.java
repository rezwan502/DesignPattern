package behavioral.strategy.Example_3;

public class Hybrid extends Car{
    public Hybrid() {
        super(new HybridFill());
    }

    @Override
    public void display() {
        System.out.println("This is a Hybrid Car");
    }
}
