package behavioral.strategy.Example_3;

public abstract class Car {
    FillStrategy strategy;

    public Car(FillStrategy strategy) {
        this.strategy = strategy;
    }

    public abstract void display();

    public void doFill() {
        strategy.fill();
    }
}
