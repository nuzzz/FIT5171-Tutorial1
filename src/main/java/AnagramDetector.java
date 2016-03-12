import java.util.ArrayList;

/**
 * Created by Nuzz on 07/03/2016.
 */
public class AnagramDetector {

    public AnagramDetector() {

    }

    public boolean checkAnagram(String w1, String w2) {
        String word1 = w1.toLowerCase();
        String word2 = w1.toLowerCase();
        if (word1.equals(word2)) {
            return true;
        }

        int letterArray[] = new int[26];

        for (char letter : word1.toCharArray()) {
            int index = (int) letter - 97;
            letterArray[index] += 1;
        }

        for (char letter : word2.toCharArray()) {
            int index = (int) letter - 97;
            letterArray[index] -= 1;
        }
        for (int letterCount : letterArray) {
            if (letterCount != 0) {
                return false;
            }
        }
        return true;
    }

    public ArrayList<String> checkAnagramString(String s) {
        ArrayList<String> output = new ArrayList<String>();
//        String[] parts = s.split(" ");
//        String[] parts2 = Arrays.copyOf(parts, parts.length);
//        for(String word: parts){
//            for(String otherWord: )
//        }


        return output;
    }
}
