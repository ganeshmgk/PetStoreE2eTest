package api.payLoads.petPayLoads;

import java.util.ArrayList;
import java.util.List;

public class Pet {

    private long id;
    private String name;
    private String status;
    private Category category;
    private ArrayList<PhotoUrls> photoUrls;
    public ArrayList<Tag> tags;


    public long getId() {
        return id;
    }
    public void setId(long id) {
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
    public ArrayList<PhotoUrls> getPhotoUrls() {
        return photoUrls;
    }
    public void setPhotoUrls(ArrayList<PhotoUrls> photoUrls) {
        this.photoUrls = photoUrls;
    }
    public ArrayList<Tag> getTags() {
        return tags;
    }
    public void setTags(ArrayList<Tag> tags) {
        this.tags = tags;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", status='" + status + '\'' +
                ", category=" + category +
                ", photoUrls=" + photoUrls +
                ", tags=" + tags +
                '}';
    }
}
