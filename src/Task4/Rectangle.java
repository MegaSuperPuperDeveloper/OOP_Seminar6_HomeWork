package Task4;

// 4) Переписать код в соответствии с Liskov Substitution Principle:
public class Rectangle extends Square {

    private int height;

    public Rectangle(int width, int height) {
        super(width);
        this.height = height;
    }


    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return super.width;
    }

    public void setWidth(int width) {
        super.width = width;
    }

}