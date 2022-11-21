package com.aed.finder.controller;

import com.aed.finder.dto.AedRequestDto;
import com.aed.finder.dto.AedResponseDto;
import com.aed.finder.service.AedService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/aed")
@RestController
public class AedController {

    private final AedService aedService;

    // Aed 반경 검색
    @GetMapping("/finder")
    public List<AedResponseDto> findAed(AedRequestDto aedRequestDto){
        return aedService.findAed(aedRequestDto).stream().map(AedResponseDto::from).toList();
    }
}
