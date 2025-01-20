import java.util.HashMap;

public class ConvertMorseCode {

    private HashMap<Character, String> englishToMorse = new HashMap<>();
    private HashMap<String, Character> morseToEnglish = new HashMap<>();

    //konstruktor
    public ConvertMorseCode() {
        englishToMorse.put('A', ".-");
        englishToMorse.put('B', "-...");
        englishToMorse.put('C', "-.-.");
        englishToMorse.put('D', "-..");
        englishToMorse.put('E', ".");
        englishToMorse.put('F', "..-.");
        englishToMorse.put('G', "--.");
        englishToMorse.put('H', "....");
        englishToMorse.put('I', "..");
        englishToMorse.put('J', ".---");
        englishToMorse.put('K', "-.-");
        englishToMorse.put('L', ".-..");
        englishToMorse.put('M', "--");
        englishToMorse.put('N', "-.");
        englishToMorse.put('O', "---");
        englishToMorse.put('P', ".--.");
        englishToMorse.put('Q', "--.-");
        englishToMorse.put('R', ".-.");
        englishToMorse.put('S', "...");
        englishToMorse.put('T', "-");
        englishToMorse.put('U', "..-");
        englishToMorse.put('V', "...-");
        englishToMorse.put('W', ".--");
        englishToMorse.put('X', "-..-");
        englishToMorse.put('Y', "-.--");
        englishToMorse.put('Z', "--..");

        //Skapa omvänd tabell (morse till bokstav)
        for (Character key : englishToMorse.keySet()) {
            morseToEnglish.put(englishToMorse.get(key), key);
        }
    }


    //metod för att översätta text till morse
    public String toMorseCode(String intext) {
        StringBuilder morseCode = new StringBuilder();
        intext = intext.toUpperCase(); // Gör texten till stora bokstäver
        for (char c : intext.toCharArray()) {
            if (englishToMorse.containsKey(c)) {
                morseCode.append(englishToMorse.get(c)).append(" ");
            } else if (c == ' ') {
                morseCode.append("   "); // Lägg till mellanrum mellan ord
            } else {
                return "Felaktig inmatning: " + c; // Felhantering
            }
        }
        return morseCode.toString().trim();
    }

    // metod för att översätta morsekod till text
    public String toEnglish(String morse) {
        StringBuilder text = new StringBuilder();
        String[] wordsArray = morse.split(" "); // Dela upp ord per mellanslag
        for (int i = 0; i < wordsArray.length; i++) {
            String morseChar = wordsArray[i];
            if (morseToEnglish.containsKey(morseChar)) {
                text.append(morseToEnglish.get(morseChar));
            } else {
                return "Felaktig inmatning: " + morseChar; // Felhantering
            }
        }

        return text.toString();
    }
}
