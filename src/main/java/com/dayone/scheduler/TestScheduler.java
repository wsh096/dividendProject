package com.dayone.scheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class TestScheduler {
    @Scheduled(cron = "0/5 * * * * *")
    public void test(){
        System.out.println("now -> " + System.currentTimeMillis());
    }
    @Scheduled(cron="* * 1 * * * ") // 배당금 정보가 중복으로 저장되는 것 막아주기
    public void yahooFinanceScheduling(){
        //저장된 회사 목록을 조회

        //회사마다 배당금 정보를 새로 스크래핑

        //스크패링한 배당금 정보 중 데이터베스에 없는 값은 저장
    }
}
