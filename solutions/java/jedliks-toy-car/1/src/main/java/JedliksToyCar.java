public class JedliksToyCar {
    int distanceDriven = 0;
    int batteryPercentage = 100;

    public static JedliksToyCar buy() {
        JedliksToyCar car =new JedliksToyCar();
        car.distanceDriven = 0;
        car.batteryPercentage = 100;
        return car;
    }

    public String distanceDisplay() {
        return "Driven " + String.valueOf(distanceDriven) + " meters";
    }

    public String batteryDisplay() {
        if (batteryPercentage != 0) return "Battery at " + String.valueOf(batteryPercentage) + "%";
        else return "Battery empty";
    }

    public void drive() {
        if (batteryPercentage > 0) {
            distanceDriven += 20;
            batteryPercentage -= 1;
        }
    }
}
