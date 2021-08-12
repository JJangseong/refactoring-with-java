package com.example.rpggame.character;

import com.example.rpggame.character.job.Archer;
import com.example.rpggame.character.job.Wizard;

/**
 * Created by marathoner on 2021/08/11
 */
public class ArcherService implements CharacterService<Archer> {

    private Archer archer;

    @Override
    public void create(String name) {
        archer = new Archer(name);
    }

    @Override
    public Archer update() {
        return null;
    }

    @Override
    public int delete() {
        return 0;
    }

    @Override
    public Archer get() {
        System.out.println(archer);
        return archer;
    }
}
