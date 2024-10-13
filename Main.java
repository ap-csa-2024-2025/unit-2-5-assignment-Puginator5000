
import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);

    //problem1();

    problem2();

    // System.out.println("Type a side length: ");
    // problem3(sc.nextDouble());
  }

  private static void problem1() {
    Circle circ1 = new Circle(10.1);
    Circle circ2 = new Circle(20.5);
    Circle circ3 = new Circle(14);

    System.out.println(circ1.toString());
    System.out.println(circ2.toString());
    System.out.println(circ3.toString());
  }

  private static void problem2() {
    Scanner sc = new Scanner(System.in);

    System.out.println("Type a number for length and width: ");
    double input1 = sc.nextDouble();

    System.out.println("Type a length: ");
    double input2 = sc.nextDouble();

    System.out.println("Type a width: ");
    double input3 = sc.nextDouble();

    Rectangle rec1 = new Rectangle(input1);
    Rectangle rec2 = new Rectangle(input2, input3);

    System.out.println(rec1.toString());
    System.out.println(rec2.toString());
  }

  private static void problem3(double input) {
    RegularPolygon tri = new RegularPolygon(3, input);
    RegularPolygon square = new RegularPolygon(4, input);

    System.out.println(tri.toString());
    System.out.println(square.toString());

  }
}
