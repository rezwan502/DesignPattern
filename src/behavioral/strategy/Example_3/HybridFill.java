package behavioral.strategy.Example_3;

public class HybridFill implements FillStrategy{
    @Override
    public void fill() {
        System.out.println("Refuel with gas or electricity");
    }
}
