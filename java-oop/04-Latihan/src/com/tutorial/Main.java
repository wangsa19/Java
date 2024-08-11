package com.tutorial;

// player
class Player{
  String name;
  double health;
  int level;
  // object 
  Weapon weapon;
  Armor armor;

  Player(String name, double health){
    this.name = name;
    this.health = health;
  }

  void attack(Player opponent){
    double attackPower = this.weapon.attackPower;
    System.out.println(this.name + " attacking " + opponent.name + " with power " + attackPower);

    opponent.defence(attackPower);
  }

  void defence(double attackPower){
    double damage;
    if (this.armor.defencePower < attackPower){ 
      damage = attackPower - this.armor.defencePower;
    } else {
      damage = 0;
    }
    this.health -= damage;
    System.out.println(this.name + " gets damage " + damage);
  }
  
  void equipWeapon(Weapon weapon){
    this.weapon = weapon;
  }

  void equipArmor(Armor armor){
    this.armor = armor;
  }

  void display(){
    System.out.println("\nName : " + this.name);
    System.out.println("Health : " + this.health + "hp");
    this.weapon.display(this.weapon.name, this.weapon.attackPower);
    this.armor.display(this.weapon.name, this.weapon.attackPower);
  }

}
// senjata
class Weapon{
  double attackPower;
  String name;

  Weapon(String name,double attackPower){
    this.name = name;
    this.attackPower = attackPower;
  }

  void display(String name, double attackPower){
    System.out.println("Weapon : " + this.name + " ,attack : " + attackPower);
  }
}
// armor
class Armor{
  double defencePower;
  String name;

  Armor(String name,double defencePower){
    this.name = name;
    this.defencePower = defencePower;
  }

  void display(String name, double attackPower){
    System.out.println("Armor : " + this.name + " ,defence : " + attackPower);
  }

}
public class Main {

  public static void main(String[] args) {

    // membuat object player
    Player player1 = new Player("Alu", 100);
    Player player2 = new Player("yin", 50);

    // membuat object weapon
    Weapon pedang = new Weapon("bod",15);
    Weapon tinju = new Weapon("bogem",10);

    // membuat object armor 
    Armor armor = new Armor("domi",10);
    Armor armorT = new Armor("Transparant",1);

    // equip senjata dan armor
    player1.equipWeapon(pedang);
    player1.equipArmor(armor);
    player1.display();
    player2.equipWeapon(tinju);
    player2.equipArmor(armorT);
    player2.display();
    
    System.out.println("\nPERTEMPURAN");
    System.out.println("\nEpisode - 1\n");
    player1.attack(player2);
    player1.display();
    player2.display();
    System.out.println("\nEpisode - 1\n");
    player2.attack(player1);
    player1.display();
    player2.display();
  }
}