package Collectors;

public class Account {
    private  long balance;
    private String number;

    public Account(long balance, String number) {
        this.balance = balance;
        this.number = number;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
