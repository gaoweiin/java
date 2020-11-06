package 作业;

class Circle {
    private double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    double findArea() {
        return (radius * radius * Math.PI);
    }
}

class Cylinder extends Circle {
    private double length;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    double findArea() {
        return (super.findArea() * 2) + ((Math.PI * 2 * getRadius()) * length);
    }

    double findVolume() {
        return (super.findArea() * length);
    }
}

public class D1023 {
    public static void main(String[] args) {
        Cylinder cy = new Cylinder();
        cy.setRadius(5.0);
        cy.setLength(5.0);
        System.out.println(cy.findArea());
        System.out.println(cy.findVolume());
    }
}
