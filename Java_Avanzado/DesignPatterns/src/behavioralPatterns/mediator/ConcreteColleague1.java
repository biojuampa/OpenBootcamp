package behavioralPatterns.mediator;

public class ConcreteColleague1 extends Colleague {
    @Override
    public void speak() {
        System.out.println("Colleague1: he enviado un mensaje.");
        getMediator().forward(this);
    }

    @Override
    public void listen() {
        System.out.println("Colleague1: he recibido el mensaje.");
    }
}
