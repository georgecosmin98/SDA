public class Muchie {

    private int x, y, cost;

    public Muchie(int x, int y, int cost) {
        this.x = x;
        this.y = y;
        this.cost = cost;
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

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }


    public String toString() {
        return "(" + x + "," + y + "," + cost + ")";
    }
}
