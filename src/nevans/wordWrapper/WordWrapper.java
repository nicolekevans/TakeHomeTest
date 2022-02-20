package nevans.wordWrapper;

public class WordWrapper {

	
	public static String wrap(String text, int maxLineLength) {
		
		//If a null value is submitted for the text, a blank string is returned
		if (text==null) {
			return "";
		}
		
		
		// Initializes the maximum length for a line break.
		int lineBreak = maxLineLength;
		StringBuilder sb = new StringBuilder(text);
		
		
		//while the next lineBreak value is less than the length of the text
		//the location of the next lineBreak is found
		while(lineBreak<sb.length()) {
			
			//if lineBreak ends on a space, the space is replaced with a \n
				if(sb.charAt(lineBreak)== ' ') {
					sb.replace(lineBreak, lineBreak+1, "\n");
					lineBreak = lineBreak+maxLineLength;
				}
				else {
					int lastSpace= lineBreak+1;
					   //Checks to see if the character after the maxLength is a space
					   // If so, replaces that with a \n
					   if(sb.charAt(lineBreak+1)== ' ') {
						   sb.insert(lineBreak+1, "\n");
						   sb.deleteCharAt(lineBreak+2);
					   }
					   //else if it lands on a character, the last space is found and 
					   //is replaced with a \n
					   else {
						   StringBuilder findSpace = new StringBuilder (sb.substring(0, lineBreak));
						   lastSpace =	findSpace.lastIndexOf(" ");
						   sb.replace(lastSpace, lastSpace+1, "\n");
						
				       }
			         lineBreak= lastSpace+maxLineLength;
				}
			}
		return sb.toString();
	}

}