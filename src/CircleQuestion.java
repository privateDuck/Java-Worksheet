import java.io.IOException;
import java.util.Scanner;

public class CircleQuestion extends Question {
    @Override
    public void Run() throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the outer circle");
        double ro = sc.nextDouble();
        System.out.println("Enter the radius of the inner circle");
        double ri = sc.nextDouble();

        Circle c1 = new Circle(ro);
        Circle c2 = new Circle(ri);

        if (ro > ri)
            System.out.printf("Area of the shaded region %f", c1.computeArea() - c2.computeArea());
        else
            System.out.print("Inner radius is larger than outer radius");
    }

    public class Circle{
        double radius;
        Circle(double radius){
            this.radius = radius;
        }
        public double computeArea() {
            return Math.PI * radius * radius;
        }
        public double computePerimeter() {
            return 2 * Math.PI * radius;
        }
        public void setRadius(double radius) {
            this.radius = radius;
        }
    }

}
