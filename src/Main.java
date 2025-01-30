import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //En instans av logikklassens ConvertmorseCode
        ConvertMorseCode convertMorseCode = new ConvertMorseCode();


        while (true){
        System.out.println("Välj vad du vill göra (alternativ 1 eller 2) - Skriv stop för att avsluta programmet:");
        System.out.println("1. översätt text till morsekod");
        System.out.println("2. översätt morsekod till text");


//        int userChoice = scanner.nextInt();
//        scanner.nextLine();

            String input = scanner.nextLine().trim(); // Läs in som en sträng för att hantera fel bättre

            if (input.equalsIgnoreCase("stop")) {
                System.out.println("Programmet avslutas...");
                break; // Avslutar loopen
            }

            int userChoice = Integer.parseInt(input); // Försök att tolka som en siffra


        if (userChoice==1) {
            System.out.println("skriv in den text du vill översätta till morsekod");
            String indata = scanner.nextLine(); //läs in text från användaren
            System.out.println(convertMorseCode.toMorseCode(indata));

        } else if (userChoice==2) {
            System.out.println("skriv in den morsekod du vill översätta till text, använd mellanslag mellan varje morsekodtecken");
            String indata = scanner.nextLine();
            String result = convertMorseCode.toEnglish(indata);
            System.out.println(result);


        } else {
            System.out.println("Ange ditt val genom att skriva 1 eller 2");
            System.out.println("avsluta programmet genom att skriva stop");

            scanner.close();
        }
        }



    }

}