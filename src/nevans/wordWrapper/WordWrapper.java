package nevans.wordWrapper;

public class WordWrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public String wrap(String text, int maxLineLength) {
		StringBuilder sb = new StringBuilder(text);
		int start = maxLineLength;
		for(int i =1; start<sb.length(); i++) {
				System.out.println("before:" + sb);
				System.out.println("sb.length=" +sb.length() +", start="+ start + ", i="+ i);
				sb.insert(start, '\n');
				System.out.println("after:"+ sb);
				start = start+maxLineLength+i;
				
			}
		
		
		
		return sb.toString();
	}

}
