package behavioral.strategy.Example_2;

public class MuteBark implements BarkBehaviour{
    @Override
    public void bark() {
        System.out.println("This is a mute bark");
    }
}
