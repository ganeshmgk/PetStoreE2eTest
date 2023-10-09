package api.endPoints;

import api.payLoads.User;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class UserEndPoints {
    // user api - to read, write, delete and update end points.
    public static Response createUser( User payLoad){
        Response createUserResponse =
        given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(payLoad)
        .when()
                .post(Routes.post_url);
        return createUserResponse;
    }

    public static Response getUser(String userName){
        Response getUserResponse =
            given()
                .pathParam("username", userName)
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
            .when()
                .get(Routes.get_url);

        return getUserResponse;
    }
    public static Response updateUser(String userName, String payLoad){
        Response updateUserResponse =
            given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .pathParam("username", userName)
                .body(payLoad)
            .when()
                .put(Routes.update_url);

        return updateUserResponse;
    }

    public static Response deleteUser(String userName, String payLoad){
        Response deleteUserResponse =
                given()
                        .pathParam("username", userName)
                .when()
                        .delete(Routes.delete_url);

        return deleteUserResponse;
    }
}
