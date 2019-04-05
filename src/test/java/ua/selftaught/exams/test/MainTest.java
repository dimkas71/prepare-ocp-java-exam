package ua.selftaught.exams.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	@DisplayName("OCA page 34. 4. What is the output of the following program?")
	void testOCApage34_4() {
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
	
	@Test
	@DisplayName("OCA page 35. 6. What is the result of following program?")
	void testOCApage35_6() {
		
		class MainFunctions {
			private void addToInt(int x, int amountToAdd) {
				x = x + amountToAdd;
			}
		}
		
		int a = 15;
		int b = 10;
		
		new MainFunctions().addToInt(a, b);
		
		assertEquals(15, a);
		
	}
	
	
	@Test
	@DisplayName("OCA page 35. 7. What is the result of the following code?")
	void testOCApage35_7() {
		int[] array = {6, 9, 8};
		
		List<Integer> list = new ArrayList<>();
		
		list.add(array[0]);
		list.add(array[2]);
		list.set(1, array[1]);
		
		list.remove(0);
		
		assertEquals("[9]", list.toString(), () -> "should be [9]");
		
		
	}
	
	@Test
	void test() {
		class Deer {
			public Deer() {name = "Deer";}
			public Deer(int age) { name = "DeepAge";}
			private boolean hasHorns() {return false;}
			
			private String name;
			
		}
		
		class Reinder extends Deer {
			public Reinder(int age) {super.name = super.name + "Reindeer";}
			public boolean hasHorns() { return true;}
		}
		
		Deer deer = new Reinder(5);
		//System.out.println("," + deer.hasHorns());
		
		assertEquals("DeerReindeer,false", deer.name + "," + deer.hasHorns());
		
	}
	
	@Test
	@DisplayName("The test of using string's concat method")
	void testStringMethods() {
		String s = "Hello ";
		assertEquals("Hello World", s.concat("World"), () -> "Hello World should be printed");
	}
	
	@Test
	@DisplayName("OCA page 155. 7. What is the result of the following code?(Choose all that apply)")
	void testOCAPage155_7() {
		String letters = "abcdef";
		
		assertEquals(6, letters.length(), () -> "The length of string 'abcdef' should be equal to 6");
		
		assertEquals('d', letters.charAt(3), () -> "'d' is the char at the position 3 of 'abcdef' string");
		
		StringIndexOutOfBoundsException e = assertThrows(StringIndexOutOfBoundsException.class, () -> {
			letters.charAt(6);
		});
		
		assertEquals("String index out of range: 6", e.getMessage());
				
	}
	
	@Test
	@DisplayName("OCA page 157. 14. Which of the following can replace line 4 to print 'avaJ'? (Choose all that apply)")
	void testOCAPage157_14() {
		//arrange 
		StringBuilder sb = new StringBuilder("Java");
		//act
		sb.reverse();
		//assert		
		assertEquals("avaJ", sb.toString(), () ->  "Should be equas to 'avaJ'");
		
		sb = new StringBuilder("Java");
		
		sb.append("vaJ$").substring(0, 4);
		
		assertNotEquals("avaJ", sb.toString(), () -> "Should not  be equal to 'avaJ'");
		
		sb = new StringBuilder("Java");
		
		sb.append("vaJ$").delete(0, 3).deleteCharAt(sb.length() - 1);
		
		assertEquals("avaJ", sb.toString(), () -> "Should be equal to 'avaJ'");		
		
		//and the last one
		
		//arrange
		final StringBuilder sb1 = new StringBuilder();
		//act
		StringIndexOutOfBoundsException e = assertThrows(StringIndexOutOfBoundsException.class, () -> sb1.append("vaJ$").delete(0, 3).deleteCharAt(sb1.length()));
		
		//assert
		assertEquals("String index out of range: 1", e.getMessage(), () -> "Should be equal to 'String index out of range: 1'");
	}
	
	@Test
	@DisplayName("OCA page 158, question 19. Which of the following are true? (Choose all that reply)")
	void testOCAPage158_19() {
		//arrange
		int[] one = {1, 3, 4};
		int[] two = {1, 3, 4};
		
		//act, assert
		assertNotEquals(one, two, () -> "Should be the same");
		
		
		//arrange
		List<Integer> listOne = new ArrayList<>();
		listOne.add(1);
		listOne.add(3);
		listOne.add(4);
		
		List<Integer> listTwo = new ArrayList<>();
		listTwo.add(1);
		listTwo.add(3);
		listTwo.add(4);
		
		//act, assert
		assertEquals(listOne, listTwo, () -> "Should be equal");
		assertNotSame(listOne, listTwo);
		
		//arrange
		ArrayList list = new ArrayList();
		
		//act
		IndexOutOfBoundsException e = assertThrows(IndexOutOfBoundsException.class, () -> list.remove(0));
		
		//assert
		assertEquals("Index: 0, Size: 0", e.getMessage(), () -> "Should be equal to ' Index: 0, Size: 0'");
		
		
		
		
	}
	

}
