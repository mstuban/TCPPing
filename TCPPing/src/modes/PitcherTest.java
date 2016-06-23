package modes;

import static org.junit.Assert.*;

import org.junit.Test;

public class PitcherTest {
	
	@Test
	public void testReturnDigits() {
		Pitcher pitcher = new Pitcher();
		assertEquals("0.1234560.241242435", pitcher.returnDigits("0.1234560.241242435////////"));
		assertEquals("1524.1234560.2412424353432", pitcher.returnDigits("1524.1234560.241242435/////3432///"));
	}

	@Test
	public void testFormatDecimalValue() {
		Pitcher pitcher = new Pitcher();
		assertEquals("432.443242", pitcher.formatDecimalValue(432.443242342));
		assertEquals("20.443643", pitcher.formatDecimalValue(20.443642642));
	}

	@Test
	public void testBuildOutputMessage() {
		fail("Not yet implemented");
	}

}
