package nevans.wordWrapper.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import nevans.wordWrapper.WordWrapper;

class WordWrapperTest {

	@Test
	void testWrapInsertsLineBreaks() {
		int maxLineLength = 10;
		String text = "abcdefghijklmnopqrstuvwxyz";
		String expected ="abcdefghij\nklmnopqrst\nuvwxyz";
		WordWrapper wordWrap = new WordWrapper();
		String newWrap = wordWrap.wrap(text, maxLineLength);
		System.out.println(newWrap);
		assertEquals(expected, newWrap);
		
	}

}
