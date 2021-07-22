public class CarUtils {

    public static String getCarDetails (Car car) {

        if (car.getColor() == null || car.getMake() == null ||  car.getModel() == null || car.getYear() == null){
            return "Not able to provide details";
        }

        return car.getColor() + " " + car.getYear() + " " + car.getMake() + " " +  car.getModel();

    }

    public static void addToMileage (Car car, double mileageToAdd) {
        car.setMileage(car.getMileage() + mileageToAdd);
    }

    public static void convertToElectric (Car car, String engineType) {
        if (engineType.contains("electric") || engineType.contains("ELECTRIC")){
            car.setElectric(true);
        }
    }
}
