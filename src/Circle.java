public class Circle {
    private final double PI = 3.14;
    private double radius ;


    public Circle(double radius) {
        this.radius = radius;
    }

    public double getPI() {
        return PI;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public static void getArea(double PI, double radius ){
        System.out.println("---------------------------------" +
                          "\nPI = "+PI+
                          "\nRadius = "+radius+
                          "\nArea = "+PI*(radius*radius));
    }
    public static double getCircumference(double PI,double radius){
        return  PI*2*radius;

    }
}

