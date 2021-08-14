package com.example.rpggame.character.job;

import com.example.rpggame.character.Character;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Created by marathoner on 2021/08/11
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class Archer extends Character {
    private String job;

    public Archer() {
        setJob("궁수");
    }

    public Archer(String name) {
        this.id = 1;
        this.name = name;
        this.exp  = 0;
        this.level = 1;
        this.job = "궁수";
    }

    @Override
    public String toString() {
        return "Archer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", level=" + level +
                ", exp=" + exp +
                ", job='" + job + '\'' +
                '}';
    }
}
