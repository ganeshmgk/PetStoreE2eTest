package api.payLoads.petPayLoads;

import java.util.ArrayList;
import java.util.List;

public class Pet {

    private int id;
    private String name;
    private String status;
    private Category category;
    private List<PhotoUrls> photoUrls;
    public ArrayList<Tag> tags;


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public Category getCategory() {
        return category;
    }
    public void setCategory(Category category) {
        this.category = category;
    }
    public List<PhotoUrls> getPhotoUrls() {
        return photoUrls;
    }
    public void setPhotoUrls(List<PhotoUrls> photoUrls) {
        this.photoUrls = photoUrls;
    }
    public ArrayList<Tag> getTags() {
        return tags;
    }
    public void setTags(ArrayList<Tag> tags) {
        this.tags = tags;
    }
}
