package bai5;

public class Square extends Shape{
    private double side;

    public Square(){

    }

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double area(){
        return side * side;
    }
}
