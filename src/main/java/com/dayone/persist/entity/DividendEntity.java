package com.dayone.persist.entity;

import com.dayone.model.Dividend;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity(name="DIVIDEND")
@Getter
@ToString
@NoArgsConstructor
@Table(
        uniqueConstraints = {
                @UniqueConstraint(
                        columnNames = {"companyId","date"}//unique key
                )//복합 컬럼 지정
        }
)
public class DividendEntity { //배당금 중복 스케쥴링 방지를 위한 복합 unique key 설정
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private Long companyId;
    private LocalDateTime date;
    private String dividend;
    public DividendEntity(Long companyId, Dividend dividend){
        this.companyId = companyId;
        this.date = dividend.getDate();
        this.dividend = dividend.getDividend();
    }
}
