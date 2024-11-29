public class LoanExe {
    public static void main(String[] args) {

        Loan loan1 = new Loan();
        System.out.println("Deafault Loan: ");
        printLoanDetails(loan1);

        Loan loan2 = new Loan(6.5, 23, 30000);
        System.out.println("\nNew custom loan: ");
        printLoanDetails(loan2);

        loan2.setAnnualInterestRate(4.5);
        loan2.setNumberOfYears(15);
        loan2.setLoanAmount(17000);
        System.out.println("\nModified loan ");
        printLoanDetails(loan2);
    }

    public static void printLoanDetails(Loan loan2) {
        System.out.printf("Annual Interest Rate: %.2f%%\n ", loan2.getAnnualInterestRate());
        System.out.println("Number of Years: " + loan2.getNumberOfYears());
        System.out.printf("Loan Amount: %.2f\n", loan2.getLoanAmount());
        System.out.println("Loan Date: " + loan2.getLoanDate());
        System.out.printf("Monthly Payment: %.2f\n", loan2.getMonthlyPayment());
        System.out.printf("Total Payment: %.2f\n", loan2.getTotalPayment());
    }
}




