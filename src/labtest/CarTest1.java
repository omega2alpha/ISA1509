package labtest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CarTest1 {
	
	Car C1;
	int c;
	

	@Before
	public void setUp() throws Exception {
		C1 = new Car(5674,15);
	}

	@Test
	public void test() {
		c=C1.getEngineCapacity();
		assertEquals(15,c);
	}

}
