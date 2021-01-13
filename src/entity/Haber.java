package entity;

import java.util.List;

public class Haber {
    private String title;
    private String Description;
    private List<Haber> newList;
public Haber(){

}

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return this.Description;
    }

    public void setDescription(String description) {
        this.Description = description;
    }

    public List<Haber> getNewList() {
        return this.newList;
    }

    public void setNewList(List<Haber> newList) {
        this.newList = newList;
    }

    @Override
    public String toString() {
        return this.title;
    }
}

