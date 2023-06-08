package behavioralPatterns.mediator;

public class Main {
    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();

        Colleague colleague1 = new ConcreteColleague1();
        Colleague colleague2 = new ConcreteColleague2();
        Colleague colleague3 = new ConcreteColleague3();

        mediator.record(colleague1);
        mediator.record(colleague2);
        mediator.record(colleague3);

        colleague1.speak();
        System.out.println();
        colleague2.speak();
        System.out.println();
        colleague3.speak();
    }
}
