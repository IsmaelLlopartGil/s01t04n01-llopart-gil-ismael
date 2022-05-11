package edu.n4.exercise_2Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import edu.n1.exercise_2.DniCalculator;

class DniCalculatorTest {

	@ParameterizedTest
	@CsvSource({"0,T", "99999999,R", "90005635,B", "564890,X", "46935587,Q", "76802315,W", "97354878,H", "32158967,E", "26644848,S", "980,Z"})
	void testParameterizedCalculateLetter(int dni, String letter) {
		DniCalculator calculator=new DniCalculator();
		assertEquals(letter, calculator.calculateLetter(dni));
	}

}
