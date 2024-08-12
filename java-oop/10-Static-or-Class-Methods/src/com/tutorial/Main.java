package com.tutorial;

import java.util.ArrayList;

class Player {

  private static int numberOfPlayer;
  private static ArrayList<String> nameList = new ArrayList<String>();

  private String name;

  Player(String name) {
    this.name = name;
    Player.numberOfPlayer++;
    Player.nameList.add(this.name);
  }

  void show() {
    System.out.println("Player name: " + this.name);
  }

  // static methods
  static void showNumberOfPlayer() {
    System.out.println("Number of Player: " + Player.numberOfPlayer);
  }

  static ArrayList<String> getNames() {
    return Player.nameList;
  }
}

public class Main {
  public static void main(String[] args) {
    Player player1 = new Player("Jilong");
    Player player2 = new Player("Jarot");
    Player player3 = new Player("Sober");
    Player player4 = new Player("Alu");

    Player.showNumberOfPlayer();
    System.out.println("Names : " + Player.getNames());

  }
}
