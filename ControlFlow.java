package controlflow;

public class ControlFlow {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//        for (int i=-2;i<=20;i++){
//            classInSchool(i);
//        }
//
//        String[] testDays = {null, "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday", "Otherday"};
//        for (String testDay : testDays) {
//            everydayActivities(testDay);
//        }
//
//        for (int i = -2; i <= 24; i++) {
//            ageAbilities(i);
//        }
//
//        for (int i = -2; i <= 13; i++) {
//            season(i);
//        }
//
//        int year = 2019;
//        int month = 12;
//        daysOfMonth(month, year);
//        
//        year=2020;
//        month=2;
//        daysOfMonth(month, year);
//        
//for(int i=-1;i<24;i++){
//    ageAbilities(i);
//}

    }

    public static void classInSchool(int age) {

        if (age < 0) {
            System.out.println("Wrong age");
        } else if (age < 5) {
            System.out.println("You are too young to go to school");
        } else if (age < 7) {
            System.out.println("You are in pre-school classes");
        } else if (age < 13) {
            switch (age) {
                case 7:
                    System.out.print("You are in first class");
                    break;
                case 8:
                    System.out.print("You are in second class");
                    break;
                case 9:
                    System.out.print("You are in third class");
                    break;
                case 10:
                    System.out.print("You are in fourth class");
                    break;
                case 11:
                    System.out.print("You are in fifth class");
                    break;
                case 12:
                    System.out.print("You are in sixth class");
                    break;
                default:
                    break;
            }
            System.out.println(" in primary school");
        } else if (age < 19) {
            switch (age) {
                case 13:
                    System.out.print("You are in first class");
                    break;
                case 14:
                    System.out.print("You are in second class");
                    break;
                case 15:
                    System.out.print("You are in third class");
                    break;
                case 16:
                    System.out.print("You are in fourth class");
                    break;
                case 17:
                    System.out.print("You are in fifth class");
                    break;
                case 18:
                    System.out.print("You are in sixth class");
                    break;
                default:
                    break;
            }
            System.out.println(" in high school");
        } else {
            System.out.println("You have probably finished school");
        }

    }

    public static void everydayActivities(String day) {
        if (day != null) {
            switch (day) {
                case "Monday":
                    System.out.println(day + ": Wake up early.");
                    break;
                case "Tuesday":
                    System.out.println(day + ": Feed your pets.");
                    break;
                case "Wednesday":
                    System.out.println(day + ": Go to Asia.");
                    break;
                case "Thursday":
                    System.out.println(day + ": Deliver your exercises.");
                    break;
                case "Friday":
                    System.out.println(day + ": Prepare for weekend.");
                    break;
                case "Saturday":
                    System.out.println(day + ": Find the best parties.");
                    break;
                case "Sunday":
                    System.out.println(day + ": Cool down.");
                    break;
                default:
                    System.err.println("Wrong input.");
                    break;
            }

        } else {
            System.err.println("Null input");
        }
    }

    public static void season(int month) {
        if (month < 1 || month > 12) {
            System.out.println("Wrong input");
        } else if (month < 4) {
            System.out.println(month + "\tSpring");
        } else if (month < 7) {
            System.out.println(month + "\tSummer");
        } else if (month < 10) {
            System.out.println(month + "\tAutumn");
        } else if (month < 13) {
            System.out.println(month + "\tWinter");
        }
    }

    public static void daysOfMonth(int month, int year) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Month " + month + " has 31 days");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Month " + month + "30 days");
                break;
            case 2:
                if (year % 4 == 0) {
                    System.out.println("In year " + year + " month " + month + " has 29 days");
                } else {
                    System.out.println("In year " + year + " month " + month + " has 28 days");
                }
                break;
            default:
                System.out.println("Wrong input");
                break;
        }
    }

    public static void ageAbilities(int age) {
        if (age < 0) {
            System.out.println("Wrong input");
        } else if (age < 16) {
            System.out.println("You cannot drive");
        } else if (age < 17) {
            System.out.println("You can drive but not vote");
        } else if (age < 21) {
            System.out.println("You can vote but not drink");
        } else {
            System.out.println("You can do anything");
        }
    }
}
