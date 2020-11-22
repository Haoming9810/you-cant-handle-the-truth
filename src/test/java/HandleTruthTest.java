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
     //   HandleTruth.phrase();
    }
    @Test
    public void countWord() {
        Map<? extends Serializable, ?> actualwordCount = new TreeMap<Integer, Set<String>>();
        final Map<String, Integer> expectedwordCount = new HashMap<>();
        expectedwordCount.put("words", 1);
        actualwordCount = HandleTruth.phrase("words");


        assertEquals(
                expectedwordCount, actualwordCount
        );
    }
    @Test
    public void countHave() {
        Map<? extends Serializable, ?> actualwordCount = new TreeMap<Integer, Set<String>>();
        final Map<String, Integer> expectedwordCount = new HashMap<>();
        expectedwordCount.put("have", 1);
        actualwordCount = HandleTruth.phrase("have");


        assertEquals(
                expectedwordCount, actualwordCount
        );
    }
    @Test
    public void countI() {
        Map<? extends Serializable, ?> actualwordCount = new TreeMap<Integer, Set<String>>();
        final Map<String, Integer> expectedwordCount = new HashMap<>();
        expectedwordCount.put("i", 1);
        actualwordCount = HandleTruth.phrase("i");



        assertEquals(
                expectedwordCount, actualwordCount
        );
    }
    @Test
    public void countThe() {
        Map<? extends Serializable, ?> actualwordCount = new TreeMap<Integer, Set<String>>();
        final Map<String, Integer> expectedwordCount = new HashMap<>();
        expectedwordCount.put("the", 1);
        actualwordCount = HandleTruth.phrase("the");



        assertEquals(
                expectedwordCount, actualwordCount
        );
    }
    @Test
    public void countDont() {
        Map<? extends Serializable, ?> actualwordCount = new TreeMap<Integer, Set<String>>();
        final Map<String, Integer> expectedwordCount = new HashMap<>();
        expectedwordCount.put("dont", 1);
        actualwordCount = HandleTruth.phrase("dont");




        assertEquals(
                expectedwordCount, actualwordCount
        );
    }
}
