public class Exercise09_08 {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();

        fan1.setSpeed(fan1.FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);

        System.out.println("Fan 1");
        System.out.println("------------");
        System.out.println(fan1);

        fan2.setSpeed(fan1.MEDIUM);

        System.out.println("\nFan 2");
        System.out.println("------------");
        System.out.println(fan2);
    }
}

class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;

    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int newSpeed) {
        speed = newSpeed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean newOn) {
        on = newOn;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double newRadius) {
        radius = newRadius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String newColor) {
        color = newColor;
    }

    public Fan() {
        speed = SLOW;
        on = false;
        radius = 5;
        color = "blue";
    }

    public String toString() {
        return "Speed: " + speed + "\n" +
            "Color: " + color + "\n" +
            "Radius: " + radius + "\n" +
            (on ? "fan is on" : "fan is off");
    }
}
