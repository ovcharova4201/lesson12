package com.company;

public class Figure {
    private int a;
    private int b;

    public Figure() {
    }

    public Figure(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public void vol(){
        System.out.println(a*b);
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}
