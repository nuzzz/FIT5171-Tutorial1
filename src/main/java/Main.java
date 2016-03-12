/**
 * Created by Nuzz on 07/03/2016.
 */
public class Main {
    public static void main(String args[]) {
        AnagramTools at = new AnagramTools();
        System.out.println(at.checkAnagram("aBC", "CbA"));
        at.checkAnagram("murder", "rumred");
    }
}
