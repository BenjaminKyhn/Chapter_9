public class Exercise_9_1 {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(4,40);
        Rectangle rectangle2 = new Rectangle(3.5, 35.9);
    }
}

class Rectangle{
    double width = 1;
    double height = 1;

    Rectangle(){}

    Rectangle(double specifiedWidth, double specifiedHeight){
        width = specifiedWidth;
        height = specifiedHeight;
    }

    double getArea(){
        return width * height;
    }

    double getPerimeter(){
        return width * 2 + height * 2;
    }

}