package com.aed.finder.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QAed is a Querydsl query type for Aed
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QAed extends EntityPathBase<Aed> {

    private static final long serialVersionUID = 1966071011L;

    public static final QAed aed = new QAed("aed");

    public final StringPath agencyAddress = createString("agencyAddress");

    public final StringPath agencyName = createString("agencyName");

    public final StringPath agencyNumber = createString("agencyNumber");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Double> lat = createNumber("lat", Double.class);

    public final StringPath local = createString("local");

    public final NumberPath<Double> lon = createNumber("lon", Double.class);

    public final StringPath manager = createString("manager");

    public final StringPath managerNumber = createString("managerNumber");

    public final StringPath manufacturing = createString("manufacturing");

    public final StringPath name = createString("name");

    public final StringPath postNumber1 = createString("postNumber1");

    public final StringPath postNumber2 = createString("postNumber2");

    public QAed(String variable) {
        super(Aed.class, forVariable(variable));
    }

    public QAed(Path<? extends Aed> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAed(PathMetadata metadata) {
        super(Aed.class, metadata);
    }

}

