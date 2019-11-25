public class Exercise_9_9 {
    public static void main(String[] args) {
        RegularPolygon regularPolygon1 = new RegularPolygon();
        RegularPolygon regularPolygon2 = new RegularPolygon(6, 4);
        RegularPolygon regularPolygon3 = new RegularPolygon(10, 4, 5.6, 7.8);

        System.out.println(regularPolygon1.getPerimeter());
        System.out.println(regularPolygon1.getArea());
        System.out.println(regularPolygon2.getPerimeter());
        System.out.println(regularPolygon2.getArea());
        System.out.println(regularPolygon3.getPerimeter());
        System.out.println(regularPolygon3.getArea());
    }
}

class RegularPolygon{
    private int n = 3;
    private double side = 1;
    private double x = 0;
    private double y = 0;

    RegularPolygon(){}

    RegularPolygon(int newN, double newSide){
        n = newN;
        side = newSide;
    }

    RegularPolygon(int newN, double newSide, double newX, double newY){
        n = newN;
        side = newSide;
        x = newX;
        y = newY;
    }

    int getN(){
        return n;
    }

    void setN(int newN){
        n = newN;
    }

    double getSide(){
        return side;
    }

    void setSide(double newSide){
        side = newSide;
    }

    double getX(){
        return x;
    }

    void setX(double newX){
        x = newX;
    }

    double getY(){
        return y;
    }

    void setY(double newY){
        y = newY;
    }

    double getPerimeter(){
        return n*side;
    }

    double getArea(){
        return (n*(Math.pow(side,2))/(4*Math.tan(Math.PI/n)));
    }
}