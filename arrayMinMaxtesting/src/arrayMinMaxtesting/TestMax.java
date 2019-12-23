package arrayMinMaxtesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestMax {

	@Test
	void test() {
		MinMax test = new MinMax();
		int output= test.Max(6);
		assertEquals(8,output);
	}

}
