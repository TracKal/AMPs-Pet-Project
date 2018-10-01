package Korriban;

import java.io.IOException;

public class Arena {

	public static void main(String[] args) throws IOException {

		GameLogic gl = new GameLogic();

		gl.Round1();
		gl.Round2();
		gl.FinalRound();
		gl.FinalResults();
	}
}