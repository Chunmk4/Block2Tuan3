package Tuan3.Bai2;


class GFG {
    public static void main(String[] args) {

        String s = "";//khởi tạo chuỗi rỗng
        try {
            System.out.println(getLength(s));// được tạo để tính độ dài chuỗi rỗng và in ra màn hình
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught");
        }

        // vì là chuỗi rỗng nên xuất hiện ngoại lệ và đc bắt lại bằng câu lệnh try-catch
        s = "GeeksforGeeks";
        // gán cho chuỗi s giá trị
        try {
            System.out.println(getLength(s));
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught");
        }

        // khi chuỗi khác null mà có giá trị thì khối trên sẽ dùng phương thức getLength(s) trả về độ dài chuỗi
        s = null;
        try {
            System.out.println(getLength(s));
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught");
        }
    }

    // khi chuỗi s là null sẽ xuất hiện ngoại lệ và sẽ đc câu lệnh trên bắt lại và in ra màn hình " IllegalArgumentException caught"
    public static int getLength(String s) {
        if (s == null)
            throw new IllegalArgumentException("The argument cannot be null");
        return s.length();
    }
}
// phương thức getLeangth đc tạo ra để kiểm tra nếu chuỗi là null thì in ra " The argument cannot be null" còn ko phải null thì sẽ in ra
// độ dài chuỗi
