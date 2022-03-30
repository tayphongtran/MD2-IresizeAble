package com.company;

public class Circle extends Hinhhoc implements Resize{
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double Area(){
        return this.radius*2*Math.PI;
    }
    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                "area = " + this.Area() +
                '}';
    }

    @Override
    public void resize(double resize) {
        this.radius *= resize;
    }
}
