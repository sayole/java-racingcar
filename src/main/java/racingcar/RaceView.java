package racingcar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RaceView {
    Scanner scanner = new Scanner(System.in);

    public List<String> getPlayers() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분");
        List<String> players = Arrays.asList((scanner.nextLine()).split(","));
        return players;
    }

    public int getPlayTimes() {
        System.out.println("시도할 회수는 몇회인가요?");
        return scanner.nextInt();
    }

    public void powerOff() {
        System.out.println("입력 오류로 종료합니다.");
        System.exit(0);
    }

    public void raceResult() {
        System.out.println("실행결과");
    }

    public void viewWinners(String result) {
        System.out.println(result + " 가 최종 우승했습니다.");
    }

    public void roundScore(String name, int position) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(name + " : ");
        for (int i = 0; i < position; i++)
            stringBuilder.append("-");
        System.out.println(stringBuilder);
    }
}
