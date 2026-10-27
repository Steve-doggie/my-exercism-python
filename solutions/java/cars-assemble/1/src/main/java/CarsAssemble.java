public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        if (speed <= 4){
            return speed * 221;
        }
        else if (5 <= speed && speed <= 8){
            return speed * 221 * 0.9;
        }
        else if (speed == 9){
            return speed * 221 * 0.8;
        }
        else if (speed == 10){
            return speed * 221 * 0.77;
        }
        return 0.0;
    }

    public int workingItemsPerMinute(int speed) {
        double perHour = productionRatePerHour(speed);
        double perMinute = perHour / 60;
        return(int) perMinute;
    }
}
