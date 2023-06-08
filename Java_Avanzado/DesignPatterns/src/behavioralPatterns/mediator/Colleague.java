package behavioralPatterns.mediator;

public abstract class Colleague {
    private Mediator mediator;

//    public Colleague(Mediator mediator) {
//        this.mediator = mediator;
//    }

    // Vítor usa este setter para el mediador, yo prefiero
    // hacerlo directamente en el constructor.
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void speak();
    public abstract void listen();

}
