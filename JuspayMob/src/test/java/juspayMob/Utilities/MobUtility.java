package juspayMob.Utilities;
import java.util.Random;
public class MobUtility {
	    private static final String[] WORDS = {
	        "apple", "banana", "orange", "grape", "kiwi", "mango", "pineapple", "strawberry", "watermelon"
	    };
	    private static final int MAX_WORD_LENGTH = 8;

	    public static void main(String[] args) {
	        String randomWord = generateRandomWord(MAX_WORD_LENGTH);
	        System.out.println("Random word (length 8): " + randomWord);
	    }

	    public static String generateRandomWord(int length) {
	        Random random = new Random();
	        String word = "";
	        do {
	            int randomIndex = random.nextInt(WORDS.length);
	            word = WORDS[randomIndex];
	        } while (word.length() != length);
	        return word;
	    }
	}



