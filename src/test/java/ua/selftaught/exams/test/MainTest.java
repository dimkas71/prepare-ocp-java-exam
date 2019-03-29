package ua.selftaught.exams.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	final void test() {
		int count = 0;
		int x = 3;
		
		while (count++ < 3) {
			int y = (1 + 2 * count) % 3;
			switch (y) {
				default:
				case 0: x -= 1; break;
				case 1: x += 5;
			}
		}
		
		Assertions.assertEquals(6, x, () -> "x should be equals to 6");
	}

}
