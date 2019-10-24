package mutipleofthree;

/**
 *
 * @author user
 */
public class MultipleOfThree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int number = 51;
        System.out.println("Input is " + number);

        String multipleOfThree = (number % 3 == 0) ? "" : "not";

        System.out.println(number + " can " + multipleOfThree + " be divided by three.");

    }

}
