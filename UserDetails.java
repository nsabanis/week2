package userdetails;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author nick.sabanis
 */
public class UserDetails {

    private static Scanner sc;
    private static final String ASK_NAME = "What is your first name?";
    private static final String ASK_SURNAME = "What is your last name?";
    private static final String ASK_AGE = "What is your age?";
    private static final String ASK_FAVOURITE_COLOUR = "What is your favourite colour?";
    private static final int MIN_AGE = 18;
    private static final int MAX_AGE = 66;

    private static String inputName, inputSurname, inputAge, inputColour;

    public static void main(String[] args) throws IOException {

        sc = new Scanner(System.in);

        String details = getDetails();

        String path = "C:\\Users\\user\\Documents\\examples\\myFile.txt";

        int ageInt = Integer.parseInt(inputAge);

        if (checkIfValidAge(ageInt, MIN_AGE, MAX_AGE) && checkIfValidColourStart(inputColour, "b")) {
            writeToFile(path, details);
        }

    }

    public static boolean checkIfValidAge(int age, int minAge, int maxAge) {

        if (age < minAge) {
            System.err.println("Could not write to file. Age is below 18");
            return false;
        } else if (age > maxAge) {
            System.out.println("Could not write to file. Age is above 66");
            return false;
        } else {
            return true;
        }
    }

    public static boolean checkIfValidColourStart(String colour, String prefix) {
        if (!colour.startsWith(prefix)) {
            System.out.println("Could not write to file. Colour does not start with b");
            return false;
        } else {
            return true;
        }
    }

    public static String getDetails() {

        System.out.println(ASK_NAME);
        inputName = getInput();

        System.out.println(ASK_SURNAME);
        inputSurname = getInput();

        System.out.println(ASK_AGE);
        inputAge = getInput();

        System.out.println(ASK_FAVOURITE_COLOUR);
        inputColour = getInput();

        StringBuilder sb = new StringBuilder();
        sb.append("Name:\t").append(inputName);
        sb.append("\nSurname:\t").append(inputSurname);
        sb.append("\nAge:\t").append(inputAge);
        sb.append("\nColour:\t").append(inputColour);

        return sb.toString();
    }

    public static String getInput() {
        String input = sc.nextLine();
        return input;
    }

    public static void writeToFile(String path, String text) throws IOException {

        FileWriter fileWriter = new FileWriter(path);
        BufferedWriter output = new BufferedWriter(fileWriter);
        output.write(text);
        output.close();
        fileWriter.close();
    }
}
