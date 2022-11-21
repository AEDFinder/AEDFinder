package com.aed.finder.repository.querydsl;

import com.aed.finder.domain.Aed;

import java.util.List;

public interface AedCustomRepository {
    List<Aed> findbyAeds(Double minX, Double maxX, Double minY, Double maxY);
}
