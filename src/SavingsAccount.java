
public class SavingsAccount {

    /* Using a static variable to store the annual interest rate of all the account holders */
    public static float annualInterestRate;

    /*Created a private instance variable to indicate the amount the saver currently has on deposit*/
    private float savingsBalance;


    /**
     * Calculating Monthly Interest
     * monthlyInterest = savingsBalance * ((annualInterestRate/100)/12);
     * savingsBalance = savingsBalance + monthlyInterest;
     */
    public void calculateMonthlyInterest() {
        float savingsBalance = getSavingsBalance();
        float annualInterestRate = getAnnualInterestRate();
        float monthlyInterest = savingsBalance * ((annualInterestRate / 100) / 12);
        savingsBalance = savingsBalance + monthlyInterest;
        setSavingsBalance(savingsBalance);
    }

    public static void setAnnualInterestRate(float annualInterestRate) {
        SavingsAccount.annualInterestRate = annualInterestRate;
    }


    /**
     * @param newInterestRate
     */
    public static void modifyInterestRate(float newInterestRate) {
        setAnnualInterestRate(newInterestRate);
    }



    public static float getAnnualInterestRate() {
        return annualInterestRate;
    }

    public float getSavingsBalance() {
        return savingsBalance;
    }

    public void setSavingsBalance(float savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    SavingsAccount(float savingsBalance) {
        setSavingsBalance(savingsBalance);
        setAnnualInterestRate(savingsBalance);
    }
}
