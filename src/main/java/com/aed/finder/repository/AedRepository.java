package com.aed.finder.repository;

import com.aed.finder.domain.Aed;
import com.aed.finder.repository.querydsl.AedCustomRepository;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AedRepository extends
        JpaRepository<Aed, Long>,
        AedCustomRepository {

}
