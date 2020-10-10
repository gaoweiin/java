class Book {
    String title;
    int pageNumber;
    String type;

    Book(String title, int pageNumber) {
        type = "计算机";
        this.title = title;
        this.pageNumber = pageNumber;
    }

    Book(String title, int pageNumber, String type) {
        this.type = type;
        this.title = title;
        this.pageNumber = pageNumber;
    }

    void detail() {
        if (pageNumber < 201) {
            System.out.println("页数少");
        } else {
            System.out.println("名称:" + title + "\n页数:" + pageNumber + "\n种类:" + type);
        }
    }
}

class Max {

    void max(int a, int b, int c) {

        System.out.println(Math.max(a, Math.max(c, b)));

    }
    void max(double a, double b, double c) {

        System.out.println(Math.max(a, Math.max(c, b)));

    }
}
public class 方法重载 {
    public static void main(String[] args) {
        Book a = new Book("as",12,"ag");
        a.detail();
        Book b = new Book("gadh",2000,"ag");
        b.detail();
        Max m = new Max();
        m.max(10, 12, 15);
        m.max(10.5, 12, 15.5);
    }
}
