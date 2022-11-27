package com.aed.finder.dto;

import com.aed.finder.domain.Aed;
import lombok.Data;


@Data
public class AedResponseDto {
    private String name;
    private Double lat;
    private Double lon;
    private String local;

    protected AedResponseDto(){}

    private AedResponseDto(String name, Double lat, Double lon, String local) {
        this.name = name;
        this.lat = lat;
        this.lon = lon;
        this.local = local;
    }

    public static AedResponseDto of(String name, Double lat, Double lon, String local){
        return new AedResponseDto(name, lat, lon, local);
    }

    public static AedResponseDto from(Aed aed){
        return AedResponseDto.of(aed.getName(), aed.getLat(), aed.getLon(), aed.getLocal());
    }
}
