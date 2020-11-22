import org.junit.Test;

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
        HandleTruth.HandleTruth();
    }
    @Test
    public void countWord() {
        TreeMap<Integer, Set<String>> actualwordCount = new TreeMap<Integer, Set<String>>();
        final Map<String, Integer> expectedwordCount = new HashMap<>();
        expectedwordCount.put("words", 2);
        actualwordCount = HandleTruth.HandleTruth();


        assertEquals(
                expectedwordCount, actualwordCount
        );
    }
    @Test
    public void countHave() {
        Map<String, Integer> actualwordCount = new HashMap<>();
        final Map<String, Integer> expectedwordCount = new HashMap<>();
        expectedwordCount.put("have", 5);

        assertEquals(
                expectedwordCount, actualwordCount
        );
    }
    @Test
    public void countI() {
        Map<String, Integer> actualwordCount = new HashMap<>();
        final Map<String, Integer> expectedwordCount = new HashMap<>();
        expectedwordCount.put("i", 8);

        assertEquals(
                expectedwordCount, actualwordCount
        );
    }
    @Test
    public void countThe() {
        Map<String, Integer> actualwordCount = new HashMap<>();
        final Map<String, Integer> expectedwordCount = new HashMap<>();
        expectedwordCount.put("the", 9);

        assertEquals(
                expectedwordCount, actualwordCount
        );
    }
    @Test
    public void countDont() {
        Map<String, Integer> actualwordCount = new HashMap<>();
        final Map<String, Integer> expectedwordCount = new HashMap<>();
        expectedwordCount.put("dont", 3);


        assertEquals(
                expectedwordCount, actualwordCount
        );
    }
}
