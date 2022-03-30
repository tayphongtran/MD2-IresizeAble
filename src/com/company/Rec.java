package com.company;

public class Rec extends Hinhhoc implements Resize {
    private int h;
    private int w;

    public Rec() {
    }

    public Rec(int h, int w) {
        this.h = h;
        this.w = w;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public int getW() {
        return w;
    }

    public void setW(int w) {
        this.w = w;
    }

    public int dientichhcn(){
        return this.h*this.w;
    }
    @Override
    public String toString() {
        return "Rec{" +
                "h=" + h +
                ", w=" + w +
                "area = " + this.dientichhcn() +
                '}';
    }

    @Override
    public void resize(double resize) {
        this.h *= resize;
        this.w *= resize;
    }
}
