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
 
/**第7章 内部类与异常类
课内实践课 练习题

实践课目标：让学生掌握使用try-catch语句进行异常处理
实践要求：
车站检查危险品的设备，如果发现危险品会发出警告。编程模拟设备发现危险品。



2、	编写一个Exception的子类DangerException,该子类可以创建异常对象，该异常对象调用toShow()方法输出“属于危险品”。
属性String message保存异常信息，通过构造方法设置异常信息。

3、	编写一个Machine类，该类的方法checkBag(Goods goods)当发现参数goods是危险品时将抛出DangerException异常。

4、	程序在主类Check的main（）方法中的try-catch语句的try部分让Machine类的实例调用checkBag(Goods goods)方法，如果发现危险品就在catch部分处理危险品（显示“属于危险品！”等信息）。
比如对以下数组元素作为名称的物品进行检查
String name[]= {"苹果","炸药","西服","硫酸","手表","硫磺"};
 */

class DangerException extends Exception {
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
        Machine checkMachine = new Machine();
        Goods[] goods  = new Goods[6];
        for (int i = 0; i < 6; i++) {
            goods[i] = new Goods();
            goods[i].setName(name[i]);
            goods[i].setIsDanger(isdanger[i]);
            try{
                checkMachine.checkBag(goods[i]);
                System.out.println(goods[i].getName()+ "不属于危险品");
            } catch (DangerException e) {
                System.out.println(goods[i].getName()+ e.toShow());
            }
        }
        
        
    }
}
