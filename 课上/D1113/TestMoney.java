package D1113;

class BallanceNotEnoughException extends Exception {
    public BallanceNotEnoughException(String message) {
        super(message);
    }
}

class Account {
    private double balance;

    void 收入in(double money) {
        balance += money;
    }

    void 支出out(double money) throws BallanceNotEnoughException {
        balance -= money;
        if (balance < 0) {
            throw new BallanceNotEnoughException("钱不够");
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
            // TODO: handle exception
            System.out.println(e.getMessage());
        }

    }
}
