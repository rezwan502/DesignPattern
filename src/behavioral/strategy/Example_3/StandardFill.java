package behavioral.strategy.Example_3;

public class StandardFill implements FillStrategy{
    @Override
    public void fill() {
        System.out.println("Just refuel with gas");
    }
}
