package com.aed.finder.service;

import com.aed.finder.domain.Aed;
import com.aed.finder.dto.AedRequestDto;
import com.aed.finder.repository.AedRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class AedService {

    private final AedRepository aedRepository;

    //두 지점 간의 거리 계산
    public static double getDistance(double lat1, double lon1, double lat2, double lon2) {
        double dLat = Math.toRadians(lat2 - lat1);
        double dLon = Math.toRadians(lon2 - lon1);

        double a = Math.sin(dLat/2)* Math.sin(dLat/2)+ Math.cos(Math.toRadians(lat1))* Math.cos(Math.toRadians(lat2))* Math.sin(dLon/2)* Math.sin(dLon/2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
        double d = 6371 * c * 1000;    // Distance in m
        return d;
    }

    public List<Aed> findAed(AedRequestDto dto){
        //현재 위도 좌표 (y 좌표)
        double nowLatitude = dto.getLat();
        //현재 경도 좌표 (x 좌표)
        double nowLongitude = dto.getLon();

        //m당 y 좌표 이동 값
        double mForLatitude = (1 /(6371 * 1 *(Math.PI/ 180)))/ 1000;
        //m당 x 좌표 이동 값
        double mForLongitude = (1 /(6371 * 1 *(Math.PI/ 180)* Math.cos(Math.toRadians(nowLatitude))))/ 1000;

        //현재 위치 기준 검색 거리 좌표
        double maxY = nowLatitude + (dto.getRadius() * mForLatitude);
        double minY = nowLatitude - (dto.getRadius() * mForLatitude);
        double maxX = nowLongitude + (dto.getRadius() * mForLongitude);
        double minX = nowLongitude - (dto.getRadius() * mForLongitude);

//        //해당되는 좌표의 범위 안에 있는 가맹점
        List<Aed> aeds = aedRepository.findbyAeds(minX, maxX, minY, maxY);
        List<Aed> resultAeds = new ArrayList<>();

//        //정확한 거리 측정
        for(Aed aed : aeds) {
            double distance = getDistance(nowLatitude, nowLongitude, aed.getLat(), aed.getLon());
            if(distance < dto.getRadius()) {
                resultAeds.add(aed);
            }
        }
        return resultAeds;
    }
}

