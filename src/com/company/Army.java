package com.company;

public class Army extends Soldier {

    public Army(String name, String rank, int serialNumber) {
        super(name, rank, serialNumber);
    }

    public void speak(){
        System.out.println("Is this thing loaded?");
    }

}

