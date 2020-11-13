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
        System.out.println("\n余额: "+balance);
    }

    void 支出out(double money) throws BallanceNotEnoughException {
        
        if (balance < money) {
            throw new BallanceNotEnoughException("钱不够");
        } else {
            balance -= money;
            System.out.println("\n余额:"+balance);
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
        } finally {
            System.out.println("End");
        }

    }
}
