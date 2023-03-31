package lr10;
import org.jsoup.select.Elements;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class LinksParser {
    public static void main(String[] args) {
        String url="https://itlearn.ru/first-steps";
        out:
        for(int i=0;i<3;i++){
        try {
            get_links(url);
            break out;
        } catch (IOException e) {
            System.out.println("Ошибка при получении HTML-кода страницы: "+e);
            
                System.out.println("Попытка подключения №"+(i+1));
                try {
                    Thread.sleep(5000);    
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
                System.out.println("Подключение не удалось"); 
        }
        }
    }

    public static void get_links (String url) throws IOException {
        Document doc = Jsoup.connect(url).get();
            Elements links = doc.select("a[href]");
            try {
                FileWriter writer = new FileWriter("src/lr10/file.txt");
                BufferedWriter buffer = new BufferedWriter(writer);
    
                for (Element elementLinkElement : links) {
                    buffer.write(elementLinkElement.attr("abs:href"));
                    buffer.newLine();
                }
    
                buffer.close();
            } catch (IOException e) {
                
                e.printStackTrace();
            }
            for (Element elementLinkElement : links) {
                System.out.println(elementLinkElement.attr("abs:href"));
                
            }
    }
}
