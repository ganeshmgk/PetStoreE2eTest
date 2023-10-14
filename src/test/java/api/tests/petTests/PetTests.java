package api.tests.petTests;

import api.endPoints.petEndPoints.PetEndPointsBaseTest;
import api.payLoads.petPayLoads.*;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class PetTests extends PetEndPointsBaseTest {
Pet petPayLoad;

@BeforeClass
    public void setupData(){

    petPayLoad = new Pet();
    petPayLoad.setId(0);
    petPayLoad.setName("Bheem");
    petPayLoad.setStatus("Active");

    Tag tags = new Tag();
    tags.setId(1231);
    tags.setName("Bheem1");

    Tag tags1 = new Tag();
    tags1.setId(1232);
    tags1.setName("Bheem2");

    ArrayList<Tag> al = new ArrayList<>();
    al.add(tags);
    al.add(tags1);

    petPayLoad.setTags(al);

    Category category = new Category();
    category.setId(9);
    category.setName("DaburMan");
    petPayLoad.setCategory(category);

    // TODO implement request in payload
/*   PhotoUrls photoUrls = new PhotoUrls();
    ArrayList pl = new ArrayList();
    pl.add("Photo1");
    pl.add("Photo2");
    petPayLoad.setPhotoUrls(pl);*/
}

  @Test(enabled = true)
  public void addPetTest(){
     Pet addPet = PetEndPointsBaseTest.addPet(petPayLoad)
              .then()
              .extract()
              .response()
              .as(Pet.class);
}

@Test(enabled = true)
    public void deletePet(){

    // add a pet before deleting
    Pet addPetResponse = PetEndPointsBaseTest.addPet(petPayLoad)
            .then()
            .assertThat().statusCode(200)
            .extract()
            .response().as(Pet.class);

    //deleting the details of created pet
    long petId = addPetResponse.getId();
    DeletePetPojo deletePetResponse = PetEndPointsBaseTest.deletePet(petId)
            .then()
            .assertThat().statusCode(200)
            .extract().response().as(DeletePetPojo.class);

    Assert.assertEquals(deletePetResponse.getCode(), 200, "Asserting delete response code");
    Assert.assertEquals(deletePetResponse.getType(),"unknown", "Asserting type in deletePet response");
    Assert.assertEquals(deletePetResponse.getMessage(), String.valueOf(petId), "Asserting message in deletePet response");
}

@Test(enabled = true)
public void updatePetTest(){

    // Adding a Pet
    Pet addPetResponse = PetEndPointsBaseTest.addPet(petPayLoad)
            .then()
            .extract()
            .response()
            .as(Pet.class);

  // Update a Pet
    long petId = addPetResponse.getId();
    petPayLoad.setId(petId);
    petPayLoad.setName("Test12345");
   Pet updatePetResponse =
           PetEndPointsBaseTest.updatePet(petPayLoad)
                   .then()
                   .extract().response().as(Pet.class);
Assert.assertEquals(addPetResponse.getId(), updatePetResponse.getId(),"Asserting Id of add and update calls");
Assert.assertNotEquals(addPetResponse.getName(), updatePetResponse.getName(), "Asserting names are not equal");
}

@Test
    public void getPetByIdTest(){
    // Adding a Pet
    Pet addPetResponse = PetEndPointsBaseTest.addPet(petPayLoad)
            .then()
            .extract()
            .response()
            .as(Pet.class);

    // getPet details by Id
    long petId = addPetResponse.getId();

    Pet getPetResponse = PetEndPointsBaseTest.getPetById(petId)
            .then()
            .extract().response().as(Pet.class);
    Assert.assertEquals(addPetResponse.getId(), getPetResponse.getId(), "Asserting createdId and getId are same");
    }
}
