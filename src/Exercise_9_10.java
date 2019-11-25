import java.util.Scanner;

public class Exercise_9_10 {
    public static void main(String[] args) {

        System.out.println("Enter values for a, b and c: ");
        Scanner input = new Scanner(System.in);
        QuadraticEquation quadraticEquation = new QuadraticEquation(input.nextDouble(), input.nextDouble(), input.nextDouble());

        if (quadraticEquation.getDiscriminant() < 0)
            System.out.println("The equation has no roots");
        else if (quadraticEquation.getDiscriminant() == 0)
            System.out.println(quadraticEquation.getRoot1());
        else{
            System.out.println(quadraticEquation.getRoot1());
            System.out.println(quadraticEquation.getRoot2());
        }
    }
}

class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    QuadraticEquation(double newA, double newB, double newC) {
        a = newA;
        b = newB;
        c = newC;
    }

    double getA() {
        return a;
    }

    double getB() {
        return b;
    }

    double getC() {
        return c;
    }

    double getDiscriminant() {
        return Math.pow(b, 2) - (4 * a * c);
    }

    double getRoot1() {
        if (getDiscriminant() < 0)
            return 0;
        else
            return (-b + (Math.pow(Math.pow(b, 2) - (4 * a * c), 0.5))) / (2 * a);
    }

    double getRoot2() {
        if (getDiscriminant() < 0)
            return 0;
        else
            return (-b - (Math.pow(Math.pow(b, 2) - (4 * a * c), 0.5))) / (2 * a);
    }
}