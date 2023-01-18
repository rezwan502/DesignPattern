package behavioral.strategy.Example_2;

public class ProteinDiet implements EatBehaviour{
    @Override
    public void eat() {
        System.out.println("This is a protein diet");
    }
}
