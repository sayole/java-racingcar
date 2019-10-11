# java-racingcar

* [코드 리뷰1](https://github.com/woowacourse/woowacourse-docs/blob/master/maincourse/review-step1.md)
* [코드 리뷰2](https://github.com/woowacourse/woowacourse-docs/blob/master/maincourse/review-step2.md)

## 기능설명
1. Racing Car 어플리케이션 시작 정보
* 참여할 차의 이름을 , 로 구분지어 입력
* 실행할 Round 수 입력
2. Race 시작
* 각 이름을 가진 차들은 전진 또는 정지할 수 있다.
* 각 차들은 해당 Round에 0에서 9사이의 난수를 받아 3이하일 경우 정지, 4이상일 경우 전진한다.
* Round 종료마다 각 차들의 점수가 출력된다.
* 모든 Round 종료시 우승자 혹은 우승자들을 출력한다.

## 주의사항
* 이름이 빈칸으로 입력될시 종료된다.
* 이름은 5자 이어야 하며 이상일 때 앞의 5자로 잘린다.
* 횟수는 0이상의 정수를 입력하지 않을 시 종료된다.