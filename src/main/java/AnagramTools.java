import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Nuzz on 12/03/2016.
 */
public class AnagramTools {
    public boolean checkAnagram(String word1, String word2) {

        String w1 = word1.toLowerCase().trim();
        String w2 = word2.toLowerCase().trim();

        char[] w1copy = w1.toCharArray();
        char[] w2copy = w2.toCharArray();

        if (!Arrays.equals(w1copy, w2copy)) {
            Arrays.sort(w1copy);
            Arrays.sort(w2copy);

            return Arrays.equals(w1copy, w2copy);
        }
        return true;
    }

    public ArrayList<String[]> checkAnagramList(String input) {
        ArrayList<String[]> output = new ArrayList<String[]>();

        String[] wordList = input.split(",");

        if (wordList.length <= 1) {
            output.add(wordList);
            return output;
        }


        return output;
    }


}
