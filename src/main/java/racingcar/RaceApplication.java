package racingcar;

import java.util.List;

public class RaceApplication {
    public void run() {
        RaceView raceView = new RaceView();
        List<String> players = raceView.getPlayers();
        int playTimes = raceView.getPlayTimes();
        new RaceController(players, playTimes).run();
    }
}
