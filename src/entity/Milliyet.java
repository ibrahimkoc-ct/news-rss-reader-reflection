package entity;

import RssReader.RssReader;

import java.util.List;

public class Milliyet extends HaberWeb {
    public Milliyet(){
        this.setName("Milliyet");
        this.setUrlRss("https://www.milliyet.com.tr/rss/rssnew/dunyarss.xml");
    }
    @Override
    public List<Haber> getDesciption() {
        return RssReader.getRss(this.getUrlRss());
    }
}
