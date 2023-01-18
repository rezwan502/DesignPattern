package behavioral.strategy.Example_2;

public class Labrador extends Dog{
    public Labrador() {
        this.barkBehaviour = new PlayfulBark();
        this.eatBehaviour = new NormalDiet();
    }

    @Override
    public void display() {
        System.out.println("I'm a playful Labrador");
    }
}
