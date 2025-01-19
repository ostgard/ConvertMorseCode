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

        //metod för att översätta text till morse
        public String toMorse (String text){
            StringBuilder morseCode = new StringBuilder();
            text = text.toUpperCase(); // Gör texten till stora bokstäver
            for (char c : text.toCharArray()) {
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
        public String toEnglish (String morse){
            StringBuilder text = new StringBuilder();
            String[] words = morse.trim().split("   "); // Dela upp på ord
            for (String word : words) {
                for (String letter : word.split(" ")) { // Dela upp på bokstäver
                    if (morseToEnglish.containsKey(letter)) {
                        text.append(morseToEnglish.get(letter));
                    } else {
                        return "Felaktig inmatning: " + letter; // Felhantering
                    }
                }
                text.append(" ");
            }
            return text.toString().trim();
        }

    }

}
