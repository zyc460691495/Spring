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

//        获取请求 https://search.jd.com/Search?keyword=java&enc=utf-8&wq=java&pvid=c247a405d7d34ec891fec7e27dc67adf

//        联网  ajax数据获取不到
        String url="https://search.jd.com/Search?keyword=java";

//        解析网页，js页面对象 ==== document
        Document document = Jsoup.parse(new URL(url), 30000);
//        所有在js中能使用的代码这里都可以使用
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
