package lr10;

import org.jsoup.nodes.*;
import org.jsoup.select.Elements;
import org.jsoup.Jsoup;

public class LinksParser {
    public static void main(String[] args) {
        String url="https://itlearn.ru/first-steps";
        try {
            Document doc = Jsoup.connect(url).get();
            Elements links = doc.select("a[href]");
            for (Element elementLinkElement : links) {
                System.out.println(elementLinkElement.attr("abs:href"));
                
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
