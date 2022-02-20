package nevans.wordWrapper.tests;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

import nevans.wordWrapper.WordWrapper;

class WordWrapperTest {
	WordWrapper wordWrap = new WordWrapper();
	

	@Test
	void testWrapInsertsLineBreaksOnWordBreaks() {
		//Given maxLineLength and a sample text
		int maxLineLength = 10;
		String text = "The quick brown fox jumps over the lazy dog.";
		//When parsed through the wrap function
		String newWrap = WordWrapper.wrap(text, maxLineLength);
		//Then: Outputs a new text with desired maxLineLenths AND breaks on work Breaks
		
		System.out.println(newWrap);
		String expected ="The quick\nbrown fox\njumps over\nthe lazy\ndog.";
		assertEquals(expected,newWrap);
	}
	
	@Test
	void testIfNoTextIsProvided() {
		//Given maxLineLength and an null text
		int maxLineLength = 12;
		String text = null;
		//When parsed through the wrap function
		String newWrap = WordWrapper.wrap(text, maxLineLength);
		//Then: Outputs a new text with desired maxLineLenths AND breaks on work Breaks
		System.out.println(newWrap);
		String expected ="";
		assertEquals(expected,newWrap);
	}
	
	@Test
	void testIfTextIsShorterThanMaxLineLength(){
		//Given maxLineLength and short text;
		int maxLineLength = 12;
		String text = "Hi mom!";
		//When parsed through the wrap function
		String newWrap = WordWrapper.wrap(text, maxLineLength);
		//Then: Outputs a new text with desired maxLineLenths AND breaks on work Breaks
		System.out.println(newWrap);
		String expected ="Hi mom!";
		assertEquals(expected,newWrap);
	}
	

}
