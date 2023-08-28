# 배당금 프로젝트
### API 인터페이스의 구조

1. 배당금 조회기능
<br> 추가 API 해당 회사 검색 엔진에
<br> 자동완성 API 구현
2. 회사 리스트 조회
<br> 기능 설명
<br> 여러가지 분류 기준으로 회사들을 분류, 조회
3. 관리자 기능
<br> 배당금 데이터 저장/삭제
4. 회원 기능
<br> Jwt(JavaScript web Token) HS512로 인증 토큰 구현
<br> Read/write로 구분해 일반 회원과 관리자 회원 구현

5. 캐시 구현
<br> redis-server를 활용

6. 기타
   - 예외/로깅 처리

### DB의 구현(H2를 활용)
1. (테이블)회사
- id(PK) Long autoIncrease
- name String
- ticker String unique
2. 배당금
- id(PK) Long autoIncrease
- company_id Long
- date LocalDateTime
- dividend String
