package com.refactoring.lotto;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 로또 당첨 규칙
 * 숫자는 1 ~ 45까지의 숫자
 * 꽝 -> 로또 번호 2개 이하 당첨
 * 5등 -> 로또 번호 3개 당첨
 * 4등 -> 로또 번호 4개 당첨
 * 3등 -> 로또 번호 5개 당첨
 * 2등 -> 로또 번호 5개 + 보너스 번호 당첨
 * 1등 -> 로또 번호 6개 당첨
 *
 * Lotto 클래스의 구현은 로또번호를 파라미터로 받아서 처리한다.
 *
 * 사용자가 입력하는 상황 예시
 * - 7번을 반복하며 숫자를 입력 받는다.
 * - 마지막 번호가 보너스 번호이다.
 * - 파라미터의 타입은 int[] 들어 온다.
 *
 * 결과 과정 예시
 * - 중복을 허용하지 않는 7개의 랜덤의 숫자를 세팅한다.
 * - 랜덤으로 생성된 숫자 7개와 입력받은 숫자 7개를 비교하여 등수를 정한다.
 * - 계산이 끝나면 System.out.println 으로 등수를 표현한다.
 */
public class Lotto {
    private static final int MIN = 1;
    private static final int MAX = 45;

    public static void sortition(int[] userNumbers) {
        HashSet<Integer> pcNumbers = new HashSet<>();
        int count = 0;
        int lastNum = 0;
        boolean isBonus = false;

        while (pcNumbers.size() < 7) {
            int pcNumber = (int) (Math.random() * (MAX - MIN) + MIN);
            pcNumbers.add(pcNumber);
        }
        Iterator interator = pcNumbers.iterator();
        for (int i = 0; i < pcNumbers.size(); i++) {
            int pcNum = (int) interator.next();
            lastNum = pcNum;
            for (int j = 0; j < userNumbers.length; j++) {
                if (pcNum == userNumbers[j]) {
                    ++count;
                }
            }
        }

        if (lastNum == userNumbers[userNumbers.length - 1]) {
            isBonus = true;
        }

        switch (count) {
            case 0:
            case 1:
            case 2:
                System.out.println("꽝");
                break;
            case 3:
                System.out.println("5등!!!!!!!!!");
                break;
            case 4:
                System.out.println("4등!!!!!!!!!");
                break;
            case 5:
                if(isBonus) System.out.println("2등!!!!!!!!!!");
                else System.out.println("3등!!!!!!!!!!!");
                break;
            case 6:
                System.out.println("1등!!!!!!!!!!!!!!");
                break;

        }

        System.out.println("사용자 :: " + Arrays.toString(userNumbers));
        System.out.println("PC :: " + pcNumbers);


    }

}
