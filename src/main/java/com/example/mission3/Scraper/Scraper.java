package com.example.mission3.Scraper;

import com.example.mission3.model.Company;
import com.example.mission3.model.ScrapedResult;

public interface Scraper {
    ScrapedResult scrap(Company company);
    Company scrapCompanyByTicker(String ticker);
}
