public class Rectangle extends Shape  {

    private double length, width;


    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
     @Override
     double getPerimeter() {
        return 2 * length + 2 * width;
    }

    @Override
    double getArea() {
        return length * width;
    }



}


