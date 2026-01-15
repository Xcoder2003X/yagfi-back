package com.github.regyl.gfi.controller;

import com.github.regyl.gfi.controller.dto.request.DataRequestDto;
import com.github.regyl.gfi.controller.dto.response.DataResponseDto;
import com.github.regyl.gfi.service.DataService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequiredArgsConstructor
@RequestMapping("/issues")
@CrossOrigin(origins = "http://localhost:3000") //TODO temporarily
public class DataController {

    private final DataService dataService;

    @PostMapping
    public DataResponseDto findAll(@RequestBody @Valid DataRequestDto requestDto) {
        return dataService.findAllIssues(requestDto);
    }

    @GetMapping("/languages")
    public Set<String> findAllLanguages() {
        return dataService.findAllLanguages();
    }
}
