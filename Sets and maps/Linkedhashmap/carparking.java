import java.util.*;

public class _01_ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Set<String> cars = new LinkedHashSet<>();
        Set<String> cars1stfloor = new LinkedHashSet<>();
        Set<String> cars2ndfloor = new LinkedHashSet<>();

        while (!input.equals("END")) {
            String[] parts = input.split(", ");
            if (parts.length != 3) {
                System.out.println("Invalid input format!");
                input = scanner.nextLine();
                continue;
            }

            String direction = parts[0];
            String carNumber = parts[1];
            String floor = parts[2];

            if (direction.equals("IN")) {
                cars.add(carNumber);
                if (floor.equals("1stfloor")) {
                    cars1stfloor.add(carNumber);
                } else if (floor.equals("2ndfloor")) {
                    cars2ndfloor.add(carNumber);
                } else {
                    System.out.println("UNKNOWN FLOOR: " + floor);
                }
            } else if (direction.equals("OUT")) {
                cars.remove(carNumber);
                cars1stfloor.remove(carNumber);
                cars2ndfloor.remove(carNumber);
            } else {
                System.out.println("UNKNOWN DIRECTION: " + direction);
            }

            input = scanner.nextLine();
        }

        if (cars.isEmpty()) {
            System.out.println("Parking Lot is Empty");
        } else {
            System.out.println("Cars currently in parking lot:");
            for (String car : cars) {
                System.out.println(car);
            }

            System.out.println("\n1st Floor Cars: " + cars1stfloor);
            System.out.println("2nd Floor Cars: " + cars2ndfloor);
        }
    }
}
