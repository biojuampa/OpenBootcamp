package behavioralPatterns.mediator;

public class ConcreteColleague3 extends Colleague {
    @Override
    public void speak() {
        System.out.println("Colleague3: he enviado un mensaje.");
        getMediator().forward(this);
    }

    @Override
    public void listen() {
        System.out.println("Colleague3: he recibido el mensaje.");
    }
}
