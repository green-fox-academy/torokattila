package CountLetters;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class CountLettersTest {

    CountLetters counter = new CountLetters();

    @Test
    void characterCounter() {
        HashMap<Character, Integer> dic = counter.characterCount("alma");
        assertEquals(dic.get('a'), 2);
        assertEquals(dic.get('l'), 1);
        assertEquals(dic.get('m'), 1);
        assertEquals(dic.keySet().size(), 3);
    }

    @Test
    void characterIsEmptyLength() {
        HashMap<Character, Integer> dic = counter.characterCount("");
        assertEquals(dic, null);
    }

    @Test
    void characterIsNull() {
        HashMap<Character, Integer> dic = counter.characterCount(null);
        assertEquals(dic, null);
    }

}