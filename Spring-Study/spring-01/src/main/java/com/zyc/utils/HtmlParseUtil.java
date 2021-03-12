package com.zyc.utils;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class HtmlParseUtil {

    public static void main(String[] args) throws IOException {

//        ��ȡ���� https://search.jd.com/Search?keyword=java&enc=utf-8&wq=java&pvid=c247a405d7d34ec891fec7e27dc67adf

//        ����  ajax���ݻ�ȡ����
        String url="https://search.jd.com/Search?keyword=java";

//        ������ҳ��jsҳ����� ==== document
        Document document = Jsoup.parse(new URL(url), 30000);
//        ������js����ʹ�õĴ������ﶼ����ʹ��
        Element j_goodsList = document.getElementById("J_goodsList");

        Elements lis = j_goodsList.getElementsByTag("li");

        for (Element li : lis) {
            String img = li.getElementsByTag("img").eq(0).attr("src");
//            String img = li.getElementsByTag("img").eq(0).attr("source-data-lazy-img src");
            String price = li.getElementsByClass("p-price").eq(0).text();
            String title = li.getElementsByClass("p-name").eq(0).text();

            System.out.println(img);
//            System.out.println(price);
//            System.out.println(title);
        }
    }

}
