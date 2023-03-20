package com.dayone.persist.repository;

import com.dayone.persist.entity.CompanyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CompanyRepository extends JpaRepository<CompanyEntity, Long> {
    boolean existsByTicker(String ticker);
    Optional<CompanyEntity> findByName(String name);//optional 로 감싸서 nullpointException 방지

}
