package api.tests.petTests.dataProviders;

import api.payLoads.petPayLoads.Tag;
import org.testng.annotations.DataProvider;
import api.payLoads.petPayLoads.Pet;

import java.util.ArrayList;
import java.util.List;

public class PetDataProvider {
    @DataProvider(name = "addPetData")
    public static Object[][] addPetData(){
            Pet pet = new Pet();
            pet.setId(123);
            pet.setName("Bheem");
            pet.setStatus("Active");

            Tag tags = new Tag();
            tags.setId(1231);
            tags.setName("Bheem1");


        return new Object[][]{
        /*        Pet(    1,
                        "Root1",
                        "Active",
                        new Category(101, "Category1"),
                        new PhotoUrls(),
                        new Tags()
                )*/


        };
                //,
               // { Pet(2, "Root2", "Inactive", createCategoryObject(102, "Category2"), createPhotoUrls(), createTags()) },
                // Add more test data as needed
        }
    }

/*
 @DataProvider(name = "rootTestData")
    public static Object[][] rootTestData() {
        return new Object[][] {
            { createRootObject(1, "Root1", "Active", createCategoryObject(101, "Category1"), createPhotoUrls(), createTags()) },
            { createRootObject(2, "Root2", "Inactive", createCategoryObject(102, "Category2"), createPhotoUrls(), createTags()) },
            // Add more test data as needed
        };
    }

*/
