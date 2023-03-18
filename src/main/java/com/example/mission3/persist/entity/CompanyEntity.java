package com.example.mission3.persist.entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity(name ="COMPANY")
@Getter
@ToString
@NoArgsConstructor
public class CompanyEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//자동 증가
    private Long id;
    @Column(unique = true)//겹치면 안 되서 unique 속성 부여
    private String ticker;
    private String name;
}
