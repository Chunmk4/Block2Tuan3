package Tuan3.Bai3;

class GFG {
    public static void main(String[] args) {

        String ptr = null;

        try {

            if ("gfg".equals(ptr))
                System.out.print("Same");
            else
                System.out.print("Not Same");
        } catch (NullPointerException e) {
            System.out.print("Caught NullPointerException");
        }
    }
}
// Sử dụng nhiều try-catch
