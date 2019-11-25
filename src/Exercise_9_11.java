import java.util.Scanner;

public class Exercise_9_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter values for a, b, c, d, e, & f: ");
        LinearEquation linearEquation = new LinearEquation(input.nextDouble(), input.nextDouble(), input.nextDouble(), input.nextDouble(), input.nextDouble(), input.nextDouble());

        if (!linearEquation.isSolvable())
            System.out.println("The equation has no solution");
        else {
            System.out.println("x is: " + linearEquation.getX());
            System.out.println("y is: " + linearEquation.getY());
        }

    }
}

class LinearEquation {
    private double a;
    private double b;
    private double c;
    private double d;
    private double e;
    private double f;

    LinearEquation(double a, double b, double c, double d, double e, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getD() {
        return d;
    }

    public double getE() {
        return e;
    }

    public double getF() {
        return f;
    }

    boolean isSolvable() {
        return (a * d) - (b * c) != 0;
    }

    double getX() {
        return ((e * d) - (b * f)) / ((a * d) - (b * c));
    }

    double getY(){
        return ((a * f) - (e * c)) / ((a * d) - (b * c));
    }
}
