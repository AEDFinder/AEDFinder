package com.aed.finder.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Entity
public class Aed {
    @Id
    private Long id;
    private String name;
    private String postNumber1;
    private String postNumber2;
    private String manager;
    private String managerNumber;
    private String agencyNumber;
    private String local;
    private String manufacturing;
    private String agencyName;
    private String agencyAddress;
    private Double lat;
    private Double lon;


    protected Aed() {}

    public Aed(String name, String postNumber1, String postNumber2, String manager,
               String managerNumber, String agencyNumber, String local,
               String manufacturing, String agencyName, String agencyAddress, Double lat, Double lon) {
        this.name = name;
        this.postNumber1 = postNumber1;
        this.postNumber2 = postNumber2;
        this.manager = manager;
        this.managerNumber = managerNumber;
        this.agencyNumber = agencyNumber;
        this.local = local;
        this.manufacturing = manufacturing;
        this.agencyName = agencyName;
        this.agencyAddress = agencyAddress;
        this.lat = lat;
        this.lon = lon;
    }
}