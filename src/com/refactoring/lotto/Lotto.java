package com.refactoring.lotto;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/**
 * 로또 당첨 규칙
 * 숫자는 1 ~ 45까지의 숫자
 * 꽝 -> 로또 번호 2개 이하 당첨
 * 5등 -> 로또 번호 3개 당첨
 * 4등 -> 로또 번호 4개 당첨
 * 3등 -> 로또 번호 5개 당첨
 * 2등 -> 로또 번호 5개 + 보너스 번호 당첨
 * 1등 -> 로또 번호 6개 당첨
 * <p>
 * Lotto 클래스의 구현은 로또번호를 파라미터로 받아서 처리한다.
 * <p>
 * 사용자가 입력하는 상황 예시
 * - 7번을 반복하며 숫자를 입력 받는다.
 * - 마지막 번호가 보너스 번호이다.
 * - 파라미터의 타입은 int[] 들어 온다.
 * <p>
 * 결과 과정 예시
 * - 중복을 허용하지 않는 7개의 랜덤의 숫자를 세팅한다.
 * - 랜덤으로 생성된 숫자 7개와 입력받은 숫자 7개를 비교하여 등수를 정한다.
 * - 계산이 끝나면 System.out.println 으로 등수를 표현한다.
 */
public class Lotto {
    private final int MIN = 1;
    private final int MAX = 45;

    private final HashSet<Integer> pcNumbers;
    private final int[] userNumbers;

    public Lotto(int[] userNumbers) {
        this.pcNumbers = createPcNumbers();
        this.userNumbers = userNumbers;
    }

    public void start() {
        String result = raffle(checkLottoNumber());
        print(result);
    }

    private int getLastPcNumber() {
        Iterator<Integer> iterator = pcNumbers.iterator();
        int result = 0;
        while (iterator.hasNext()) {
            result = iterator.next();
        }
        return result;
    }

    private int checkLottoNumber() {
        Iterator<Integer> interator = pcNumbers.iterator();
        int result = 0;
        for (int i = 0; i < pcNumbers.size(); i++) {
            int pcNum = (int) interator.next();
            result += Arrays.stream(userNumbers)
                    .filter(num -> pcNum == num)
                    .count();
        }
        return result;
    }

    private HashSet<Integer> createPcNumbers() {
        HashSet<Integer> pcNumbers = new HashSet<>();
        while (pcNumbers.size() < 7) {
            int pcNumber = (int) (Math.random() * (MAX - MIN) + MIN);
            pcNumbers.add(pcNumber);
        }
        return pcNumbers;
    }

    private boolean isConfirmResultByBonus(int lastNum, int number) {
        return lastNum == number;
    }

    private String raffle(int count) {
        boolean isBonus = isConfirmResultByBonus(getLastPcNumber(), userNumbers[userNumbers.length - 1]);
        if(count == 3) {
            return "5등";
        } else if (count == 4) {
            return "4등";
        } else if(count == 5 && !isBonus) {
            return "3등";
        } else if(count == 5) {
            return "2등";
        } else if(count == 6) {
            return "1등";
        }
        return "꽝";
    }

    private void print(String result) {
        System.out.println(result+"!!!!!!!!");
        System.out.println("사용자 :: " + Arrays.toString(userNumbers));
        System.out.println("PC :: " + pcNumbers);
    }

}
