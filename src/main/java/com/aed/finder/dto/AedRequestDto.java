package com.aed.finder.dto;

import lombok.Data;
import lombok.ToString;

@ToString
@Data
public class AedRequestDto {
    private Double lat;
    private Double lon;
    private Integer radius;
}
