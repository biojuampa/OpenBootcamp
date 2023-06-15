package behavioralPatterns.mediator;

import java.util.ArrayList;

public class ConcreteMediator extends Mediator {
    private final ArrayList<Colleague> colleagues = new ArrayList<>();

    @Override
    public void record(Colleague colleague) {
        boolean newColleague = !colleagues.contains(colleague);
        if (newColleague) {
            colleagues.add(colleague);
            colleague.setMediator(this);
        }
//        if (colleagues.contains(colleague)) return;
//        colleagues.add(colleague);
//        colleague.setMediator(this);
    }

    @Override
    public void forward(Colleague speaker) {
        for (Colleague colleague: colleagues) {
            boolean otherColleague = !colleague.equals(speaker);
            if (otherColleague) {
                colleague.listen();
            }
//            if (colleague.equals(speaker)) return;
//            colleague.listen();
        }
    }
}
