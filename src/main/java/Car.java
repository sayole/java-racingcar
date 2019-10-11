package RacingCar;

import java.util.List;
import java.util.Random;

public class Car {
    private static final int bound =10;
    private final String name;
    private int position = 0;

    public Car(String name){
        this.name = name;
    }

    public void run(){
        Random random = new Random();
        position += goForward(random.nextInt(bound));
    }

    private int goForward(int randomNumber){
        if(randomNumber <= 3) return 0;
        return 1;
    }

    public void printScore(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.name+" : ");
        for(int i = 0 ; i < position ; i++)
            stringBuilder.append("-");
        System.out.println(stringBuilder);
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
