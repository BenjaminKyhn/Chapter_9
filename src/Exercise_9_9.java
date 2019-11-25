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

    RegularPolygon(int n, double side){
        this.n = n;
        this.side = side;
    }

    RegularPolygon(int n, double side, double x, double y){
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }

    int getN(){
        return n;
    }

    void setN(int n){
        this.n = n;
    }

    double getSide(){
        return side;
    }

    void setSide(double side){
        this.side = side;
    }

    double getX(){
        return x;
    }

    void setX(double x){
        this.x = x;
    }

    double getY(){
        return y;
    }

    void setY(double y){
        this.y = y;
    }

    double getPerimeter(){
        return n*side;
    }

    double getArea(){
        return (n*(Math.pow(side,2))/(4*Math.tan(Math.PI/n)));
    }
}