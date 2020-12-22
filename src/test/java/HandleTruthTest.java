import org.junit.Test;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import static junit.framework.TestCase.assertEquals;

@SuppressWarnings("InstantiationOfUtilityClass")
public class HandleTruthTest {
    private final HandleTruth WordCount = new HandleTruth ();
    


    @Test
    public void makeshiftTest() {


       // HandleTruth.phrase();
    }
    @Test
    public void countYour() {
        Map<? extends Serializable, ?> actualwordCount = new TreeMap<Integer, Set<String>>();
        final Map<String, Integer> expectedwordCount = new HashMap<>();
        expectedwordCount.put("your", 1);
        actualwordCount = HandleTruth.phrase("your");
        assertEquals(
                expectedwordCount, actualwordCount
        );
    }
    @Test
    public void countGuns() {
        Map<? extends Serializable, ?> actualwordCount = new TreeMap<Integer, Set<String>>();
        final Map<String, Integer> expectedwordCount = new HashMap<>();
        expectedwordCount.put("guns", 1);
        actualwordCount = HandleTruth.phrase("guns");
        assertEquals(
                expectedwordCount, actualwordCount
        );
    }
    @Test
    public void countVery() {
        Map<? extends Serializable, ?> actualwordCount = new TreeMap<Integer, Set<String>>();
        final Map<String, Integer> expectedwordCount = new HashMap<>();
        expectedwordCount.put("very", 1);
        actualwordCount = HandleTruth.phrase("very");

        assertEquals(
                expectedwordCount, actualwordCount
        );
    }
    @Test
    public void countAbout() {
        Map<? extends Serializable, ?> actualwordCount = new TreeMap<Integer, Set<String>>();
        final Map<String, Integer> expectedwordCount = new HashMap<>();
        expectedwordCount.put("about", 1);
        actualwordCount = HandleTruth.phrase("about");

        assertEquals(
                expectedwordCount, actualwordCount
        );
    }
    @Test
    public void countExpplain() {
        Map<? extends Serializable, ?> actualwordCount = new TreeMap<Integer, Set<String>>();
        final Map<String, Integer> expectedwordCount = new HashMap<>();
        expectedwordCount.put("explain", 1);
        actualwordCount = HandleTruth.phrase("explain");

        assertEquals(
                expectedwordCount, actualwordCount
        );
    }
}
