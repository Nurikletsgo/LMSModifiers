import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)  {
    /** Circle деген класс тузунуз, анын PI жана radius деген свойствасы, area
     жана circumference деген статик методдору болсун.
     areaны табуу учун: PI * (radius * radius)
     circumferenceти табуу учун PI * 2 * radius деген формулалар колдонулат */

        System.out.println("test");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write the radius : ");
        Circle circle = new Circle (scanner.nextDouble());

        Circle.getArea(circle.getPI(),circle.getRadius());
        System.out.println("Circumference = "+Circle.getCircumference(circle.getPI(), circle.getRadius()));

    }
}