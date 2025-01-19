import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //En instans av logikklassen
        ConvertMorseCode convertMorseCode = new ConvertMorseCode();

        System.out.println("Välj vad du vill göra (alternativ 1 eller 2) :");
        System.out.println("1. översätt text till morsekod");
        System.out.println("2. översätt morsekod till text");

        String userChoice = scanner.nextLine();

        if (userChoice.equals("1")){
            System.out.println("skriv in den text du vill översätta till morsekod");
            String input = scanner.nextLine(); //läs in text fr¨n användaren
            String result = convertMorseCode.to
        }


    }

}