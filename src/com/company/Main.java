package com.company;

public class Main {

    public static void main(String[] args) {
     Soldier marine = new Marine("josh","officer",99932145);
     marine.eat();
     marine.sleep();
     marine.speak();
     marine.walk();
     marine.shoot();
     marine.stab();
     marine.throwGrenade();
     marine.Bomb();
     marine.hand2hand();

     Soldier army = new Army("Peter", "Corporal", 909074357);
     army.throwGrenade();
     army.hand2hand();
     army.walk();
     army.speak();
     army.sleep();
     army.eat();
     army.Bomb();
     army.shoot();
     army.stab();
     }
}
