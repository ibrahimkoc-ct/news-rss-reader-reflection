package entity;

import entity.Haber;

import java.util.List;

public abstract class HaberWeb {
    private String name;
    private String urlRss;
    public HaberWeb(){

    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrlRss() {
        return this.urlRss;
    }

    public void setUrlRss(String urlRss) {
        this.urlRss = urlRss;
    }
    public abstract List<Haber> getDesciption();

    @Override
    public String toString() {
        return this.name;
    }
}
