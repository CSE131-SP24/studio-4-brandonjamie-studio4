package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.clear();
		StdDraw.setXscale(-9, 35);
		StdDraw.setYscale(-9, 35);
		StdDraw.setPenRadius(0.03);
		
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.filledRectangle(13, 13, 10.1, 6.1);
		
		StdDraw.setPenColor(StdDraw.WHITE);
		StdDraw.filledRectangle(13, 13, 10, 6);
		
		StdDraw.setPenColor(StdDraw.RED);
		StdDraw.line(5, 16, 5, 10);
		StdDraw.line(5, 16, 8, 16);
		StdDraw.line(5, 13, 8, 13);
		StdDraw.line(5, 10, 8, 10);
		
		StdDraw.line(10, 16, 13, 10);
		StdDraw.line(13, 16, 10, 10);		

		StdDraw.line(15, 16, 15, 10);
		
		StdDraw.line(17, 16, 21, 16);
		StdDraw.line(19, 16, 19, 10);
		
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.filledCircle(27, 13, 4);
		StdDraw.filledCircle(-1, 13, 4);
		
		StdDraw.setPenColor(StdDraw.WHITE);
		StdDraw.filledCircle(27, 13, 3.7);
		StdDraw.filledCircle(-1, 13, 3.7);
		
		StdDraw.show();
		
		
	}
}
