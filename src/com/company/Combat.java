package com.company;

public interface Combat {

    default void hand2hand(){
    }


    void shoot();
    void stab();
    void throwGrenade();

}
