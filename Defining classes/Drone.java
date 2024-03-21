import java.util.Scanner;

public class Drone {

    boolean isOnFlight;
    boolean turnleft;
    boolean turnright;

    void turnOn() {
        isOnFlight = true;
        System.out.println("The drone is flying " + isOnFlight);
    }

    void turnLeft() {
        turnleft = true;
        int anglesleft = Integer.parseInt(scanner.nextLine());
        System.out.println("The drone is going left " + turnleft);
    }

    void turnRight() {
        turnright = true;
        int anglesright = Integer.parseInt(scanner.nextLine());
        System.out.println("The drone is going right " + turnright);
    }

    void flyForward() {
        boolean turingright = true; // You had a typo here (turingright instead of turnright)
        int speedforward = Integer.parseInt(scanner.nextLine());
        System.out.println("The drone is going forward " + speedforward);
    }

    void flyBackward() {
        boolean turingright = true; // You had a typo here (turingright instead of turnright)
        int speedbackward = Integer.parseInt(scanner.nextLine());
        System.out.println("The drone is going backward " + speedbackward);
    }

    void turnOff() {
        isOnFlight = false; // You had isOn instead of isOnFlight
        System.out.println("The drone is on the land " + isOnFlight);
    }
}

class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // create objects
        Drone quadrocopter = new Drone();
        Drone trandrone = new Drone();

        quadrocopter.turnOn();
        quadrocopter.turnLeft();
        int angleleft = Integer.parseInt(scanner.nextLine());

        trandrone.turnOff();
    }
}
