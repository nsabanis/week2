package calculatedayoftheweek;

public class CalculateDayOfTheWeek {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //assuming January 1st is Monday
        //days are between 1 and 366

        for (int i = 0; i <= 367; i++) {
            checkDay(i);
        }
    }

    public static void checkDay(int dayOfTheYear) {

        if (dayOfTheYear >= 1 && dayOfTheYear <= 366) {
            int dayOfTheWeek = dayOfTheYear % 7;

            switch (dayOfTheWeek) {
                case 1:
                    System.out.println(dayOfTheYear + "\tMonday");
                    break;
                case 2:
                    System.out.println(dayOfTheYear + "\tTuesday");
                    break;
                case 3:
                    System.out.println(dayOfTheYear + "\tWednesday");
                    break;
                case 4:
                    System.out.println(dayOfTheYear + "\tThursday");
                    break;
                case 5:
                    System.out.println(dayOfTheYear + "\tFriday");
                    break;
                case 6:
                    System.out.println(dayOfTheYear + "\tSaturday");
                    break;
                case 0:
                    System.out.println(dayOfTheYear + "\tSunday");
                    break;
                default:
                    break;
            }
        } else {
            System.out.println("Wrong input");
        }
    }

}
