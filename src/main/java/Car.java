
import java.util.List;
import java.util.Random;

public class Car {
    private static final int BOUND =10;
    private final String name;
    private int position = 0;
    private RaceView raceView = new RaceView();
    public Car(String name){
        this.name = name;
    }

    public void run() {
        Random random = new Random();
        position += goForward(random.nextInt(BOUND));
    }

    private int goForward(int randomNumber) {
        if(randomNumber <= 3) return 0;
        return 1;
    }

    public void printScore(){
        raceView.roundScore(this.name, this.position);
    }

    public int isMaxPosition(int position){
        if(this.position > position) return this.position;
        return position;
    }

    public List<String> isWinner(List<String> winners, int maxPosition){
        if(maxPosition == this.position) winners.add(new String(this.name));
        return winners;
    }
}
