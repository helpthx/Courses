import java.util.Scanner;

public class ProjectCrypto {
	public static final Scanner input = new Scanner(System.in);
	public static String simpletext;
	
	public static void main(String[] args) {
		simpletext = normalizeText("This is some \"really\" great. (Text)!?");
		System.out.println(simpletext);
		String cyphertext = encryptString("Who will win the election?",  5, 3);
	    String plaintext = decryptString(cyphertext, 5);

	    System.out.println(plaintext);
		
		
	}
	
	public static String encryptString(String input, int key, int pad){
	    return groupify( caesarify(normalizeText(input) , key) ,pad);
	}

	public static String decryptString(String input, int key){
	    return caesarify(ungroupify(input), key* -1);
	}
	
	public static String normalizeText(String text){
		text = text.toUpperCase();
		text = text.replace( ".", "");
		text = text.replace( "\\", "");
		text = text.replace( "\"", "");
		text = text.replace( "(", "");
		text = text.replace( ")", "");
		text = text.replace( "!", "");
		text = text.replace( "?", "");
		text = text.trim();
		text = text.replace(" ","");
		
		return text;
	}
	
	public static String caesarify(String inputText, int key){
	    String shiftedAlphabet = shiftAlphabet(key);
	    String normalAlphabet = shiftAlphabet(0);

	    String enryptedString = "";

	    for(int i = 0; i < inputText.length(); i++){
	        int charNormalPos = normalAlphabet.indexOf(inputText.charAt(i));

	        enryptedString += shiftedAlphabet.charAt(charNormalPos);
	    }

	    return enryptedString;
	}

	public static String groupify(String normalizedText, int blockSize) {
	    String output = "";
	    int counter = 0;

	    for (int i = 0; i < normalizedText.length(); i++) {
	        if (counter >= blockSize) {
	            output += " ";
	            counter = 0;
	        }

	        output += normalizedText.charAt(i);
	        counter++;
	    }

	    int padLen = normalizedText.length() % blockSize;
	    for (int i = 0; i < padLen; i++){
	        output += "x";
	    }

	    return output;
	}

	public static String ungroupify(String encryptedText) {
	    String output = "";

	    for(int i = 0; i < encryptedText.length(); i++){
	        if(encryptedText.charAt(i) == ' ' || encryptedText.charAt(i) == 'x'){
	            continue;
	        }

	        output += encryptedText.charAt(i);
	    }

	    return output;
	}

	public static String shiftAlphabet(int shift) {
	    int start = 0;
	    if (shift < 0) {
	        start = (int) 'Z' + shift + 1;
	    } else {
	        start = 'A' + shift;
	    }
	    String result = "";
	    char currChar = (char) start;
	    for(; currChar <= 'Z'; ++currChar) {
	        result = result + currChar;
	    }
	    if(result.length() < 26) {
	        for(currChar = 'A'; result.length() < 26; ++currChar) {
	            result = result + currChar;
	        }
	    }
	    return result;
	}
	
	
}
