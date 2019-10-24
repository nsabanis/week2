package askage;

import java.util.Scanner;

/**
 *
 * @author nick.sabanis
 */
public class AskAge {

    static Scanner sc;
    static final int MIN_AGE = 0;
    static final int MAX_AGE = 120;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        sc = new Scanner(System.in);

        boolean foundAnInteger = false;

        int returnedInt;

        while (!foundAnInteger) {
            returnedInt = getInteger();
            foundAnInteger = true;
            if (!checkIfValidAge(returnedInt, MIN_AGE, MAX_AGE)) {
                foundAnInteger = false;
            }
        }

        sc.close();
    }

    public static int getInteger() {

        System.out.println("Enter your age. Valid numbers are between " + MIN_AGE + " and " + MAX_AGE);
        while (!sc.hasNextInt()) {
            System.out.println("Please enter a valid number");
            sc.next();
        }
        int returnInt = sc.nextInt();
        return returnInt;
    }

    public static boolean checkIfValidAge(int age, int minAge, int maxAge) {

        if (age >= minAge && age < maxAge) {
            System.out.println("Your age is " + age);
            return true;
        } else {
            System.out.println("Wrong input age");
            return false;
        }
    }
}
