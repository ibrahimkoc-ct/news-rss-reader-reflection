package RssReader;

import com.rometools.rome.feed.synd.SyndEntry;
import com.rometools.rome.feed.synd.SyndFeed;
import com.rometools.rome.io.FeedException;
import com.rometools.rome.io.SyndFeedInput;
import com.rometools.rome.io.XmlReader;
import entity.Haber;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class RssReader {



    public static List<Haber> getRss(String getUrl) {
        List<Haber> newList = new ArrayList<>();
        try {
            SyndFeed feed = new SyndFeedInput().build(new XmlReader(new URL(getUrl)));
            System.out.println(feed.getEntries());
            for (SyndEntry syndEntry : feed.getEntries()) {
                Haber haber = new Haber();
                haber.setTitle(syndEntry.getTitle());
                haber.setDescription(syndEntry.getDescription().getValue());
                newList.add(haber);
                System.out.println(syndEntry.getDescription().getValue());

            }

        } catch (FeedException feedException) {
            feedException.printStackTrace();
        } catch (MalformedURLException malformedURLException) {
            malformedURLException.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
return newList;
    }}
