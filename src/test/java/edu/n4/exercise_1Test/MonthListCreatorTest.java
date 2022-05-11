package edu.n4.exercise_1Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import edu.n1.exercise_1.MonthListCreator;

class MonthListCreatorTest {

	MonthListCreator SUTMonthListCreator;
	
	@BeforeEach
	void setUp() throws Exception {
		
		SUTMonthListCreator=new MonthListCreator();
	}

	@Test
	void testGetNewMonthListSize() {
		assertEquals(12, SUTMonthListCreator.getNewMonthList().size());
	}

	@Test
	void testGetNewMonthListNotNull() {
		assertNotNull(SUTMonthListCreator.getNewMonthList()); ;
		
	}
	
	@Test
	void testGetNewMonthListContainsValue() {
		assertEquals("august", SUTMonthListCreator.getNewMonthList().get(7));
	}
	
}
