package ageinpastandfuture;

public class AgeInPastAndFuture {

    public static void main(String[] args) {

        int currentYear = 2019;
        int myAge = 32;
        int jimAge = 50;
        int alexAge = 10;
        int victoriaAge = 80;

        int nickBirthYear = printYearOfBirth("Nick", currentYear, myAge);
        int jimBirthYear = printYearOfBirth("Jim", currentYear, jimAge);
        int alexkBirthYear = printYearOfBirth("Alex", currentYear, alexAge);
        int victoriaBirthYear = printYearOfBirth("Victoria", currentYear, victoriaAge);

        System.out.println("");

        ageInPastYear("Nick", 1960, nickBirthYear, currentYear);
        ageInPastYear("Jim", 1960, jimBirthYear, currentYear);
        ageInPastYear("Alex", 1960, alexkBirthYear, currentYear);
        ageInPastYear("Victoria", 1960, victoriaBirthYear, currentYear);

        System.out.println("");

        ageInFutureYear("Nick", 2040, nickBirthYear, currentYear);
        ageInFutureYear("Jim", 2040, jimBirthYear, currentYear);
        ageInFutureYear("Alex", 2040, alexkBirthYear, currentYear);
        ageInFutureYear("Victoria", 2040, victoriaBirthYear, currentYear);
    }

    public static int printYearOfBirth(String name, int currentYear, int currentAge) {
        int yearOfBirth = currentYear - currentAge;
        System.out.println(name + " was born in " + yearOfBirth);

        return yearOfBirth;
    }

    public static void ageInPastYear(String name, int testYear, int personBirthYear, int currentYear) {

        if (testYear < currentYear) {//ensure past
            int ageInTestYear = testYear - personBirthYear;

            if (ageInTestYear < 0) {
                System.out.println(name + " was not born in " + testYear);
            } else {
                System.out.println(name + " was " + ageInTestYear + " years old in " + testYear);
            }
        } else {
            System.out.println(testYear + " is not in the past");
        }
    }

    public static void ageInFutureYear(String name, int testYear, int personBirthYear, int currentYear) {

        if (currentYear < testYear) {

            int ageInTestYear = testYear - personBirthYear;

            if (ageInTestYear < 0) {
                System.out.println(name + " has not been born yet");
            } else {
                System.out.println(name + " will be " + ageInTestYear + " years old in " + testYear);
            }

        } else {
            System.out.println(testYear + " is not in the past");
        }

    }
}
