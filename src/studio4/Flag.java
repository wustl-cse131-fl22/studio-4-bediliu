package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.filledSquare(0, 0, 1);
		StdDraw.setPenColor(Color.RED);
		StdDraw.filledCircle(0.5,0.5,0.2);
		
	}
}