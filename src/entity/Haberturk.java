package entity;

import RssReader.RssReader;

import java.util.List;

public class Haberturk extends HaberWeb {
    public Haberturk(){
        this.setName("Haberturk");
        this.setUrlRss("https://www.haberturk.com/rss/manset.xml");
    }
    @Override
    public List<Haber> getDesciption() {
        return RssReader.getRss(this.getUrlRss());
    }
}
