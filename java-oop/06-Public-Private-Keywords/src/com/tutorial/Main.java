package com.tutorial;

class Player{
  String name; // default, bisa dibaca dan ditulis di luar class
  public int exp; // public, sama dengan default di luar class
  private int health; // private, hanya akan bisa dibaca dan ditulis di dalam class

  Player(String name, int exp, int health){
    this.name = name;
    this.exp = exp;
    this.health = health;
  }
  
  // default modifier access
  void display(){
    addExp(); // contoh mengakses private methods
    System.out.println("\nName\t: " + name);
    System.out.println("Exp\t: " + exp);
    System.out.println("Health\t: " + health);
  }

  // public
  public void setName(String newName) {
    this.name = newName;
  }

  // private
  private void addExp(){
    this.exp += 100;
  }
}

public class Main {
  public static void main(String[] args) {
    Player player1 = new Player("Hannn", 0, 100);

    // default
    System.out.println(player1.name); // membaca data (Read)
    player1.name = "Wanggg"; // menulis data (Write)
    System.out.println(player1.name); // membaca data (Read)

    // public
    System.out.println(player1.exp); // membaca data (Read)
    player1.exp = 100; // menulis data (Write)
    System.out.println(player1.exp); // membaca data (Read)

    // private (tidak bisa diakses)
    // System.out.println(player1.health); // membaca data (Read)
    // player1.health = 75; // menulis data (Write)
    // System.out.println(player1.health); // membaca data (Read)

    // method

    // default
    player1.display();
    // public 
    player1.setName("Lahhh");
    player1.display();
    // private (tidak bisa diakses)
    // player1.addExp();
  }
}
