package arrayMinMaxtesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestMin {

	@Test
	void test() {
		MinMax test = new MinMax();
		int output= test.Min(6);
		assertEquals(2,output);
	}

}
