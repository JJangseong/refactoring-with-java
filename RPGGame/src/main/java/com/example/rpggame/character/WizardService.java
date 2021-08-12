package com.example.rpggame.character;

import com.example.rpggame.character.job.Swordsman;
import com.example.rpggame.character.job.Wizard;

/**
 * Created by marathoner on 2021/08/11
 */
public class WizardService implements CharacterService<Wizard> {

    private Wizard wizard;

    @Override
    public void create(String name) {
        wizard = new Wizard(name);
    }

    @Override
    public Wizard update() {
        return null;
    }

    @Override
    public int delete() {
        return 0;
    }

    @Override
    public Wizard get() {
        System.out.println(wizard);
        return wizard;
    }
}
