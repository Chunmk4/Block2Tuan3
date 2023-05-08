package Tuan3.Bai1;

public class Triangle {
    private int side1;
    private int side2;
    private int side3;

    public Triangle(int s1, int s2, int s3) throws IllegalTriangleException {
        if (s1 <= 0 || s2 <= 0 || s3 <= 0) {
            throw new IllegalTriangleException("Side length cannot be negative or zero");
        } else if (s1 + s2 <= s3 || s2 + s3 <= s1 || s1 + s3 <= s2) {
            throw new IllegalTriangleException("Illegal sides for a triangle");
        } else {
            side1 = s1;
            side2 = s2;
            side3 = s3;
        }
    }

    public void printTriangle() {
        System.out.println("Side 1: " + side1);
        System.out.println("Side 2: " + side2);
        System.out.println("Side 3: " + side3);
    }

    public static void main(String[] args) {
        try {
            Triangle t = new Triangle(-1, 3, 4);
            t.printTriangle();
        } catch (IllegalTriangleException e) {
            System.out.println(e.getMessage());
        }
    }
}
