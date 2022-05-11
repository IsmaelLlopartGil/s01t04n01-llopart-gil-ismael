package edu.n1.exercise_2;

public class DniCalculator {

	String[] appertainList = { "T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q",
			"V", "H", "L", "C", "K", "E" };
	
	public String calculateLetter(int dni) {
		int rest = dni % 23;
		return appertainList[rest];
	}
}
