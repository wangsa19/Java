package com.tutorial;

// keyword import untuk package eksternal
import com.terminal.Console;

public class Main {
  public static void main(String[] args) {
    Player player1 = new Player("Wanggg");
    Player player2 = new Player("Hannn");
    Player player3 = new Player("Lummm");
    player1.show();
    player2.show();
    player3.show();

    Console.log("Halo");
  }
}
