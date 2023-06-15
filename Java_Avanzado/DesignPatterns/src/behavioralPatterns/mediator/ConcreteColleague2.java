package behavioralPatterns.mediator;

public class ConcreteColleague2 extends Colleague {
    @Override
    public void speak() {
        System.out.println("Colleague2: he enviado un mensaje.");
        getMediator().forward(this);
    }

    @Override
    public void listen() {
        System.out.println("Colleague2: he recibido el mensaje.");
    }
}
