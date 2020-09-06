import java.io.File;
import java.io.PrintWriter;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Main {
	public static void main(String[] args) throws Exception{
		Document doc = Jsoup.connect("https://www.cheatsheet.com/gear-style/20-questions-to-ask-siri-for-a-hilarious-response.html/").timeout(6000).get();
		Elements ele = doc.select("h2");
		PrintWriter pw = new PrintWriter(new File("C:\\Users\\12601\\Downloads\\61questions.csv"));
		StringBuilder sb = new StringBuilder();
		for(Element e : ele)
		{	
			String s = e.text();
			sb.append(s);
			sb.append("\n");
		}
		pw.write(sb.toString());
		pw.close();
	}


}	