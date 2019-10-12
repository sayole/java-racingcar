import java.util.ArrayList;
import java.util.List;

public class RaceView {
    public RaceView(){
    }
    public void powerOff(){
        System.out.println("입력 오류로 종료합니다.");
        System.exit(0);
    }

    public void raceResult(){
        System.out.println("실행결과");
    }

    public void viewWinners(String result){
        System.out.println(result + " 가 최종 우승했습니다.");
    }

    public void roundScore(String name, int position){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(name+" : ");
        for(int i = 0 ; i < position ; i++)
            stringBuilder.append("-");
        System.out.println(stringBuilder);
    }
}
