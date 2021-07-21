import org.junit.Assert;
import org.junit.Test;

public class PersonalUntilTests {

    @Test
    public void getFullName_GivenValidNames_ReturnFullName() {

        //Arrange
        //get your objects and whatnot together

        //Act
        //run the method or methods which you want to test and assign any outputs to variables
        String output = PersonUtils.getFullName("Casey", "Edwards");
        //Assert
        // test whether the outputs meet your expectations
        Assert.assertEquals("Casey Edwards", output);

    }

}
