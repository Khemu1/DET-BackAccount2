package DET;

class Main {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount("John Doe", 123456, 0.02);

        System.out.println("Account Holder: " + savingsAccount.getAccountHolderName());
        System.out.println("Account Number: " + savingsAccount.getAccountNumber());
        System.out.println("Interest Rate: " + savingsAccount.getInterestRate());
    }
}
