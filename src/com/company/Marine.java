package com.company;

public class Marine extends Soldier {

    public Marine(String name, String rank, int serialNumber) {
      super(name, rank, serialNumber);
    }

    public void speak(){
        System.out.println("OORAAH");
    }

    }

