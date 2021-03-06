package D1113;

class BallanceNotEnoughException extends Exception {
    /**
     *余额不足
     */
    private static final long serialVersionUID = 1L;

    public BallanceNotEnoughException(String message) {
        super(message);
    }
}

class Account {
    private double balance;

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    void 收入in(double money) {
        balance += money;
        
    }

    void 支出out(double money) throws BallanceNotEnoughException {
        
        if (balance < money) {
            throw new BallanceNotEnoughException("钱不够");
        } else {
            balance -= money;
        }
    }

}

public class TestMoney {
    public static void main(String[] args) {
        Account a = new Account();
        try {
            a.收入in(500);
            a.支出out(1000);
        } catch (BallanceNotEnoughException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println(a.getBalance());
        }

    }
}
