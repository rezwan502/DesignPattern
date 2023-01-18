package behavioral.strategy.Example_3;

public class Sedan extends Car{

    public Sedan(){
        super(new StandardFill());
    }
    @Override
    public void display() {
        System.out.println("This is a sedan car");
    }
}
