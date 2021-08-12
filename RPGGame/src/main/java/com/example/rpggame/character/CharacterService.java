package com.example.rpggame.character;

/**
 * Created by marathoner on 2021/08/11
 */
public interface CharacterService<T> {
    void create(String name);
    T update();
    int delete();
    T get();
}
