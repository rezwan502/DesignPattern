package behavioral.strategy.Example_2;

public abstract class Dog {
    BarkBehaviour barkBehaviour;
    EatBehaviour eatBehaviour;

    public void setBarkBehaviour(BarkBehaviour barkBehaviour) {
        this.barkBehaviour = barkBehaviour;
    }

    public void setEatBehaviour(EatBehaviour eatBehaviour) {
        this.eatBehaviour = eatBehaviour;
    }

    public abstract void display(); // different dog have different looks

    public void doBark() {
        barkBehaviour.bark();
    }

    public void doEat() {
        eatBehaviour.eat();
    }
}
