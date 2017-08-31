package com.company;

public abstract class Soldier implements Combat, Bomb{
    String name;
    String rank;
    int serialNumber;

    public Soldier(String name, String rank, int serialNumber) {
        System.out.println(name);
        System.out.println(rank);
        System.out.println(serialNumber);
    }

    public void sleep(){
       System.out.println("Zzzzzz");
   }
   public void eat(){
       System.out.println("chomp chomp");
   }
   public void walk(){
       System.out.println("thud thud thud thud");
   }
 @Override
   public void hand2hand(){
       System.out.println("Hiya, pow");
   }

   public void shoot(){
       System.out.println("pew pew");
   }
    public void stab(){
        System.out.println("That's a lot of blood");
    }
    public void throwGrenade(){
        System.out.println("Is that his arm or his leg?");
    }

    public String Bomb(){
        System.out.println("boom .... a bit anticlimactic");
        return "bang";
    }
   public abstract void speak();

}
