package api.tests.userTests;

import api.endPoints.userEndPoints.UserEndPoints;
import api.payLoads.userPayLoads.User;
import com.github.javafaker.Faker;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class UserTests {

    Faker faker;
    User userPayLoad;

   /* @BeforeClass
    public void setupData(){
        faker = new Faker();
        userPayLoad = new User();

        userPayLoad.setId(faker.idNumber().hashCode());
        userPayLoad.setUserName(faker.name().username());
        userPayLoad.setFirstName(faker.name().firstName());
        userPayLoad.setLastName(faker.name().lastName());
        userPayLoad.setEmail(faker.internet().safeEmailAddress());
        userPayLoad.setPassword(faker.internet().password(5,10));
        userPayLoad.setPhone(faker.phoneNumber().cellPhone());

    }

    @Test
    public void testCreateUser(){
        Response response = UserEndPoints.createUser(userPayLoad);
        response.then().log().all();
        Assert.assertEquals(response.getStatusCode(), 200);
    }

    @Test
    public void getUserByName(){
        Response response = UserEndPoints.getUser(this.userPayLoad.getUserName());
        response.then().log().all();
        //User user = response.as(User.class);
        System.out.println("----->" + this.userPayLoad.getUserName());
        assertEquals(response.statusCode(), 404);
    }*/

}
