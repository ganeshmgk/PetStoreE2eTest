package api.endPoints.petEndPoints;

import api.endPoints.Routes;
import api.payLoads.petPayLoads.Pet;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class PetEndPointsBaseTest {

    public static Response addPet(Pet payload){
        return
            given()
                .contentType("application/json")
                .header("apiKey", Routes.apiKey)
                .body(payload)
            .when()
                .post(Routes.add_pet_url)
            .then()
                .assertThat().statusCode(200)
                .extract().response();
    }

    public static Response deletePet(long petId){
       return
        given()
                .contentType("application/json")
                .header("apiKey", Routes.apiKey)
                .pathParam("petId",petId)
        .when()
                .delete(Routes.deletePet_uri)
        .then()
                .log().all()
                .extract()
                .response();
    }

    public static Response updatePet(Pet payLoad){
        return
           given()
                .contentType("application/json")
                .header("apiKey", Routes.apiKey)
                .body(payLoad)
        .when()
                .put(Routes.updatePet_uri)
        .then()
                .assertThat()
                .statusCode(200)
                .extract().response();
    }

    public static Response getPetById(long petId){
        return
                given()
                        .contentType("application/json")
                        .header("apiKey", Routes.apiKey)
                        .pathParam("petId",petId)
                .when()
                        .get(Routes.getPetById_uri)
                .then()
                        .assertThat().statusCode(200)
                        .extract().response();
    }
}
