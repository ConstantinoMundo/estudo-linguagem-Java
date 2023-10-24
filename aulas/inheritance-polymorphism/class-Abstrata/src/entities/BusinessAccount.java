package entities;

public class BusinessAccount extends Account {

    private Double loanLimit;

    public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void stLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public double  loan(Double amount) {
        if (amount <= loanLimit) {
            balance += amount - 10.0;
        }

        return balance;
    }

}
