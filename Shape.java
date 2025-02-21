package rikkei.academy;

public class Shape {
    private String color = "green";
    private boolean filled = true;

    public double getArea() {
        return 0;
    }

    public Shape() {
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String toString() {
        return "A shape with color of "
                + getColor()
                + " and "
                +  (filled ? "filled" : "not filled");
    }
}
