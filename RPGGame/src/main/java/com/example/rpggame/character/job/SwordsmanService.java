package com.example.rpggame.character.job;

import com.example.rpggame.character.CharacterService;

/**
 * Created by marathoner on 2021/08/11
 */
public class SwordsmanService implements CharacterService<Swordsman> {

    private Swordsman swordsman;

    @Override
    public void create(String name) {
        swordsman = new Swordsman(name);
    }

    @Override
    public Swordsman update() {
        return null;
    }

    @Override
    public int delete() {
        return 0;
    }

    @Override
    public Swordsman get() {
        System.out.println(swordsman);
        return swordsman;
    }
}
