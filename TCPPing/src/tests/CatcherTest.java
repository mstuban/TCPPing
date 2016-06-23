package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import modes.Catcher;

public class CatcherTest {

	@Test
	public void testBuildResponseString() {
		Catcher catcher = new Catcher();
		Integer messageSize = 20;
		double previousSecondTimeBToA = 0.642142134;
		double timeBToA = 3.42221;

		assertEquals("0.6421423.422210////",
				catcher.buildResponseString(previousSecondTimeBToA, timeBToA, messageSize));
	}

}
