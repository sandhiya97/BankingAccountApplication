
public class Main {
    public static void main(String[] args) {

        /**
         * Created two objects saver1 and saver2 with balances of 2000 and 3000
         */
        SavingsAccount saver1 = new SavingsAccount(2000);
        SavingsAccount saver2 = new SavingsAccount(3000);

        /**
         * Set annual interest rate as 4
         */

        SavingsAccount.setAnnualInterestRate(4);

        System.out.println("First Month Interest rate is  " + SavingsAccount.getAnnualInterestRate() + "%");


        System.out.println("Savings balance of saver1 is " + saver1.getSavingsBalance());
        System.out.println("Savings balance of saver2 is " + saver2.getSavingsBalance());

        /**
         * calculating monthly interest for new interest rate
         */

        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        /**
         * Printing the new balances for both the savers
         */

        System.out.println("Savings balance of saver 1 is  " + SavingsAccount.getAnnualInterestRate() + " % " + saver1.getSavingsBalance());
        System.out.println("Savings balance of saver 2 is  " + SavingsAccount.getAnnualInterestRate() + " % " + saver2.getSavingsBalance());


        /**
         * setting new interest rate to 5%
         */

        SavingsAccount.modifyInterestRate(5);
        System.out.println("Second Month Interest rate is  " + SavingsAccount.getAnnualInterestRate() + "%");

        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        /**
         * Printing the new balances for both the savers
         */

        System.out.println("Savings balance of saver 1 is  " + SavingsAccount.getAnnualInterestRate() + " % " + saver1.getSavingsBalance());
        System.out.println("Savings balance of saver 2 is  " + SavingsAccount.getAnnualInterestRate() + " % " + saver2.getSavingsBalance());
    }
}
