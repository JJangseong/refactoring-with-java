package com.example.rpggame;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by marathoner on 2021/08/10
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Character {
    private String name;
    private String job;

    private int level;
    private int exp;

    @Override
    public String toString() {
        return "이름 : '" + name + '\'' + "\n" +
                "직업 : '" + job + '\'' + "\n" +
                "레벨 : " + level + "\n" +
                "경험치 : " + exp;
    }
}
