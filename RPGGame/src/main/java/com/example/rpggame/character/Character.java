package com.example.rpggame.character;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by marathoner on 2021/08/10
 */
public class Character {
    protected int id;
    protected String name;

    protected int level;
    protected int exp;
}
