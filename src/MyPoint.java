public class MyPoint {
    private int x;
    private int y;

    public MyPoint() {
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getXY() {
        int[] xy = {x,y};
        return xy;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return  "(x=" + x +
                ", y=" + y +
                ")";
    }

    public double distance(int x, int y) {
        int xDif = this.x - x;
        int yDif = this.y - y;
        xDif *= xDif;
        yDif *= yDif;
        double d = yDif + xDif;
        d = Math.sqrt(d);
        return d;

    }
}
