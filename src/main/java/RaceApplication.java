
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RaceApplication {
    public void run(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분");
        List<String> players = Arrays.asList((scanner.next()).split(","));
        System.out.println("시도할 회수는 몇회인가요?");
        int playTimes = scanner.nextInt();
        new RaceController(players,playTimes).run();
    }
}
