package edu.n1.exercise_2;

public class DniCalculator {

	String[] appertainList = { "T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q",
			"V", "H", "L", "C", "K", "E" };
	
	public static void main(String[] args) {

		DniCalculator calculator = new DniCalculator();
		System.out.println(calculator.calculateLetter(90909090));
	}
	
	public String calculateLetter(int dni) {
		int rest = dni % 23;
		return appertainList[rest];
	}
}
