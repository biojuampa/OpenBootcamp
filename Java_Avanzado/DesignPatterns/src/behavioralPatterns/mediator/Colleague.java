package behavioralPatterns.mediator;

public abstract class Colleague {
    private Mediator mediator;

//    public Colleague(Mediator mediator) {
//        this.mediator = mediator;
//    }

    // Vítor usa este setter para el mediador, yo creía que era
    // mejor hacerlo directamente en el constructor, pero estaba equivocado.
    // Si bien Víctor crea el setter, nunca lo usa, accede directamente
    // a la variable mediator, rompiendo así la encapsulación.
    // Yo voy a implementar el getter y el setter para acceder.
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
    public Mediator getMediator() {
        return mediator;
    }

    public abstract void speak();
    public abstract void listen();

}
