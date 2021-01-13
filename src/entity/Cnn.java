package entity;
import RssReader.RssReader;

import java.util.List;
public class Cnn extends HaberWeb{
    public Cnn(){
        this.setName("Cnn");
        this.setUrlRss("https://www.cnnturk.com/feed/rss/all/news");
    }
    @Override
    public List<Haber> getDesciption() {
        return RssReader.getRss(this.getUrlRss());
    }
}
