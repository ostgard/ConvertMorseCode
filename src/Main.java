import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //En instans av logikklassen ConvertmorseCode
        ConvertMorseCode convertMorseCode = new ConvertMorseCode();

        System.out.println("Välj vad du vill göra (alternativ 1 eller 2) :");
        System.out.println("1. översätt text till morsekod");
        System.out.println("2. översätt morsekod till text");

        int userChoice = scanner.nextInt();
        scanner.nextLine();

        if (userChoice==1) {
            System.out.println("skriv in den text du vill översätta till morsekod");
            String indata = scanner.nextLine(); //läs in text från användaren
//            String result = convertMorseCode.toMorseCode(indata);
//            System.out.println(result);
            System.out.println(convertMorseCode.toMorseCode(indata));

        } else if (userChoice==2) {
            System.out.println("skriv in den morsekod du vill översätta till text, använd mellanslag mellan varje morsekodtecken");
            String indata =scanner.nextLine();
            String result = convertMorseCode.toEnglish(indata);
            System.out.println(result);
        } else {
            System.out.println("Ange ditt val genom att skriv 1 eller 2");
        }



    }

}