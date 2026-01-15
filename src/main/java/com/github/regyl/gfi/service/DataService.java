package com.github.regyl.gfi.service;

import com.github.regyl.gfi.controller.dto.github.IssueData;
import com.github.regyl.gfi.controller.dto.request.DataRequestDto;
import com.github.regyl.gfi.controller.dto.response.DataResponseDto;
import com.github.regyl.gfi.model.IssueTables;

import java.util.Set;

public interface DataService {

    void save(IssueData response, IssueTables table);

    DataResponseDto findAllIssues(DataRequestDto requestDto);

    Set<String> findAllLanguages();
}
