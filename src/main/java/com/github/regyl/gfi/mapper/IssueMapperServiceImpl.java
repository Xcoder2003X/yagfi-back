package com.github.regyl.gfi.mapper;

import com.github.regyl.gfi.dto.github.GithubIssueDto;
import com.github.regyl.gfi.entity.IssueEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
@RequiredArgsConstructor
public class IssueMapperServiceImpl implements Function<GithubIssueDto, IssueEntity> {

    @Override
    public IssueEntity apply(GithubIssueDto dto) {
        return IssueEntity.builder()
                .sourceId(dto.getId())
                .title(dto.getTitle())
                .url(dto.getUrl())
                .updatedAt(dto.getUpdatedAt())
                .repository(null) //FIXME
                .text(dto.getBodyText())
                .build();
    }
}
