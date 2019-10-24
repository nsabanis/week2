package testobject;

/**
 *
 * @author nick.sabanis
 */
public class TestObject {

    private static int intValue;
    private static char charValue;

    public static void printValues() {
        System.out.println("Integer default value is: " + intValue);
        System.out.println("Character default value is: '" + charValue + "'");
    }

    public static void main(String[] args) {

        TestObject testObject = new TestObject();
        testObject.printValues();

    }

}
