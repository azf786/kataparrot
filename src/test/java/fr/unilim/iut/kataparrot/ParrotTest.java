package fr.unilim.iut.kataparrot;

import static org.junit.Assert.*;
import org.junit.Test;

public class ParrotTest {

	@Test
	public void getSpeedOfEuropeanParrot() {
		Parrot parrot = new EuropeanParrot();
		assertEquals(12.0, parrot.getSpeed(), 0.0);
	}

	@Test
	public void getSpeedOfAfricanParrot_With_One_Coconut() {
		Parrot parrot = new AfricanParrot(1);
		assertEquals(3.0, parrot.getSpeed(), 0.0);
	}

	@Test
	public void getSpeedOfAfricanParrot_With_Two_Coconuts() {
		Parrot parrot = new AfricanParrot(2);
		assertEquals(0.0, parrot.getSpeed(), 0.0);
	}

	@Test
	public void getSpeedOfAfricanParrot_With_No_Coconuts() {
		Parrot parrot = new AfricanParrot(0);
		assertEquals(12.0, parrot.getSpeed(), 0.0);
	}

	@Test
	public void getSpeedNorwegianBlueParrot_nailed() {
		Parrot parrot = new BlueParrot();
		assertEquals(0.0, parrot.getSpeed(), 0.0);
	}

	@Test
	public void getSpeedNorwegianBlueParrot_not_nailed() {
		Parrot parrot = new NorvegeanParrot(1.5);
		assertEquals(18.0, parrot.getSpeed(), 0.0);
	}

	@Test
	public void getSpeedNorwegianBlueParrot_not_nailed_high_voltage() {
		Parrot parrot = new NorvegeanParrot(4);
		assertEquals(24.0, parrot.getSpeed(), 0.0);
	}
}
