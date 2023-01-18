package behavioral.strategy.Example_2;

public class PlayfulBark implements BarkBehaviour{
    @Override
    public void bark() {
        System.out.println("Bark! Bark!");
    }
}
