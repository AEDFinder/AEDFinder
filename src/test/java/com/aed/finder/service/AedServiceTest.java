package com.aed.finder.service;

import com.aed.finder.domain.Aed;
import com.aed.finder.dto.AedRequestDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AedServiceTest {

    private AedService aedService;

    private AedServiceTest(@Autowired AedService aedService) {
        this.aedService = aedService;
    }

    @Test
    void findAed() {
        AedRequestDto aedRequestDto = new AedRequestDto();
        aedRequestDto.setLat(37.6324548);
        aedRequestDto.setLon(127.0126224);
        aedRequestDto.setRadius(1);
        List<Aed> aeds = aedService.findAed(aedRequestDto);

        for(Aed aed : aeds){
            System.out.println("lon : " + aed.getLon() + ", " + "lat : " + aed.getLat());
        }
    }
}