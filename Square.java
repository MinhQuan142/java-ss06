package rikkei.academy;

public class Square extends Rectangle implements Resizeable {
    private  double side;

    public Square() {
    }

    public Square(double side) {
        super(side, side);
        this.side = side;
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return this.side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    public void setHeight(double height) {
        setSide(height);
    }


    @Override
    public void resize(double percent) {
        this.side =this.side + (this.side * percent / 100);
    }

    @Override
    public String toString() {
        return "Hình vuông có cạnh: " + getSide() + "\n Diện tích=" + getArea();
    }

}
