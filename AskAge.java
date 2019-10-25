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

    public static void main(String[] args) {

        sc = new Scanner(System.in);

        boolean foundAValidInteger = false;

        int returnedInt;

        while (!foundAValidInteger) {
            returnedInt = getInteger();
            foundAValidInteger = true;
            if (!checkIfValidAge(returnedInt, MIN_AGE, MAX_AGE)) {
                foundAValidInteger = false;
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

        if (age < minAge) {
            System.err.println("Error. Input age is under" + minAge);
            return false;
        } else if (age > maxAge) {
            System.err.println("Error. Input age is over  " + maxAge);
            return false;
        } else {
            return true;
        }
    }
}
