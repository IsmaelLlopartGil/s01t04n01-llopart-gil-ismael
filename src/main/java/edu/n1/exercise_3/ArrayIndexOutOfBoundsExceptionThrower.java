package edu.n1.exercise_3;

public class ArrayIndexOutOfBoundsExceptionThrower {

	public void printIntArrayThrowingException () throws ArrayIndexOutOfBoundsException {
		int[] intArray = { 0, 1, 2 };

		for (int i = 0; i < 4; i++) {
			System.out.println(intArray[i]);
		}
	}
}
