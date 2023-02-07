public class RectangleTester {
    public static void main(String[] args) {
        //test your rectangle here
        Rectangle rec1 = new Rectangle(5, 10);
        System.out.println(rec1);
        rec1.setWidth(4);
        rec1.setHeight(15);
        System.out.println(rec1);
        rec1.calculateArea();
        System.out.println(rec1.getArea());
        rec1.calculatePerimeter();
        System.out.println(rec1.getPerimeter());
        rec1.resetRectangle(rec1);
        System.out.println(rec1);
    }
}
