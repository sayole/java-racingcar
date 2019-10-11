package RacingCar;

import java.util.ArrayList;
import java.util.List;

public class RaceController {
    private List<Car> cars = new ArrayList<>();
    private final int playTimes;

    public RaceController(List<String> players, int playTimes){
        this.playTimes = playTimes;
        if(isBadInput(players)){
            System.out.println("입력 오류로 종료합니다.");
            System.exit(0);
        }
        initializeCars(players);
    }

    public void run(){
        System.out.println("실행결과");
        for(int i = 0 ; i < playTimes ; i++)
            racingRound();
        resultScore();
    }

    public boolean isBadInput(List<String> players){
        for(int i = 0 ; i < players.size() ; i++)
            if(players.get(i).equals("")) return true;
        if(this.playTimes <= 0) return true;
        return false;
    }

    public void initializeCars(List<String> players){
        for(int i = 0 ; i < players.size() ; i++) {
            if (players.get(i).length() >= 5)
                players.set(i, players.get(i).substring(0,5));//이름의 1~5글자만 구해 대체한다.
                //이부분이 하드 코딩에 해당되는지 궁금합니다.
            cars.add(new Car(players.get(i)));
        }
    }

    public void racingRound(){
        for(int i = 0 ; i < cars.size() ; i++) {
            cars.get(i).run();
            cars.get(i).printScore();
        }
        System.out.println();
    }

    public void resultScore(){
        List<String> winners = getWinners();
        String result = String.join(",",winners);
        System.out.println(result + " 가 최종 우승했습니다.");
    }

    public int getMaxPosition(){
        int maxPosition = 0;
        for(int i = 0 ; i < cars.size() ; i++ )
            maxPosition = cars.get(i).isMaxPosition(maxPosition);
        return maxPosition;
    }

    public List<String> getWinners(){
        List<String> winners = new ArrayList<>();
        for(int i = 0; i < cars.size() ; i++ )
            winners = cars.get(i).isWinner(winners, getMaxPosition());
        return winners;
    }
}
