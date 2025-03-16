package bai4;

import bai3.Animal;

public class Circle extends Shape {
    private double radius;

    public Circle(){

    }

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double area(){
        return Math.PI * radius * radius;
    }
}
