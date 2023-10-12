package api.tests.petTests;

import api.endPoints.petEndPoints.PetEndPointsBaseTest;
import api.payLoads.petPayLoads.Category;
import api.payLoads.petPayLoads.Pet;
import api.payLoads.petPayLoads.PhotoUrls;
import api.payLoads.petPayLoads.Tag;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class PetTests extends PetEndPointsBaseTest {
Pet petPayLoad;

@BeforeClass
    public void setupData(){

    petPayLoad = new Pet();
    petPayLoad.setId(992);
    petPayLoad.setName("Bheem");
    petPayLoad.setStatus("Active");

    Tag tags = new Tag();
    tags.setId(1231);
    tags.setName("Bheem1");

    Tag tags1 = new Tag();
    tags1.setId(1232);
    tags1.setName("Bheem2");

    ArrayList al = new ArrayList();
    al.add(tags);
    al.add(tags1);

    petPayLoad.setTags(al);

    Category category = new Category();
    category.setId(9);
    category.setName("DaburMan");
    petPayLoad.setCategory(category);

// TODO implement this piece of request in payload
/*   PhotoUrls photoUrls = new PhotoUrls();
    photoUrls.setPhotoUrl("BheemPhoto1");
    photoUrls.setPhotoUrl("BheemPhoto2");
    List pl = new ArrayList();
    pl.add(photoUrls);
    petPayLoad.setPhotoUrls(pl);*/
}

  @Test
  public void addPetTest(){
      Response resp = PetEndPointsBaseTest.addPet(petPayLoad);
      resp.then().log().all();
      Assert.assertEquals(resp.statusCode(), 200);
  }
}
