package ch13javalang;

/*
Override하지 않은 오리지날 equals()는 객체의 주소 비교를 한다.
 */
public class EqualsDemo {
    public static void main(String[] args) {
        Point original = new Point(30, 100);
        Point target = new Point(30, 100);
        System.out.println(original.equals(target));
    }
}

class Point extends Object {
    private int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj.hashCode() == this.hashCode()) {
            return true;
        }

        if (obj instanceof Point) {
            Point other = (Point) obj;
            return this.x == other.x && this.y == other.y;
        }

        return false;
    }

    @Override
    public String toString() {
        return String.format("(x, y) = (%d, %d)%n", this.x, this.y);
    }
}