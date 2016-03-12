import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Nuzz on 12/03/2016.
 */
public class AnagramToolsTest {
    private AnagramTools anagramTools;

    @Before
    public void setUp(){
        anagramTools = new AnagramTools();
    }

    @Test
    public void AnagramToolsNotNull(){
        Assert.assertNotNull(anagramTools);
    }

    @Test
    public void AnagramCheckTrueIfStringsEqual(){
        Assert.assertTrue(anagramTools.anagramCheck("abc", "abc"));
    }


}
