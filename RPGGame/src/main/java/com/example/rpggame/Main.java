package com.example.rpggame;

import java.util.Scanner;

/**
 * Created by marathoner on 2021/08/08
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===============================");
        System.out.println("RPG 월드에 오신걸 환영합니다.");
        System.out.println("1. 캐릭터 만들기 \n2. 종료");
        System.out.println("===============================");
        int pageOne = scanner.nextInt();
        if (pageOne == 2)
            System.exit(0);
        System.out.println("===============================");
        System.out.println("생성할 캐릭터의 이름을 입력해 주세요.");
        System.out.println("===============================");
        String name = scanner.next();

        System.out.println("===============================");
        System.out.println("생성할 캐릭터의 직업을 선택해 주세요.");
        System.out.println("1. 검사\n2. 마법사 \n3. 궁수");
        System.out.println("===============================");
        int jobCode = scanner.nextInt();

        String job = "모함가";

        if (jobCode == 1)
            job = "검사";
        if (jobCode == 2)
            job = "마법사";
        if (jobCode == 3)
            job = "궁수";

        Character character = Character.builder()
                .name(name)
                .job(job)
                .level(1)
                .exp(0)
                .build();
        System.out.println("===============================");
        System.out.println("캐릭터가 정상적으로 생성 되었습니다.");
        System.out.println(character);
        System.out.println("===============================");

    }

}
