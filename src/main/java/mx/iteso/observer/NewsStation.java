package mx.iteso.observer;

import mx.iteso.observer.impl.MobileAppDisplay;
import mx.iteso.observer.impl.ScoresData;
import mx.iteso.observer.impl.StoreMonitorDisplay;
import java.util.ArrayList;
import java.util.List;

public class NewsStation {
    public static void main( String[] args ){
        ScoresData scoresData;
        scoresData = new ScoresData();

        StoreMonitorDisplay storeMonitorDisplay = new StoreMonitorDisplay(scoresData);
        MobileAppDisplay mobileAppDisplay = new MobileAppDisplay(scoresData);

        List<Scorer> scoresTacitKnowledgeIntel = new ArrayList<Scorer>();
        List<Scorer> scoresChivasQueretaro = new ArrayList<Scorer>();
        List<Scorer> scoresClasico = new ArrayList<Scorer>();

        scoresTacitKnowledgeIntel.add(new Scorer("Ray","Defensa",7, "Tacit Knowledge"));
        scoresTacitKnowledgeIntel.add(new Scorer("Luis","Portero",10, "Intel"));
        scoresChivasQueretaro.add(new Scorer("Chicharito","Delantero",11, "Chivas"));
        scoresChivasQueretaro.add(new Scorer("Criss","Portero",8, "Vacas"));

        scoresData.setScore("Tacit Knowledge", "Intel", 8, 1,scoresTacitKnowledgeIntel);
        scoresData.setScore("Chivas", "Queretaro", 2, 1,scoresChivasQueretaro);
        scoresData.setScore("Vacas", "Chivas", 0, 0,scoresClasico);
    }
}