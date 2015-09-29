package mx.iteso.observer;

import java.util.List;

public interface Observer {
    public void update(String home, String away, int homeGoals, int awayGoals, List<Scorer> scores);
}
