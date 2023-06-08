package behavioralPatterns.mediator;

public abstract class Colleague {
    protected Mediator mediator;

//    public Colleague(Mediator mediator) {
//        this.mediator = mediator;
//    }

    // Vítor usa este setter para el mediador, yo creía que era
    // mejor hacerlo directamente en el constructor, pero estaba equivocado.
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void speak();
    public abstract void listen();

}
