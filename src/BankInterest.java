public class BankInterest {
    public static void main(String[] args) {
        double initialDeposit  = 125_000_000.0;
        int totalHours = 5; //calculates the 5 hours

        System.out.printf("Initial Deposit: $%,.2f\n\n", initialDeposit); //prints initial deposit
        calculateInterest(initialDeposit, 1, totalHours);
        }
    public static void calculateInterest(double balance, int currentHour, int totalHours){
        if (currentHour > totalHours){ // recursion - stop condition
            return;
        }
        if (balance > 100_000_000) { //threshold check
            double hourlyRate = 0.02/ 8640; //2% per year/ (360 x 24)
            double interest = balance * hourlyRate;
            double newBalance = balance + interest; //compound interest

            System.out.printf("Hour %d: Interest Credited = $%,.2f | New Balance = $%,.2f\n",
                                currentHour, interest, newBalance);

            calculateInterest(newBalance, currentHour +1, totalHours); // recursive call for the next hour
        } else {
            System.out.println("Balance does not meet the $100M threshold. No interest credited.");
        }
    }
}

