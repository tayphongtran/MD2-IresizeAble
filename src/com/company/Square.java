package com.company;

public class Square extends Hinhhoc implements Resize {
    private int h;

    public Square() {
    }

    public Square(int h) {
        this.h = h;

    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public int dientichhv(){
        return this.h*this.h;
    }



    @Override
    public String toString() {
        return "Square{" +
                "h=" + h +
                "area = " + this.dientichhv() +
                '}';
    }

    @Override
    public void resize(double resize) {
        this.h *= resize;
    }
}
