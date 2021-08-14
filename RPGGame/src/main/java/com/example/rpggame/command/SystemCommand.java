package com.example.rpggame.command;

import java.util.Scanner;

/**
 * Created by marathoner on 2021/08/11
 */
public class SystemCommand {
    static Scanner scanner = new Scanner(System.in);

    public static void welcome() {
        if (getWelcomeMessage() != 1)
            System.exit(0);
        CharacterCommand.setCharacter();
    }

    private static int getWelcomeMessage() {
        System.out.println("===============================");
        System.out.println("RPG 월드에 오신걸 환영합니다.");
        System.out.println("1. 캐릭터 만들기 \n2. 종료");
        System.out.println("===============================");
        return scanner.nextInt();
    }
}
