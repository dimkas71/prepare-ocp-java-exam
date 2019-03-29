package ua.selftaught.exams.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	@DisplayName("OCA page 34. 4. What is the output of the following program?")
	void test() {
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
	
	@Test
	@DisplayName("OCA page 35. 5. What is the output of the following code snippet?")
	void testOCApage35_5() {
		StringBuilder sb = new StringBuilder();
		sb.append("a");
		
		try {
			sb.append("b");
			throw new IllegalArgumentException();
			
		} catch (RuntimeException e) {
			sb.append("c");
		} finally {
			sb.append("d");
		}
		sb.append("e");
		
		
		assertEquals("abcde", sb.toString(), () -> "Result should be abcde");
		
		
	}

}
