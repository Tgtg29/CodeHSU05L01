import java.text.DecimalFormat;
public class Rectangle { //make public for CS A

    //instance variables
    private double width;
    private double height;
    private double area;
    private double perimeter;


    //default constructor (make public for CS A)

    /**
     * Creates a rectangle with default parameters
     */
    public Rectangle(){
        width = 1.0;
        height = 1.0;
    }

    //overloaded constructor (with parameters)

    /**
     * Creates a Rectangle object with specified width and height
     *
     * @param w width of rectangle
     * @param h height of rectangle
     */
    public Rectangle(double w, double h){
        width = w;
        height = h;
    }

    public Rectangle(double width){
        this.width = width;
    }

    //accessors

    /**
     *
     * @return the width of the rectangle
     */
    public double getWidth(){
        return width;
    }

    public double getHeight(){
        return height;
    }

    public double getArea(){
        return area;
    }

    public double getPerimeter(){
        return perimeter;
    }

    //mutators

    /**
     * Allows the user to change the width of the rectangle
     *
     * @param newWidth desired width
     */
    public void setWidth(double newWidth){
        width = newWidth;
    }

    /**
     * Modifies the height of the rectangle
     * @param newHeight
     */
    public void setHeight(double newHeight){
        height = newHeight;
    }


    //other methods

    /**
     * Calculates area of rectangle
     * @return
     */
    public void calculateArea(){
        area = height*width;
    }

    public void calculatePerimeter(){
        perimeter = 2*height + 2*width;
    }

    //reset rectangle method

    /**
     * @description resets rectangle to a unit rectangle
     *
     * @param rect rectangle object you want to reset
     */
    public void resetRectangle(Rectangle rect){
        rect.width = 1;
        rect.height = 1;
    }
    // does not need an object param here but objects still can be used as a param


    //toString method
    public String toString(){
        DecimalFormat df = new DecimalFormat("#,##");
        return "The height of the rectangle is " + df.format(height) + " and the width is " + df.format(width) + ".";
    }


}