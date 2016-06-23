package tests;

import static org.junit.Assert.assertEquals;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.junit.Test;

import modes.Pitcher;

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
		Pitcher pitcher = new Pitcher();
		Integer messageSize = 30;
		assertEquals("//////////////////////////////", pitcher.buildOutputMessage(messageSize));
	}

	@Test
	public void getIPAddressByHostname() {
		Pitcher pitcher = new Pitcher();
		String hostname = "Unknown";

		try {
			InetAddress address;
			address = InetAddress.getLocalHost();
			hostname = address.getHostName();
			assertEquals(address.getHostAddress(), pitcher.getIPAddressByHostname(hostname));
		} catch (UnknownHostException ex) {
			System.out.println("Hostname can not be resolved");
		}

	}

}
