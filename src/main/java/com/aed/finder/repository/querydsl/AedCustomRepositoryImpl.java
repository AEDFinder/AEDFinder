package com.aed.finder.repository.querydsl;

import com.aed.finder.domain.Aed;
import com.aed.finder.domain.QAed;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;

import java.util.List;

public class AedCustomRepositoryImpl extends QuerydslRepositorySupport implements AedCustomRepository {
    public AedCustomRepositoryImpl() {
        super(Aed.class);
    }

    @Override
    public List<Aed> findbyAeds(Double minX, Double maxX, Double minY, Double maxY) {
        QAed qAed = QAed.aed;
        return from(qAed)
                .where(qAed.lat.between(minY, maxY).and
                        (qAed.lon.between(minX, maxX)))
                .fetch();
    }
}
