package edu.n4.exercise_3Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import edu.n1.exercise_3.ArrayIndexOutOfBoundsExceptionThrower;

class ArrayIndexOutOfBoundsExceptionThrowerTest {

	@Test
	void givenPrintIntArrayThrowingException_whenExceptionThrown_thenAssertionSucceeds() {
		ArrayIndexOutOfBoundsExceptionThrower thrower = new ArrayIndexOutOfBoundsExceptionThrower();
		assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
			thrower.printIntArrayThrowingException();
		});
	}
}
