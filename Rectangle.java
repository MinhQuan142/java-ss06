package rikkei.academy;

public class Rectangle extends Shape implements Resizeable {
    private double width = 1.0;
    private double height = 1.0;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }


    public Rectangle(double width, double height, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return (width + height) * 2;
    }
    @Override
    public String toString() {
        return "Hình chữ nhật chiều rộng=" + width + "\n Chiều cao=" + height + "\n Diện tích=" + getArea();
    }

    @Override
    public void resize(double percent) {
        this.width *= (1 + percent / 100);
        this.height *= (1 + percent / 100);
    }


}
