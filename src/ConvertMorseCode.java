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


        StringBuilder stringBuilder = new StringBuilder();
        intext = intext.toUpperCase(); // Gör texten till stora bokstäver
        char[] charArray = intext.toCharArray();
        for (char inmatadeTecken : charArray) {
            if (englishToMorse.containsKey(inmatadeTecken)) {
                stringBuilder.append(englishToMorse.get(inmatadeTecken)).append(" ");
            } else if (inmatadeTecken == ' ') {
                stringBuilder.append("  "); // Lägg till mellanrum mellan ord
            } else {
                return "Felaktig inmatning: " + inmatadeTecken; // Felhantering
            }
        }
        return stringBuilder.toString().trim();
    }


    // metod för att översätta morsekod till text
    public String toEnglish(String morse) {
        StringBuilder stringBuilder = new StringBuilder();
        String[] morseArray = morse.split(" "); // Dela upp ord per mellanslag, skapar "listan" morseArray, till separata strängobjekt
        // for (int i = 0; i < morseArray.length; i++) {
        //String morseChar = morseArray[i];
        for (String morseSign : morseArray) {

            if (morseToEnglish.containsKey(morseSign)) {
                stringBuilder.append(morseToEnglish.get(morseSign));
//            } else if (morseSign.equals("  ")) {//lös hur det ska se ut om man ska mata in flera ord i morsekod.
//                stringBuilder.append(' ');

            } else {

                return "Felaktig inmatning: " + morseSign; // Felhantering
            }
            //System.out.println("Skriv den morsekod du vill översätta till text, använd . och/eller - ");
        }
        return stringBuilder.toString();
    }


}























