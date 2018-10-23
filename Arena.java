package Korriban;

import java.io.IOException;

public class Arena {

  public static void main(String[] args) throws IOException {

    GameLogic gl = new GameLogic();

    gl.Intro();
    gl.fight();

  }
}
