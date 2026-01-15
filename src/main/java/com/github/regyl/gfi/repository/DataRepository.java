package com.github.regyl.gfi.repository;

import com.github.regyl.gfi.controller.dto.request.DataRequestDto;
import com.github.regyl.gfi.controller.dto.response.IssueResponseDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Set;

@Mapper
public interface DataRepository {

    List<IssueResponseDto> findAllIssues(DataRequestDto requestDto);

    Set<String> findAllLanguages();
}
