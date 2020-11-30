package com.company;

public class Triangle extends Figure {
    private int c;

    Triangle(int a, int b, int c){
        super(a,b);
        this.c = c;
    }

    @Override
    public void vol() {
        double p = (getA()+getB()+c)/2;
        System.out.println(Math.sqrt(p*(p-getA())*(p-getB())*(p-c)));
    }
}
