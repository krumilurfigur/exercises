/*
program description
date
Gabriel Öberg
 */

class Circle {
    private double radius;

    public Circle() {
        radius = 1.0;
    }

    public Circle(double r) {
        radius = r;
    }

    public double getRadius() {

        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea () {
        return this.radius*this.radius*Math.PI;
    }

    public double getCircumference() {
        return 2*this.radius*Math.PI;
    }

    public String toString() {
        return "Circle[radius=" + this.radius + "]";
    }

}

