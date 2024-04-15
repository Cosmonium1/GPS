import java.util.Random;

public class GPSProgram {
    public static void main(String[] args) {
        // Simulate tracking location by updating coordinates over time
        for (int i = 0; i < 10; i++) {
            double latitude = generateRandomCoordinate(-90, 90);
            double longitude = generateRandomCoordinate(-180, 180);
            displayCoordinates(latitude, longitude);
            try {
                Thread.sleep(1000); // Sleep for 1 second (simulating tracking over time)
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    // Display GPS coordinates
    public static void displayCoordinates(double latitude, double longitude) {
        System.out.println("Current GPS Coordinates:");
        System.out.println("Latitude: " + latitude);
        System.out.println("Longitude: " + longitude);
    }
    
    // Generate random coordinates within a specified range
    public static double generateRandomCoordinate(double min, double max) {
        Random rand = new Random();
        return min + (max - min) * rand.nextDouble();
    }
}
