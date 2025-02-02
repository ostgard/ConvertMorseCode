import org.junit.Test;
//import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
//import static org.junit.jupiter.api.Assertions.*;

public class ConvertMorseCodeTest {

    ConvertMorseCode convertMorseCode = new ConvertMorseCode();

    @Test
    public void testLetterToMorseCode() {
        assertEquals(".-", convertMorseCode.toMorseCode("A"));
    }

    @Test
    public void testMorseCodeToLetter() {
        assertEquals("S", convertMorseCode.toEnglish("..."));
    }

    @Test
    public void testSentenceToMorseCode() {
        assertEquals(".... . .-.. .-.. ---   .-- --- .-. .-.. -..", convertMorseCode.toMorseCode("HELLO WORLD"));
    }

    @Test
    public void testMorseCodeToWord() {
        assertEquals("HELLO", convertMorseCode.toEnglish(".... . .-.. .-.. ---"));
    }

    @Test
    public void testInvalidCharToMorse() {
        assertEquals("Felaktig inmatning: %", convertMorseCode.toMorseCode("%"));
    }

    @Test
    public void testNonExistingMorseCode() {
        assertEquals("Felaktig inmatning: ヽ(•‿•)ノ", convertMorseCode.toEnglish("ヽ(•‿•)ノ"));
    }

}
