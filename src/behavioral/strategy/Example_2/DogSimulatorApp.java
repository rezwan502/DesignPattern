package behavioral.strategy.Example_2;

public class DogSimulatorApp {
    public static void main(String[] args) {
        Dog dog = new Labrador();
        dog.doBark();
        dog.doEat();

        dog.setEatBehaviour(new ProteinDiet());
        dog.setBarkBehaviour(new MuteBark());

        dog.doBark();
        dog.doEat();
    }
}
