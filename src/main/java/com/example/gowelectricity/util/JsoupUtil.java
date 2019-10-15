package com.example.gowelectricity.util;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 * @ClassName JsoupUtil
 * @Author lzn
 * @DATE 2019/10/15 11:30
 * 解析html
 */
public class JsoupUtil {

    public static String analyHtml(String html){
        if(null == html || html.equals("")){
            return null;
        }

        try{
            Document document = Jsoup.parse(html);
            Elements elements = document.getElementsByTag("input");
            for(Element element : elements){
                System.err.println(element.getElementsByAttributeValue("",""));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
