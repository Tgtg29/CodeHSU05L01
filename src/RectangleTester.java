public class RectangleTester {
    public static void main(String[] args) {
        //test your rectangle here
        Rectangle rec1 = new Rectangle(7.45676, 394.488543);
        double expectedPerimeter = 2*7.45676 + 2*394.488543;
        rec1.calculatePerimeter();
        System.out.println(rec1.getPerimeter() == expectedPerimeter);
        System.out.println(rec1.getPerimeter());

    }
}
