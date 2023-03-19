package com.dayone.Scraper;

import com.dayone.model.Company;
import com.dayone.model.ScrapedResult;

public interface Scraper {
    ScrapedResult scrap(Company company);
    Company scrapCompanyByTicker(String ticker);
}
