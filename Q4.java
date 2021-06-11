//Given four points in the plane, write a program to check if they are the vertices of a rectangle.
package challenge;

public class Q4 {
    public static boolean IsRectangle(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        x2 -= x1;
        x3 -= x1;
        x4 -= x1;
        y2 -= y1;
        y3 -= y1;
        y4 -= y1;
        return (x2 + x3 == x4 && y2 + y3 == y4 && x2 * x3 == -y2 * y3)
                || (x2 + x4 == x3 && y2 + y4 == y3 && x2 * x4 == -y2 * y4)
                || (x3 + x4 == x2 && y3 + y4 == y2 && x3 * x4 == -y3 * y4);
    }

    public static void main(String[] args) {
        System.out.println(IsRectangle(2, 4, 4, 2, 7, 5, 5, 7));
        System.out.println(IsRectangle(7, 0, 7, 3, 10, 0, 10, 2));
    }
}
