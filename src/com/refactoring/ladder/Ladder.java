package com.refactoring.ladder;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Created by marathoner on 2021/05/17
 * <p>
 * - 룰 -
 * 진행 순서
 * 1. 몇개를 선택할지에 대한 수량을 입력 받는다.
 * 2. 입력받은 수량대로 사다리의 결과값을 입력한다.
 * 3. 내가 선택하고 싶은 번호를 입력한다.
 * 4. 결과가 나온다.
 * <p>
 * 위 순서중 3번을 진행하고 나서
 * 어떻게 랜덤의 숫자를 보여줄지는 각자의 생각에 맡긴다.
 * 힌트) 랜덤 함수를 활용하면 쉬워 보인다.
 * <p>
 * 결과 예시 ( 4개의 선택지를 입력했을때 )
 * 1번 => 꽝
 * 2번 => 정답
 * 3번 => 밥쏘기
 * 4번 => 밥 굶기
 */
public class Ladder {

    public void run() {

        int count = 4;
        String[] answers = {"정답", "땡", "떙", "땡"};
        HashSet<String> result = new HashSet<>();

        while (result.size() < count) {
            int randomIndex = (int) (Math.random() * (count));
            result.add((randomIndex + 1) + "번 => " + answers[randomIndex]);
        }

        Iterator<String> iterator = result.iterator();

        for (int i = 0; i < count; i++) {
            System.out.println(iterator.next());
        }


    }

}
