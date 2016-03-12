import com.sun.javaws.exceptions.InvalidArgumentException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by Nuzz on 07/03/2016.
 */
public class AnagramDetectorTest {
    private AnagramDetector anagramDetector;

    @Before
    public void setUp() {
        this.anagramDetector = new AnagramDetector();
    }

    @Test
    public void AnagramDetectorWorks() {
        Assert.assertNotNull("anagramDetector not null", this.anagramDetector);
    }

    @Test
    public void checkAnagramTwoEmptyString() {
        Assert.assertTrue("checkAnagram(\"\",\"\")", anagramDetector.checkAnagram("", ""));
    }

    @Test
    public void checkAnagramTwoSameString() {
        Assert.assertTrue("checkAnagram(\"abc\",\"abc\")", anagramDetector.checkAnagram("abc", "abc"));
    }

    @Test
    public void checkAnagramSimple() {
        Assert.assertTrue(anagramDetector.checkAnagram("abc", "bac"));
    }

    @Test
    public void checkAnagramStringEmpty() {
        String input = "tews tis lives tamed elvis ream evils comics stew wets markers dashed west veils rat mace sit mated "
                + "cosmic mare remarks shaded";
        ArrayList<String> emptyList = new ArrayList<String>();
        Assert.assertEquals(emptyList, anagramDetector.checkAnagramString(""));
    }
}
