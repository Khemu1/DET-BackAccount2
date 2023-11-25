package DET;

public class BankAccount {
        private String accountHolderName;
        private int accountNumber;
    
        public BankAccount(String accountHolderName, int accountNumber) {
            this.accountHolderName = accountHolderName;
            this.accountNumber = accountNumber;
        }
    
        public String getAccountHolderName() {
            return accountHolderName;
        }
    
        public int getAccountNumber() {
            return accountNumber;
        }
}
