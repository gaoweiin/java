package D1113;

class Goods {
    boolean isDanger;
    String name;

    void setIsDanger(boolean boo) {
        this.isDanger = boo;
    }

    boolean isDanger() {
        return isDanger;
    }

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }
}

class DangerException extends Exception {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    String message;

    public DangerException(String message) {
        this.message = message;
    }

    String toShow() {
        return message;
    }
}

class Machine {
    void checkBag(Goods goods) throws DangerException {
        if (goods.isDanger()) {
            throw new DangerException("属于危险品！");
        }
    }
}

public class Check {
    public static void main(String[] args) {
        String name[] = { "苹果", "炸药", "西服", "硫酸", "手表", "硫磺" };
        boolean isdanger[] = { false, true, false, true, false, true };
        Goods[] goods = new Goods[6];
        Machine checkMachine = new Machine();
        for (int i = 0; i < 6; i++) {
            goods[i] = new Goods();
            goods[i].setName(name[i]);
            goods[i].setIsDanger(isdanger[i]);
            try {
                checkMachine.checkBag(goods[i]);
                System.out.println(goods[i].getName() + "不属于危险品");
            } catch (DangerException e) {
                System.out.println(goods[i].getName() + e.toShow());
            }
        }

    }
}
