package main;

import java.util.ArrayList;
import java.util.List;

import org.jfugue.player.Player;

public class FlyWeightJFugue {
	
	Player player = new Player();
	
	private static List<String> notas = new ArrayList<String>();

	static {

		notas.add("C");
		notas.add("C#");
		notas.add("D");
		notas.add("E");
		notas.add("F");
		notas.add("G");
		notas.add("A");
		notas.add("B");

	}	

}
