package behavioralPatterns.mediator;

public abstract class Mediator {
    // Víctor mantiene el registro de los colegas en el "mediador concreto",
    // yo creo que sería mejor tenerlo en la clase abstracta.

//    private ArrayList<Colleague> colleagues = new ArrayList<>();

    public abstract void record(Colleague colleague);
    public abstract void forward(Colleague colleague);
}
