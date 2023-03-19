package com.example.mission3;

import com.example.mission3.Scraper.YahooFinanceScraper;
import com.example.mission3.model.Company;
import lombok.var;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import java.io.IOException;

//@SpringBootApplication
public class Mission3Application {

    public static void main(String[] args) {
       //SpringApplication.run(Mission3Application.class, args);
        YahooFinanceScraper scraper = new YahooFinanceScraper();
       // var result = scraper.scrap(Company.builder().ticker("O").build());
        //var result = scraper.scrapCompanyByTicker("MMM");
        //System.out.println(result);
    }

}
