package annualsalary;

public class AnnualSalary {

    public static void main(String[] args) {
        
        double monthlySalary = 900;
        
        System.out.println("Your annual salary is "+ annualPrice(monthlySalary));
        System.out.println("");
        
        int govTaxPercentage = 9;

        double monthlyTax = monthlySalary * govTaxPercentage / 100;
        double clearMonthlySalary = monthlySalary - monthlyTax;

        System.out.println("Government taxes you " + monthlyTax + " per month.");
        System.out.println("Your clear earnings are " + clearMonthlySalary + " per month.");
        
        System.out.println("");
        
        System.out.println("Government taxes you " + annualPrice(monthlyTax) + " per year");
        System.out.println("Your clear earnings are " + annualPrice(clearMonthlySalary) + " per year");

    }

    public static double annualPrice(double monthlySalary) {
        return 12 * monthlySalary;
    }

}
