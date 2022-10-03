public class Point {
    //instance variable
    private int x;
    private int y;
    //constructors
    public Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    public Point(int x)
    {
        this.x = x;
        this.y = x;
    }
    public Point()
    {
        x = 0;
        y = 0;
    }
    //getter method
    public int getX()
    {
        return x;
    }
    public int getY()
    {
        return y;
    }
    //setter method
    public void setX(int newX)
    {
        x = newX;
    }
    public void setY(int newY)
    {
        y = newY;
    }
    //coordinates
    public String coordinate()
    {
        return "(" + x + ", " + y + ")";
    }
    //quadrant
    public String quadrant()
    {
        if (x > 0 && y > 0) {
            return "I";
        }
        if (x < 0 && y > 0){
            return "II";
        }
        if (x < 0 && y < 0) {
            return "III";
        }
        if (x > 0 && y < 0) {
            return "IV";
        }
        if (x == 0 && y == 0) {
            return "on the origin";
        }
        if (x < 0 && y == 0) {
            return "on an axis";
        }
        if (x > 0 && y == 0) {
            return "on an axis";
        }
        if (x == 0 && y > 0) {
            return "on an axis";
        }
        if (x == 0 && y < 0) {
            return "on an axis";
        }
        return null;
    }
}
