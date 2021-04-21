package com.example.demo.service;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class NoticeService {
    private static String URL = "https://www.skku.edu/skku/campus/skk_comm/notice01.do?";

    public static List<Notice> getNotice() throws IOException {
        List<Notice> noticeList = new ArrayList<>();
        Document document = Jsoup.connect(URL).get();
        Elements elements = document.select(".board_list").select("tr");

        for (Element element : elements) {
            Elements tds = element.select("td");
            if (tds.first() != null && tds.get(1) != null && tds.get(2) != null && tds.get(3) != null) {
                Notice notice = Notice.builder()
                        .no(Integer.parseInt(tds.first().text()))
                        .title(tds.get(1).text())
                        .date(tds.get(2).text())
                        .views(Integer.parseInt(tds.get(3).text()))
                        .build();
                noticeList.add(notice);
            }
        }

        return noticeList;
    }
}
