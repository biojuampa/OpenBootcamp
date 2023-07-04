package mediator;

import java.util.ArrayList;

public class ArraysMediator extends Mediator {
    private final ArrayList<Colleague> colleagues = new ArrayList<>();

    @Override
    public void registerColleague(Colleague colleague) {
        if (colleagues.contains(colleague))
            return;

        colleagues.add(colleague);
        colleague.setMediator(this);
    }

    @Override
    protected void sendNewWord(Colleague colleague, String word) {
        for (Colleague otherColleague: colleagues) {
            if (otherColleague.equals(colleague))
                continue;

            otherColleague.insertWord(word);
        }
    }
}
