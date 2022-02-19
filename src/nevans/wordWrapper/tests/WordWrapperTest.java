package nevans.wordWrapper.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import nevans.wordWrapper.WordWrapper;

class WordWrapperTest {

	@Test
	void testWrapInsertsLineBreaks() {
		int maxLineLength = 10;
		String text = "abcdefghijklmnopqrstuvwxyz";
		String expected ="abcdefghij%nklmnopsqrs%nuvwxyz";
		WordWrapper wordWrap = new WordWrapper();
		String newWrap = wordWrap.wrap(text, maxLineLength);
		assertEquals(expected, newWrap);
		
	}

}
