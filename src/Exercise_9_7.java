import java.util.Date;

public class Exercise_9_7 {
    public static void main(String[] args) {
        Account account = new Account(1122,20000);
        account.setAnnualInterestRate(0.045);
        account.withdraw(2500);
        account.deposit(3000);

        System.out.printf("The balance is $%.2f\n", account.getBalance());
        System.out.printf("The monthly interest is $%.2f\n", account.getMonthlyInterest());
        System.out.println("The account was created on " + account.getDateCreated());
    }
}

class Account{
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    private Date dateCreated = new Date();

    Account(){}

    Account(int specifiedId, double initialBalance){
        id = specifiedId;
        balance = initialBalance;
    }

    public int getId(){
        return id;
    }

    public double getBalance(){
        return balance;
    }

    public double getAnnualInterestRate(){
        return annualInterestRate;
    }

    public double getMonthlyInterestRate(){
        return annualInterestRate / 12;
    }

    public double getMonthlyInterest(){
        return (getMonthlyInterestRate() * balance);
    }

    public Date getDateCreated(){
        return dateCreated;
    }

    public void setId(int newId){
        id = newId;
    }

    public void setBalance(double newBalance){
        balance = newBalance;
    }

    public void setAnnualInterestRate(double newAnnualInterestRate){
        annualInterestRate = newAnnualInterestRate;
    }

    public void withdraw(double withdrawal){
        balance -= withdrawal;
    }

    public void deposit(double deposit){
        balance += deposit;
    }
}
