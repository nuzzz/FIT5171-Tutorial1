import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Nuzz on 12/03/2016.
 */
public class AnagramToolsTest {
    private AnagramTools anagramTools;

    @Before
    public void setUp() {
        anagramTools = new AnagramTools();
    }

    @Test
    public void AnagramToolsNotNull() {
        Assert.assertNotNull(anagramTools);
    }

    @Test
    public void CheckAnagramTrueIfStringsEmpty() {
        Assert.assertTrue(anagramTools.checkAnagram("", ""));
    }

    @Test
    public void CheckAnagramTrueIfStringsContainsSpaces() {
        Assert.assertTrue(anagramTools.checkAnagram(" ", " "));
        Assert.assertTrue(anagramTools.checkAnagram(" a", "a "));
        Assert.assertTrue(anagramTools.checkAnagram(" abc", "cba  "));
    }

    @Test
    public void CheckAnagramTrueIfStringsEqual() {
        Assert.assertTrue(anagramTools.checkAnagram("abc", "abc"));
    }

    @Test
    public void CheckAnagramFalseIfStringsNotEqual() {
        Assert.assertFalse(anagramTools.checkAnagram("a", "b"));
    }

    @Test
    public void CheckAnagramFalseIfStringsNotEqualLength() {
        Assert.assertFalse(anagramTools.checkAnagram("abc", "a"));
        Assert.assertFalse(anagramTools.checkAnagram("abc", "abcd"));
    }

    @Test
    public void CheckAnagramDifferentCaseReturnsTrue() {
        Assert.assertTrue(anagramTools.checkAnagram("aBC", "CbA"));
    }

    @Test
    public void CheckAnagramSimple() {
        Assert.assertTrue(anagramTools.checkAnagram("abc", "cba"));
        Assert.assertTrue(anagramTools.checkAnagram("abc", "bca"));
        Assert.assertTrue(anagramTools.checkAnagram("abc", "bac"));
    }

    @Test
    public void CheckAnagramComplex() {
        Assert.assertTrue(anagramTools.checkAnagram("murder", "rumred"));
        Assert.assertTrue(anagramTools.checkAnagram("linus", "nulis"));
        Assert.assertTrue(anagramTools.checkAnagram("sit", "tis"));
        Assert.assertTrue(anagramTools.checkAnagram("mated", "tamed"));
        Assert.assertTrue(anagramTools.checkAnagram("mare", "ream"));
        Assert.assertTrue(anagramTools.checkAnagram("evils", "lives"));
        Assert.assertTrue(anagramTools.checkAnagram("dashed", "shaded"));
        Assert.assertTrue(anagramTools.checkAnagram("markers", "remarks"));
    }

    @Test
    public void checkAnagramListEmptyReturnsSameString() {
        Assert.assertTrue(anagramTools.checkAnagramList("").get(0)[0].equals(""));
    }



}
