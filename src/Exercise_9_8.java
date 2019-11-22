public class Exercise_9_8 {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(3);
        fan1.setRadius(10);
        fan1.setColour("yellow");
        fan1.setOn(true);

        Fan fan2 = new Fan();
        fan2.setSpeed(2);
        fan2.setRadius(5);
        fan2.setColour("blue");
        fan2.setOn(false);

        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
}

class Fan{
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed = SLOW;
    boolean on = false;
    private double radius = 5;
    String colour = "blue";

    Fan(){}

    int getSpeed(){
        return speed;
    }

    void setSpeed(int newSpeed){
        speed = newSpeed;
    }

    boolean getOn(){
        return on;
    }

    void setOn(boolean state){
        on = state;
    }

    double getRadius(){
        return radius;
    }

    void setRadius(double newRadius){
        radius = newRadius;
    }

    String getColour(){
        return colour;
    }

    void setColour(String newColour){
        colour = newColour;
    }

    // Return a description for the fan
    public String toString(){
        if (on)
            return "\nFan speed: " + speed + ", colour: " + colour + ", radius: " + radius;
        else
            return "\nFan is off, colour: " + colour + ", radius: " + radius;
    }
}
