package com.tutorial;

// inheritance adalah hubungan is-a

// Super, Parent, Base Class
// class Hero {
//   String name;

//   void display() {
//     System.out.println("Name: " + this.name);
//   }
// }

// Subclass, Child, Devired class
// class HeroStrength extends Hero {
// }

// class HeroIntelligent extends Hero {
// }

public class Main {
  public static void main(String[] args) {
    Hero hero1 = new Hero();
    hero1.name = "Jilong";
    hero1.display();

    HeroStrength hero2 = new HeroStrength();
    hero2.name = "Jarot";
    hero2.display();

    HeroIntelligent hero3 = new HeroIntelligent();
    hero3.name = "Alu";
    hero3.display();
  }
}
