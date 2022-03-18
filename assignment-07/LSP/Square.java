public class Square implements Shape {

    private int width;
    private int height;

    Square(int side) {
        this.setSide(side);
    }

    public void setWidth(int width) {this.setSide(width);
    }

    public void setHeight(int height) {
        this.setSide(height);
    }

    public void setSide(int side) {
        this.width = side;
        this.height = side;
    }

    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }

    @Override
    public int getArea() {
        return width * height;
    }
}
