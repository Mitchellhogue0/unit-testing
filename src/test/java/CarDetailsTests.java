import org.junit.Assert;
import org.junit.Test;

public class CarDetailsTests {

    @Test
    public void getCarDetails_GivenValidCar_ReturnsExpectedString(){

        //Arrange
        Car car = new Car();
        car.setMake("Ford");
        car.setModel("Mustang");
        car.setYear("2019");
        car.setColor("Black");

        //Act
        String details = CarUtils.getCarDetails(car);

        //Assert
        Assert.assertEquals("Black 2019 Ford Mustang", details);
    }

    @Test
    public void getCarDetails_GivenNullValues_ReturnErrorString(){
        //Arrange
        Car car = new Car();

        //Act
        String details = CarUtils.getCarDetails(car);

        //Assert
        Assert.assertEquals("Not able to provide details", details);
    }

    @Test
    public void getCarDetails_GivenOneNullValue_ReturnErrorString(){
        //Arrange
        Car car = new Car();
        car.setMake("Ford");
//        car.setModel("Mustang");
        car.setYear("2019");

        //Act
        String details = CarUtils.getCarDetails(car);

        //Assert
        Assert.assertEquals("Not able to provide details", details);
    }

    @Test
    public void getCarDetails_GivenValidCar_ReturnExpectedString(){
        //Arrange
        Car car = new Car();
        car.setMake("Ford");
        car.setModel("Mustang");
        car.setYear("2019");
        car.setMileage(2000);


        //Act
        CarUtils.addToMileage(car, 2000);

        //Assert
        Assert.assertEquals(4000, car.getMileage(), 0D);
    }

    @Test
    public void getCarDetails_GivenValidCar_ReturnExpectedBoolean(){
        //Arrange
        Car car = new Car();
        car.setMake("Ford");
        car.setModel("Mustang");
        car.setYear("2019");
        car.setMileage(2000);


        //Act
        CarUtils.convertToElectric(car, "electric");


        //Assert
        Assert.assertTrue(car.isElectric());
    }

    @Test
    public void getCarDetails_GivenValidCar_ReturnExpectedBooleanCap(){
        //Arrange
        Car car = new Car();
        car.setMake("Ford");
        car.setModel("Mustang");
        car.setYear("2019");
        car.setMileage(2000);


        //Act
        CarUtils.convertToElectric(car, "ELECTRIC");


        //Assert
        Assert.assertTrue(car.isElectric());
    }
}
