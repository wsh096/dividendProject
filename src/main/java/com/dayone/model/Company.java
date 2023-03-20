package com.dayone.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor //여기 빌더 쓰면 에러남
@Builder
public class Company {
 private String ticker;
 private String name;
}
