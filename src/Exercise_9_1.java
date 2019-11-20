public class Exercise_9_1 {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(4,40);
        Rectangle rectangle2 = new Rectangle(3.5, 35.9);

        System.out.println("The width of rectangle1 is " + rectangle1.width);
        System.out.println("The height of rectangle1 is " + rectangle1.height);
        System.out.println("The area of rectangle1 is " + rectangle1.getArea());
        System.out.println("The perimeter of rectangle1 is " + rectangle1.getPerimeter());

        System.out.println("The width of rectangle2 is " + rectangle2.width);
        System.out.println("The height of rectangle2 is " + rectangle2.height);
        System.out.println("The area of rectangle2 is " + rectangle2.getArea());
        System.out.println("The perimeter of rectangle2 is " + rectangle2.getPerimeter());
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