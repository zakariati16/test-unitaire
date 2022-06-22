
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;


public class StringUtilsTest {
    @Test
    @DisplayName("should concatenate two string")
    void stringUtils() {
        assertEquals("papa", StringUtils.concat("pa", "pa"));
    }


    @Test
    @DisplayName("Should return true with kayak")
    void isPalindromeKayak() {
        boolean result = StringUtils.isPalindrom("kayak");
        assertTrue(result);
    }


    @Test
    @DisplayName("Should return false with bonjour")
    void isPalindromeBonjour() {
        boolean result = StringUtils.isPalindrom("bonjour");
        assertFalse(result);
    }

    @Test
    @DisplayName("Should return true with empty string")
    void isPalidndromeChaineVide() {
        boolean result = StringUtils.isPalindrom("");
        assertTrue(result);
    }

    @Test
    @DisplayName("Should return true with KAyaK")
    void isPalindromeKAYak() {
        boolean result = StringUtils.isPalindrom("KAyaK");
        assertTrue(result);
    }

    @Test
    @DisplayName("Should return true with string containing spaces")
    void isPalindromeWithSpaces() {
        boolean result = StringUtils.isPalindrom("Engage le jeu que je le gagne");
        assertTrue(result);
    }

    @Test
    @DisplayName("Should return true if the prefix is in uppercase")
    void isPrefixUpperCase() {
        boolean result = StringUtils.isPrefix("banner", "Ban");
        assertTrue(result);
    }

    ///////////////////////////

    @Test
    @DisplayName("Should reverse a string")
    void reverseString() {
        assertEquals("reversed", StringUtils.reverseString("desrever"));
    }

    @Test
    @DisplayName("Should reverse a string ignoring casing")
    void reverseStringDifferentCasing() {
        assertEquals("reversed", StringUtils.reverseString("deSRever"));
    }

    @Test
    @DisplayName("Should return empty string if empty given")
    void reverseStringEmpty() {
        assertEquals("", StringUtils.reverseString(""));
    }

    @Test
    @DisplayName("Should return false when not reversed")
    void reverseStringFalse(){
        assertNotEquals("reversed", "deSReverdeSReverdeSReverdeSReverdeSReverdeSReverdeSRever");
    }
}





