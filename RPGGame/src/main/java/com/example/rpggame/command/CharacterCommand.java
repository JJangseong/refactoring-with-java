package com.example.rpggame.command;

import com.example.rpggame.character.job.ArcherService;
import com.example.rpggame.character.CharacterService;
import com.example.rpggame.character.job.SwordsmanService;
import com.example.rpggame.character.job.WizardService;

import java.util.Scanner;

/**
 * Created by marathoner on 2021/08/11
 */
public class CharacterCommand {

    private static Scanner scanner = new Scanner(System.in);
    private static CharacterService characterService;

    public static void setCharacter() {
        setJob();
        String name = getName();
        characterService.create(name);
        createComplete();
    }

    private static String getName() {
        System.out.println("===============================");
        System.out.println("생성할 캐릭터의 이름을 입력해 주세요.");
        System.out.println("===============================");
        return scanner.next();
    }

    private static void setJob() {
        System.out.println("===============================");
        System.out.println("생성할 캐릭터의 직업을 선택해 주세요.");
        System.out.println("1. 검사\n2. 마법사 \n3. 궁수");
        System.out.println("===============================");
        int jobCode = scanner.nextInt();

        if (jobCode == 1)
            characterService = new SwordsmanService();
        if (jobCode == 2)
            characterService = new WizardService();
        if (jobCode == 3)
            characterService = new ArcherService();
    }

    private static void createComplete() {
        System.out.println("===============================");
        System.out.println("캐릭터가 정상적으로 생성 되었습니다.");
        System.out.println(characterService.get());
        System.out.println("===============================");
    }
}
