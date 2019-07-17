package Anagram;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {

    Anagram anagram = new Anagram();

    @Test
    void isAnagram() {
        assertTrue(anagram.isAnagram("dog", "god"));
    }

    @Test
    void isNotAnagram() {
        assertFalse(anagram.isAnagram("sausage", "party"));
    }

    @Test
    void isAnagramWithNull () {
        assertFalse(anagram.isAnagram(null, null));
    }
}